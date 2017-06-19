package proxy.jdkdynamicproxy.version2;

/**
 *  还是上一个版本的代码
 *  现在我们要生成一个动态代理了,使用JDK内置的语法,请看Test类
 * 
 * @author 黄二狗
 *
 */

public interface PersonBean {
   
	String getName();
	int getAge();
	void printName();
	void printAge();	
}

class Person implements PersonBean {
     private  String name;
     private int age;
	
     public Person(String name,int age) {
    	 this.name = name;
    	 this.age = age;
     }
     
	@Override
	public String getName() {
      return name;
	}

	@Override
	public int getAge() {
      return age;
	}

	@Override
	public void printName() {
	   System.out.println("我的名字叫做: "+name);	
	}

	@Override
	public void printAge() {
	   System.out.println("本人今年: "+age);
	}
	
}
