package headfirst.designpatterns.strategy.model;

import headfirst.designpatterns.strategy.algorithm.FlyNoWay;
import headfirst.designpatterns.strategy.algorithm.Quack;

public class ModelDuck extends Duck {
	public ModelDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Quack();
	}

	public void display() {
		System.out.println("I'm a model duck");
	}
}
