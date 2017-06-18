package decorator.version5;

public class ConcreteDecoratorA extends Decorator {
  
	private String addedState = "concreDecoration";
	 
	public ConcreteDecoratorA(Component component) {
		super(component);
	}
	
	@Override
	public void operation() {
		super.operation();
		System.out.println(addedState);
	}
   
}
