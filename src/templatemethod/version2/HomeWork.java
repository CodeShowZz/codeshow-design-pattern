package templatemethod.version2;

/**
 * 因为上一版本中,两个同学所做的作业是一样的,所以这个版本尝试将它们提取到一个父类当中
 * 为了使该模式更直观,把之前的那些类全都放在这个类中并且进行改进
 * 再看Test类
 * 
 * @author 黄二狗
 *
 */


public class HomeWork {
	
	public void question1() {
		System.out.println("1+3= ");
	}
	
	public void question2() {
		System.out.println("5+3= ");
	}
	
	public void question3() {
		System.out.println("1+5= ");
	}
}

class HomeWork1 extends HomeWork {
	@Override
	public void question1() {
		super.question1();
		System.out.println("答案:"+4);
	}
	
	@Override
	public void question2() {
		super.question2();
		System.out.println("答案:"+5);
	}
	
	@Override
	public void question3() {
		super.question3();
		System.out.println("答案:"+6);
	}
}

class HomeWork2 extends HomeWork {
	@Override
	public void question1() {
		super.question1();
		System.out.println("答案:"+5);
	}
	
	@Override
	public void question2() {
		super.question2();
		System.out.println("答案:"+3);
	}
	
	@Override
	public void question3() {
		super.question3();
		System.out.println("答案:"+6);
	}
	
}
