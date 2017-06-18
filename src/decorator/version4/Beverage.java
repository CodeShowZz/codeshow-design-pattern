package decorator.version4;

/**
 * 这时候,我们在想能不能这么将对象这么联系起来:
 * 1 要一杯可乐 2 在可乐中一个柠檬 3 再加冰块  
 * 
 * 最后我们可以很好的计算价钱,这个时候就需要装饰者模式出场了.
 * 
 * 这个模式的精髓就是要分清组件的身份,一类是基础的组件,一类是装饰组件
 * 在这个例子中,可乐和芬达还有雪碧 就是基础的组件
 * 装饰组件是那些柠檬,冰块等等
 * 
 * 为了更直观的演示,再Beverage添加一个getDescription()方法,后面就会看到效果
 *
 * 
 * @author 黄二狗
 *
 */

public abstract class Beverage {
   String description;
   public abstract double cost();
   
   public String getDescription() {
	 return description;   
   }
}

class Coke extends Beverage {
    
	public Coke() {
		this.description = "可乐";
	}
	
	@Override
	public double cost() {
	    return 3.0;     
	}
	
}

class Sprint extends Beverage {
	
	public Sprint() {
		this.description = "雪碧";
	}

	@Override
	public double cost() {
		return 3.5;
	}
}

class Fenta extends Beverage {
	
	public Fenta() {
		this.description = "芬达";
	}

	@Override
	public double cost() {
		return 4.0;
	}
}
