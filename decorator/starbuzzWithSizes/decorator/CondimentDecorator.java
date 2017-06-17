package headfirst.designpatterns.decorator.starbuzzWithSizes.decorator;

import headfirst.designpatterns.decorator.starbuzzWithSizes.component.Beverage;

public abstract class CondimentDecorator extends Beverage {
	public Beverage beverage;
	public abstract String getDescription();
	
	public Size getSize() {
		return beverage.getSize();
	}
}
