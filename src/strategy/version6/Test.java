package strategy.version6;

public class Test {
   public static void main(String[] args) {
	Strategy strategy = new ConcreteStrategy1();
	Strategy strategy2 = new ConcreteStrategy2();
	Strategy strategy3 = new ConcreteStrategy3();
	
	Context context = new Context();
	context.setStrategy(strategy);
	context.contextInterface();
	
	context.setStrategy(strategy2);
	context.contextInterface();
	
	context.setStrategy(strategy3);
	context.contextInterface();
}
}
