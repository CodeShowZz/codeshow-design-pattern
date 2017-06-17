package headfirst.designpatterns.factory.pizzaaf.factory;

import headfirst.designpatterns.factory.pizzaaf.product.Cheese;
import headfirst.designpatterns.factory.pizzaaf.product.Clams;
import headfirst.designpatterns.factory.pizzaaf.product.Dough;
import headfirst.designpatterns.factory.pizzaaf.product.Pepperoni;
import headfirst.designpatterns.factory.pizzaaf.product.Sauce;
import headfirst.designpatterns.factory.pizzaaf.product.Veggies;

public interface PizzaIngredientFactory {
 
	public Dough createDough();
	public Sauce createSauce();
	public Cheese createCheese();
	public Veggies[] createVeggies();
	public Pepperoni createPepperoni();
	public Clams createClam();
 
}
