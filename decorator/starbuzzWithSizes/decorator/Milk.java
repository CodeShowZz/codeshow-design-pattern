package headfirst.designpatterns.decorator.starbuzzWithSizes.decorator;

import headfirst.designpatterns.decorator.starbuzzWithSizes.component.Beverage;

public class Milk extends CondimentDecorator {
	public Milk(Beverage beverage) {
		this.beverage = beverage;
	}

	public String getDescription() {
		return beverage.getDescription() + ", Milk";
	}

	public double cost() {
		return beverage.cost() + .10;
	}
}
