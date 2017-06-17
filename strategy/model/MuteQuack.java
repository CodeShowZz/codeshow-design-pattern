package headfirst.designpatterns.strategy.model;

import headfirst.designpatterns.strategy.algorithm.QuackBehavior;

public class MuteQuack implements QuackBehavior {
	public void quack() {
		System.out.println("<< Silence >>");
	}
}
