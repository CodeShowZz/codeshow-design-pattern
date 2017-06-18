package templatemethod.version1;

/**
 * 一年级的小学生小明在做老师布置的三道题目
 * 结合HomeWork2 可以看出老师布置作业的题目都是一样的只是最后给出的答案不一样
 * 这个时候我们就要将这些一样的东西提取到父类让子类继承
 * 看一下HomeWord2类和Test类
 * 
 * 
 * @author 黄二狗
 *
 */
public class HomeWork1 {
	
	public void question1() {
		System.out.println("1+3= ");
		System.out.println("答案:"+4);
	}
	
	public void question2() {
		System.out.println("5+3= ");
		System.out.println("答案:"+8);
	}
	
	public void question3() {
		System.out.println("1+5= ");
		System.out.println("答案:"+4);
	}

}
