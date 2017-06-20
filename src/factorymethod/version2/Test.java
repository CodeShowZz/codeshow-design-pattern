package factorymethod.version2;

public class Test {
   public static void main(String[] args) {
	  Creator creator = new ConcreteCreator1();
	  creator.normalMethod();
	  
	  creator = new ConcreteCreator2();
	  creator.normalMethod();
}
}
