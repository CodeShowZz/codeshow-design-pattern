package headfirst.designpatterns.factory.pizzaaf.factory;

import headfirst.designpatterns.factory.pizzaaf.product.Cheese;
import headfirst.designpatterns.factory.pizzaaf.product.Clams;
import headfirst.designpatterns.factory.pizzaaf.product.Dough;
import headfirst.designpatterns.factory.pizzaaf.product.FreshClams;
import headfirst.designpatterns.factory.pizzaaf.product.Garlic;
import headfirst.designpatterns.factory.pizzaaf.product.MarinaraSauce;
import headfirst.designpatterns.factory.pizzaaf.product.Mushroom;
import headfirst.designpatterns.factory.pizzaaf.product.Onion;
import headfirst.designpatterns.factory.pizzaaf.product.Pepperoni;
import headfirst.designpatterns.factory.pizzaaf.product.RedPepper;
import headfirst.designpatterns.factory.pizzaaf.product.ReggianoCheese;
import headfirst.designpatterns.factory.pizzaaf.product.Sauce;
import headfirst.designpatterns.factory.pizzaaf.product.SlicedPepperoni;
import headfirst.designpatterns.factory.pizzaaf.product.ThinCrustDough;
import headfirst.designpatterns.factory.pizzaaf.product.Veggies;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
 
	public Dough createDough() {
		return new ThinCrustDough();
	}
 
	public Sauce createSauce() {
		return new MarinaraSauce();
	}
 
	public Cheese createCheese() {
		return new ReggianoCheese();
	}
 
	public Veggies[] createVeggies() {
		Veggies veggies[] = { new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
		return veggies;
	}
 
	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	public Clams createClam() {
		return new FreshClams();
	}
}
