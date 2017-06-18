package decorator.version2;

/**
 *  现在,需求来了,商店里经常有顾客要加冰块,加糖,加柠檬,等等,这些配料也都是需要钱的
 *  现在商店里经常需要计算它们加起来多少钱。
 *  
 *  那么问题来了:我们该怎么设计一个比较好的方案呢?
 *  下一版本我们开始设计.
 * 
 * @author 黄二狗
 *
 */

public abstract class Beverage {
   public abstract double cost();
}

class Coke extends Beverage {

	@Override
	public double cost() {
	    return 3.0;     
	}
}

class Sprint extends Beverage {

	@Override
	public double cost() {
		return 3.5;
	}
}

class Fenta extends Beverage {

	@Override
	public double cost() {
		return 4.0;
	}
}
