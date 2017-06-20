package factorymethod.version2;

public class ConcreteCreator2 extends Creator{

	@Override
	public Product factoryMethod() {
	    return new ConcreteProduct2("2号产品");
	}

}
