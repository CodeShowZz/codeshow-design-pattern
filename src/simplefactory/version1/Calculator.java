package simplefactory.version1;

/**
 * 本例子以一个计算机实现加减乘除的例子来说明简单工厂模式如何实现
 * 把加减乘除类全部都放在本类中,更加直观.
 * 经常我们可能会new 对象,但是我们很希望有一个地方专门帮我们做这件事,很多个地方
 * 统一都从那里获取对象,那个地方叫做工厂,下一个版本将会将这些计算器的生成封装在工厂中
 * 
 * 很简单,就不多说了
 * 
 * @author 黄二狗
 *
 */
public  abstract class Calculator {
    private double firstNumber;
    private double secondNumber;
    
    public void setFirstNumber(double firstNumber) {
    	this.firstNumber = firstNumber;
    }
    
    public double getFirstNumber() {
		return firstNumber;
	}
    
    public void setSecondNumber(double secondNumber) {
		this.secondNumber = secondNumber;
	}
    
    public double getSecondNumber() {
		return secondNumber;
	}
    
    public abstract double operation();
}

class AddCalculator extends Calculator {

	@Override
	public double operation() {
	   return getFirstNumber() + getSecondNumber();
	}
	
}

class MinusCalculator extends Calculator {

	@Override
	public double operation() {
	   return getFirstNumber() - getSecondNumber();
	}
	
}

class MultiplyCalculator extends Calculator {

	@Override
	public double operation() {
	   return getFirstNumber() * getSecondNumber();
	}
	
}

class DivideCalculator extends Calculator {

	@Override
	public double operation() {
	   return getFirstNumber() / getSecondNumber();
	}
	
}
