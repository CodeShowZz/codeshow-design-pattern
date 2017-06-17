package headfirst.designpatterns.decorator.starbuzz.decorator;

import headfirst.designpatterns.decorator.starbuzz.component.Beverage;

public abstract class CondimentDecorator extends Beverage {
	public abstract String getDescription();
}
