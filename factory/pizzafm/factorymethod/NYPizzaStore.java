package headfirst.designpatterns.factory.pizzafm.factorymethod;

import headfirst.designpatterns.factory.pizzafm.product.NYStyleCheesePizza;
import headfirst.designpatterns.factory.pizzafm.product.NYStyleClamPizza;
import headfirst.designpatterns.factory.pizzafm.product.NYStylePepperoniPizza;
import headfirst.designpatterns.factory.pizzafm.product.NYStyleVeggiePizza;
import headfirst.designpatterns.factory.pizzafm.product.Pizza;

public class NYPizzaStore extends PizzaStore {

	Pizza createPizza(String item) {
		if (item.equals("cheese")) {
			return new NYStyleCheesePizza();
		} else if (item.equals("veggie")) {
			return new NYStyleVeggiePizza();
		} else if (item.equals("clam")) {
			return new NYStyleClamPizza();
		} else if (item.equals("pepperoni")) {
			return new NYStylePepperoniPizza();
		} else return null;
	}
}
