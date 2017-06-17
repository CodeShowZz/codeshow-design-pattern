package headfirst.designpatterns.strategy.model;

import headfirst.designpatterns.strategy.algorithm.FlyNoWay;
import headfirst.designpatterns.strategy.algorithm.Squeak;

public class RubberDuck extends Duck {
 
	public RubberDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Squeak();
	}
 
	public void display() {
		System.out.println("I'm a rubber duckie");
	}
}
