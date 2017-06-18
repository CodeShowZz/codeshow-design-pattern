package templatemethod.version4;


/**
 * 测试代码现在只需要调用一个方法就够了,调用的这个方法就是模板方法,也就是一个骨架,而骨架中的步骤延迟到子类实现。
 * 接下来的版本五可以看到该模式的类图和正式的定义,并写出一个更通用的代码结构
 * 
 * @author 黄二狗
 *
 */
public class Test {
   public static void main(String[] args) {
		  System.out.println("------------------");
		  System.out.println("第一位同学");
		  
		  HomeWork1 homeWork1 = new HomeWork1();
		  homeWork1.doAllHomeWork();	  
		
		  System.out.println("------------------");	
		  System.out.println("第二位同学");
		  
		  HomeWork2 homeWork2 = new HomeWork2();
		  homeWork2.doAllHomeWork();
}
}
