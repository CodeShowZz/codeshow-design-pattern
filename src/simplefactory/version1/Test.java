package simplefactory.version1;

public class Test {
   public static void main(String[] args) {
	  Calculator addCalculator = new AddCalculator();
	  addCalculator.setFirstNumber(2);
	  addCalculator.setSecondNumber(3);
	  double result = addCalculator.operation();
      System.out.println(result);
   }
}
