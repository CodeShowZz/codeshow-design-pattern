package headfirst.designpatterns.factory.pizzafm.factorymethod;

import headfirst.designpatterns.factory.pizzafm.product.ChicagoStyleCheesePizza;
import headfirst.designpatterns.factory.pizzafm.product.ChicagoStyleClamPizza;
import headfirst.designpatterns.factory.pizzafm.product.ChicagoStylePepperoniPizza;
import headfirst.designpatterns.factory.pizzafm.product.ChicagoStyleVeggiePizza;
import headfirst.designpatterns.factory.pizzafm.product.Pizza;

public class ChicagoPizzaStore extends PizzaStore {

	Pizza createPizza(String item) {
        	if (item.equals("cheese")) {
            		return new ChicagoStyleCheesePizza();
        	} else if (item.equals("veggie")) {
        	    	return new ChicagoStyleVeggiePizza();
        	} else if (item.equals("clam")) {
        	    	return new ChicagoStyleClamPizza();
        	} else if (item.equals("pepperoni")) {
            		return new ChicagoStylePepperoniPizza();
        	} else return null;
	}
}
