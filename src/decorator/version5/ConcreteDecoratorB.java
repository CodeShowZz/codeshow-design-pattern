package decorator.version5;

public class ConcreteDecoratorB extends Decorator {
  
	public ConcreteDecoratorB(Component component) {
		super(component);
	}
	
	@Override
	public void operation() {
		super.operation();
		addedBehavior();
	}
	
	private void addedBehavior() {
		System.out.println("具体的装饰者B悄悄的添加了一些行为");
	}
   
}
