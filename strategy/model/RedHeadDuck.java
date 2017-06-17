package headfirst.designpatterns.strategy.model;

import headfirst.designpatterns.strategy.algorithm.FlyWithWings;
import headfirst.designpatterns.strategy.algorithm.Quack;

public class RedHeadDuck extends Duck {
 
	public RedHeadDuck() {
		flyBehavior = new FlyWithWings();
		quackBehavior = new Quack();
	}
 
	public void display() {
		System.out.println("I'm a real Red Headed duck");
	}
}
