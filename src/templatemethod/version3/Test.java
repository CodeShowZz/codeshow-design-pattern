package templatemethod.version3;


/**
 * 测试代码依旧没有变,那么还能不能将这些做题目的方法全部封装在一起呢?
 * 请看下一个终极版本.
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
