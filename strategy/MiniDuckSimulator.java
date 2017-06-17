package headfirst.designpatterns.strategy;

import headfirst.designpatterns.strategy.algorithm.FlyRocketPowered;
import headfirst.designpatterns.strategy.model.DecoyDuck;
import headfirst.designpatterns.strategy.model.Duck;
import headfirst.designpatterns.strategy.model.MallardDuck;
import headfirst.designpatterns.strategy.model.ModelDuck;
import headfirst.designpatterns.strategy.model.RubberDuck;

public class MiniDuckSimulator {
 
	public static void main(String[] args) {
 
		MallardDuck	mallard = new MallardDuck();
		RubberDuck	rubberDuckie = new RubberDuck();
		DecoyDuck	decoy = new DecoyDuck();
 
		Duck model = new ModelDuck();

		mallard.performQuack();
		rubberDuckie.performQuack();
		decoy.performQuack();
   
		model.performFly();	
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
	}
}
