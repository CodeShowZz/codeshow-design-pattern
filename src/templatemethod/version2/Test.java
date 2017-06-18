package templatemethod.version2;

import templatemethod.version2.HomeWork1;
import templatemethod.version2.HomeWork2;

/**
 * 和上个版本一样 只是引用的类变了
 * 但是可以发现我们的子类全都调用了super.XX()的方法,有没有办法可以更简洁?
 * 答案是有,请看下一个版本
 * 
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
