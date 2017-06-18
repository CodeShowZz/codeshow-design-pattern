package templatemethod.version4;

/**
 * 在这个版本中,我们将这些做题目的方法全部封装在一起了,这样客户端只要调用一个方法就可以了.
 * 这个方法被称为模板方法,最终的这种模式就叫做模板方法模式
 * 请看Test类
 * 
 * @author 黄二狗
 *
 */

public abstract class HomeWork {
	
	public void doAllHomeWork() {
		question1();
		answer1();
		question2();
		answer2();
		question3();
		answer3();
	}
	
	private void question1() {
		System.out.println("1+3= ");
	    System.out.println("答案:" +answer1());
	}
	
	private void question2() {
		System.out.println("5+3= ");
		System.out.println("答案:" +answer2());
	}
	
	private void question3() {
		System.out.println("1+5= ");
		System.out.println("答案:" +answer3());
	}
	
	public abstract String answer1();
	public abstract String answer2();
	public abstract String answer3();
}

class HomeWork1 extends HomeWork {

	@Override
	public String answer1() {
		return "4";
	}

	@Override
	public String answer2() {
	    return "5";
	}

	@Override
	public String answer3() {
	    return "6";
	}

	
}

class HomeWork2 extends HomeWork {
	@Override
	public String answer1() {
		return "5";
	}

	@Override
	public String answer2() {
	    return "3";
	}

	@Override
	public String answer3() {
	    return "6";
	}
}
