package singleton.version1;

/**
 * 
 * 可以很明显的看到,下列的类中多出了一个静态方法来实例化对象,也多出了一个静态的类引用。
 * 单例模式的精髓就在于私有化构造器,然后有一个静态方法来生成对象,但由于静态方法只能访问静态的变量,
 * 所以还有一个静态的该类实例的引用.(把代码理清楚了,这些都能明白)
 * 
 * 在下列的例子中,我们使用延迟加载的方式来生成对象.
 * 所谓的延迟加载: 就是在用户准备创建该对象的使用才创建。
 *
 * 非延迟加载的例子(直接在类加载的时候生成了一个对象,后面还会看到这个例子)：
 *
 * class ClassHaveOneStaticMethodToInitialObject {
 *   private static ClassHaveOneStaticMethodToInitialObject singleInstance = new 
 *   ClassHaveOneStaticMethodToInitialObject();
 * }
 * 
 * 接下来,我们会使用一个测试代码来验证是否为单例
 * 理清思路,再看类 SingletonTest
 * 
 * @author 黄二狗
 *
 */
public class ClassHaveOneStaticMethodToInitialObject {
   
    private static ClassHaveOneStaticMethodToInitialObject singleInstance;
	// 承接上文,这里私有化构造器
	private ClassHaveOneStaticMethodToInitialObject() {
		
	}
	
	/* 
	     因为无法实例化对象,所以只能使用静态方法来生成一个对象,
	     由于静态方法也属于该类中的方法,所以可以使用构造器来创建对象(private方法只有本类方法可以调用) 
	                                  */
	public static ClassHaveOneStaticMethodToInitialObject getInstance() {
		  
		/* 这里很重要,发现singleInstance引用为空的时候,说明还没有实例化对象，第一次实例化的时候会创建对象,
		        之后再调用该方法因为判断不为空,所以会直接返回已经创建的实例。
		*/
		if(singleInstance == null) {
			  singleInstance = new ClassHaveOneStaticMethodToInitialObject();
		  }
		  return singleInstance;
	}
}
