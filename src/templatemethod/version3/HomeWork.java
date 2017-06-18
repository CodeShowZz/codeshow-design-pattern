package templatemethod.version3;

/**
 * 现在已经把共有的方法放在了父类,并且定义了需要子类实现的抽象方法,
 * 然后将它们真的实现留给子类去实现
 * 接着可以看Test类
 * 
 * @author 黄二狗
 *
 */

public abstract class HomeWork {
	
	public void question1() {
		System.out.println("1+3= ");
	    System.out.println("答案:" +answer1());
	}
	
	public void question2() {
		System.out.println("5+3= ");
		System.out.println("答案:" +answer2());
	}
	
	public void question3() {
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
