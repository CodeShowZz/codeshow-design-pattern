package simplefactory.version2;

/**
 * 简单工厂模式是一个很常用的小套路
 * 就是这么简单!
 * 
 * @author 黄二狗
 *
 */

public class Test {
   public static void main(String[] args) {
	  Calculator addCalculator = CalculatorFactory.createCalculator("+");
	  addCalculator.setFirstNumber(2);
	  addCalculator.setSecondNumber(3);
	  double result = addCalculator.operation();
	  System.out.println(result);
   }
}
