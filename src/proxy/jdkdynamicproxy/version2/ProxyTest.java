package proxy.jdkdynamicproxy.version2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


/**
 * 在这里,我们看到下方有一个personAccessHandler,代理对象不应该实现和被代理对象同样的接口吗?
 * 其实最终也是实现同样的接口,但是现在我们利用JDK内置的语法可以使得这个代理动态生成(相当于最终出现了一个
 * 实现了相同接口的对象) 如果这个地方难以理解,不是模式的问题,而是代理的语法问题,可以去参考关于讲Java代理的资料
 * 这里也涉及到了反射的知识
 * 
 * 前面说到,JDK提供的这个动态代理一般是为了控制访问安全的,其实在哪里控制呢?
 * 其实就是在Handler中的invoke()这里控制的,即使是动态生成了一个对象,我们最终也要确定它要执行什么代码。
 * 所以我们必须传进去一个PersonBean的引用,否则没有对象可以执行代码是不行的,所以从模式角度来看,Handler才是真正的代理,虽然没有写任何的代码
 * 
 * 在代码的最下面那个类 我们实现一个不调用PersonBean的一个Handler了,无论代理调用了什么代码,在Handler里面都打印一句 "Talk is cheap,Show me the code!"
 * 
 * 
 * 到这里,JDK动态代理说完了.
 * 
 * 
 * @author 黄二狗
 *
 */
public class ProxyTest {

   public static void main(String[] args) {
	   PersonBean personBean = new Person("黄二狗", 20);
	   PersonAccessHandler personAccessHandler = new PersonAccessHandler(personBean);
	   //这里实现了动态生成代理对象
	   PersonBean personProxy = (PersonBean) Proxy.newProxyInstance(personAccessHandler.getClass().getClassLoader(),
			   personBean.getClass().getInterfaces(), personAccessHandler); 
       
	   String name = personProxy.getName();
       System.out.println("名字:"+name);
       
       System.out.println("==================");
       
       int age = personProxy.getAge();
       System.out.println("年龄:"+age);
       
       System.out.println("==================");
       
       personProxy.printAge();
       
       System.out.println("==================");
       
       personProxy.printName();
       
       System.out.println("========切换处理器========");
       
       //切换处理器
       TalkIsCheapHandler talkIsCheapHandler = new TalkIsCheapHandler(personBean);
       PersonBean personProxy2 = (PersonBean) Proxy.newProxyInstance(talkIsCheapHandler.getClass().getClassLoader(),
			   personBean.getClass().getInterfaces(), talkIsCheapHandler);
       personProxy2.getAge();
       System.out.println("==================");
       
       personProxy2.getName();
       
       System.out.println("==================");
       personProxy2.printAge();
       
       System.out.println("==================");
       personProxy2.printName();
       
   }
}


class PersonAccessHandler implements InvocationHandler {
	 
	private PersonBean personBean;
	
   public PersonAccessHandler(PersonBean personBean) {
		this.personBean = personBean;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		
		 System.out.println("方法:"+method.getName());
		 System.out.println("参数:"+args);
		 
		 
		 Object returnValue = null;
		 
		 /*通过在这里判断实际上调用了什么方法,来达到安全控制的目的,当然我们还可以什么都不做
		 所以安全访问是通过Handler来实现的,其实变的东西也就是在这里了
		  下面这种情况在四种方法调用的时候都采取了行动
		  */
		 String  methodName = method.getName();
		if( methodName.equals("getName")) {
		     System.out.println("调用了getName()方法");
		     returnValue = method.invoke(personBean, args);
		 } else if( methodName.equals("getAge")) {
		     System.out.println("调用了getAge()方法");
		     returnValue = method.invoke(personBean, args);
		 } else if( methodName.equals("printName")) {
		     System.out.println("调用了printName()方法");
		     System.out.println(method.invoke(personBean, args));
		 } else if( methodName.equals("printAge")) {
			 System.out.println("调用了printAge()方法");
			  System.out.println(method.invoke(personBean, args));
		 } 
		 
		 return returnValue;
		
	}  
	
}

class TalkIsCheapHandler implements InvocationHandler {
   private PersonBean personBean;
   
   public TalkIsCheapHandler(PersonBean personBean) {
	  this.personBean = personBean;
}

   /**
    * 在这里我们想如何控制访问都可以,被代理的对象被代理掌控了.
    * 要注意如果代理所调用的某个方法是有返回值的情况的时候,那么一定要在invoke中返回那个类型的返回值,如果为void就返回null,否则会报错
    *
    */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		 System.out.println("方法:"+method.getName());
		 System.out.println("参数:"+args);
		 String message = "Talk is cheap,show me the code!";
		 Object returnValue = null;
		 
		 String  methodName = method.getName();
		 if( methodName.equals("getName")) {
			 System.out.println(message);
		     returnValue = "黄二狗";
		 } else if( methodName.equals("getAge")) {
			 System.out.println(message);
		     returnValue = 20;
		 } else if( methodName.equals("printName")) {
			 System.out.println(message);
		 } else if( methodName.equals("printAge")) {
			 System.out.println(message);
		 } 
		 
		return returnValue;
		 
	}
   
   
}
