package headfirst.designpatterns.decorator.starbuzzWithSizes.decorator;

import headfirst.designpatterns.decorator.starbuzzWithSizes.component.Beverage;

public class Whip extends CondimentDecorator {
	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}
 
	public String getDescription() {
		return beverage.getDescription() + ", Whip";
	}
 
	public double cost() {
		return beverage.cost() + .10;
	}
}
