package proxy.jdkdynamicproxy.version1;

/**
 * 可以看到,在这里有一个接口PersonBean
 * Person类实现了这么一个接口
 * 接着在下一个版本,我们将推出比较难以理解的动态代理(其实不是模式问题,是语法问题)
 * 所谓的动态代理,也就是动态的生成代理.下一个版本将会看到
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
