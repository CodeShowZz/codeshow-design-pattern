package headfirst.designpatterns.factory.pizzaaf.factorymethod;

import headfirst.designpatterns.factory.pizzaaf.factory.ChicagoPizzaIngredientFactory;
import headfirst.designpatterns.factory.pizzaaf.factory.PizzaIngredientFactory;
import headfirst.designpatterns.factory.pizzaaf.product.CheesePizza;
import headfirst.designpatterns.factory.pizzaaf.product.ClamPizza;
import headfirst.designpatterns.factory.pizzaaf.product.PepperoniPizza;
import headfirst.designpatterns.factory.pizzaaf.product.Pizza;
import headfirst.designpatterns.factory.pizzaaf.product.VeggiePizza;

public class ChicagoPizzaStore extends PizzaStore {

	protected Pizza createPizza(String item) {
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory =
		new ChicagoPizzaIngredientFactory();

		if (item.equals("cheese")) {

			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("Chicago Style Cheese Pizza");

		} else if (item.equals("veggie")) {

			pizza = new VeggiePizza(ingredientFactory);
			pizza.setName("Chicago Style Veggie Pizza");

		} else if (item.equals("clam")) {

			pizza = new ClamPizza(ingredientFactory);
			pizza.setName("Chicago Style Clam Pizza");

		} else if (item.equals("pepperoni")) {

			pizza = new PepperoniPizza(ingredientFactory);
			pizza.setName("Chicago Style Pepperoni Pizza");

		}
		return pizza;
	}
}
