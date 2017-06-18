package templatemethod.version1;

/**
 * 在这个版本中,其实发现HomeWork1和HomeWork2这两个类中的很多代码都是很像的只有部分代码不一样,
 * 因此,在下一个版本中,将他们抽出来
 * @author 黄二狗
 *
 */

public class Test {
  public static void main(String[] args) {
	  
	  System.out.println("------------------");
	  System.out.println("第一位同学");
	  
	  HomeWork1 homeWork1 = new HomeWork1();
	  homeWork1.question1();
	  homeWork1.question2();
	  homeWork1.question3();
	  	  
	
	  System.out.println("------------------");	
	  System.out.println("第二位同学");
	  
	  HomeWork2 homeWork2 = new HomeWork2();
	  homeWork2.question1();
	  homeWork2.question2();
	  homeWork2.question3();
}
}
