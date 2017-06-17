package headfirst.designpatterns.decorator.starbuzz;

import headfirst.designpatterns.decorator.starbuzz.component.Beverage;
import headfirst.designpatterns.decorator.starbuzz.component.DarkRoast;
import headfirst.designpatterns.decorator.starbuzz.component.Espresso;
import headfirst.designpatterns.decorator.starbuzz.component.HouseBlend;
import headfirst.designpatterns.decorator.starbuzz.decorator.Mocha;
import headfirst.designpatterns.decorator.starbuzz.decorator.Soy;
import headfirst.designpatterns.decorator.starbuzz.decorator.Whip;

public class StarbuzzCoffee {
 
	public static void main(String args[]) {
		Beverage beverage = new Espresso();
		System.out.println(beverage.getDescription() 
				+ " $" + beverage.cost());
 
		Beverage beverage2 = new DarkRoast();
		beverage2 = new Mocha(beverage2);
		beverage2 = new Mocha(beverage2);
		beverage2 = new Whip(beverage2);
		System.out.println(beverage2.getDescription() 
				+ " $" + beverage2.cost());
 
		Beverage beverage3 = new HouseBlend();
		beverage3 = new Soy(beverage3);
		beverage3 = new Mocha(beverage3);
		beverage3 = new Whip(beverage3);
		System.out.println(beverage3.getDescription() 
				+ " $" + beverage3.cost());
	}
}
