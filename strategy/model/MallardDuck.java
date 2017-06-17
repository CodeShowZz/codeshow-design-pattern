package headfirst.designpatterns.strategy.model;

import headfirst.designpatterns.strategy.algorithm.FlyWithWings;
import headfirst.designpatterns.strategy.algorithm.Quack;

public class MallardDuck extends Duck {

	public MallardDuck() {

		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();

	}

	public void display() {
		System.out.println("I'm a real Mallard duck");
	}
}
