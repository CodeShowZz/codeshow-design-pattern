package templatemethod.version5;

/**
 * 根据类图写出一个通用的套路
 * 抽象父类拥有模板方法来定义骨架,留抽象方法给子类实现,为了更直观,把具体的子类也都写在这个类中
 * 再看Test类
 * 
 * @author 黄二狗
 *
 */

public abstract class AbstractClass {
    
	//延迟到子类实现的方法
	public  abstract void primitiveOperation1();
	public  abstract void primitiveOperation2();
	
	public void templateMethod() {
		primitiveOperation1();
		primitiveOperation2();
   }
}

class ConcreteClass1 extends AbstractClass {

	@Override
	public void primitiveOperation1() {
		System.out.println("具体子类1的操作1");		
	}

	@Override
	public void primitiveOperation2() {
		System.out.println("具体子类1的操作2");
		
	}
	
}

class ConcreteClass2 extends AbstractClass {

	@Override
	public void primitiveOperation1() {
	    System.out.println("具体子类2的操作1");		
	}

	@Override
	public void primitiveOperation2() {
		 System.out.println("具体子类2的操作2");
		
	}
	
}