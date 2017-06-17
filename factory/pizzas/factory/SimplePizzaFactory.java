package headfirst.designpatterns.factory.pizzas.factory;

import headfirst.designpatterns.factory.pizzas.product.CheesePizza;
import headfirst.designpatterns.factory.pizzas.product.ClamPizza;
import headfirst.designpatterns.factory.pizzas.product.PepperoniPizza;
import headfirst.designpatterns.factory.pizzas.product.Pizza;
import headfirst.designpatterns.factory.pizzas.product.VeggiePizza;

public class SimplePizzaFactory {

	public Pizza createPizza(String type) {
		Pizza pizza = null;

		if (type.equals("cheese")) {
			pizza = new CheesePizza();
		} else if (type.equals("pepperoni")) {
			pizza = new PepperoniPizza();
		} else if (type.equals("clam")) {
			pizza = new ClamPizza();
		} else if (type.equals("veggie")) {
			pizza = new VeggiePizza();
		}
		return pizza;
	}
}
