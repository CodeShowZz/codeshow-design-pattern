package headfirst.designpatterns.strategy;

import headfirst.designpatterns.strategy.algorithm.FlyRocketPowered;
import headfirst.designpatterns.strategy.model.Duck;
import headfirst.designpatterns.strategy.model.MallardDuck;
import headfirst.designpatterns.strategy.model.ModelDuck;

public class MiniDuckSimulator1 {
 
	public static void main(String[] args) {
 
		Duck mallard = new MallardDuck();
		mallard.performQuack();
		mallard.performFly();
   
		Duck model = new ModelDuck();
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();

	}
}
