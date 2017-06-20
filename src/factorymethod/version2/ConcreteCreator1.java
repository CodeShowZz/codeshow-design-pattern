package factorymethod.version2;

public class ConcreteCreator1 extends Creator {

	@Override
	public Product factoryMethod() {
         return new ConcreteProduct1("1号产品");
	}

}
