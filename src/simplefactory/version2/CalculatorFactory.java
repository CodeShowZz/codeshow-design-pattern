package simplefactory.version2;

import javax.swing.text.AttributeSet.CharacterAttribute;

public class CalculatorFactory {
   public static Calculator createCalculator(String type) {
	   Calculator calculator = null;
	   
	   if(type.equals("+"))
		   calculator = new AddCalculator();
	   else if(type.equals("-"))
		   calculator = new MinusCalculator();
	   else if(type.equals("*"))
		   calculator = new MultiplyCalculator();
	   else if(type.equals("/"))
		   calculator = new DivideCalculator();
   
      return calculator;
   }
} 
 