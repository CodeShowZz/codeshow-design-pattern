package decorator.version1;

/**
 * 实现一个饮料系统 最开始只有三种饮料可乐 雪碧 和芬达,他们都继承自Beverage类
 * 它们都有一个计算价钱的方法,一切非常的自然,没有毛病
 * 为了更直观直接写在同一个类中
 * 接着可以看下一版本
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
