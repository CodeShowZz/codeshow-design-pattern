package headfirst.designpatterns.factory.pizzaaf.factory;

import headfirst.designpatterns.factory.pizzaaf.product.BlackOlives;
import headfirst.designpatterns.factory.pizzaaf.product.Cheese;
import headfirst.designpatterns.factory.pizzaaf.product.Clams;
import headfirst.designpatterns.factory.pizzaaf.product.Dough;
import headfirst.designpatterns.factory.pizzaaf.product.Eggplant;
import headfirst.designpatterns.factory.pizzaaf.product.FrozenClams;
import headfirst.designpatterns.factory.pizzaaf.product.MozzarellaCheese;
import headfirst.designpatterns.factory.pizzaaf.product.Pepperoni;
import headfirst.designpatterns.factory.pizzaaf.product.PlumTomatoSauce;
import headfirst.designpatterns.factory.pizzaaf.product.Sauce;
import headfirst.designpatterns.factory.pizzaaf.product.SlicedPepperoni;
import headfirst.designpatterns.factory.pizzaaf.product.Spinach;
import headfirst.designpatterns.factory.pizzaaf.product.ThickCrustDough;
import headfirst.designpatterns.factory.pizzaaf.product.Veggies;

public class ChicagoPizzaIngredientFactory 
	implements PizzaIngredientFactory 
{

	public Dough createDough() {
		return new ThickCrustDough();
	}

	public Sauce createSauce() {
		return new PlumTomatoSauce();
	}

	public Cheese createCheese() {
		return new MozzarellaCheese();
	}

	public Veggies[] createVeggies() {
		Veggies veggies[] = { new BlackOlives(), 
		                      new Spinach(), 
		                      new Eggplant() };
		return veggies;
	}

	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	public Clams createClam() {
		return new FrozenClams();
	}
}
