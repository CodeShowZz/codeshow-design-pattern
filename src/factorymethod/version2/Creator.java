package factorymethod.version2;

public abstract class Creator {
   
	public void normalMethod() {
		Product product = factoryMethod();
		product.commonMethod();
	}
	
	public abstract Product factoryMethod();	
	
}
