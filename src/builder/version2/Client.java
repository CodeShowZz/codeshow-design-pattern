package builder.version2;

public class Client {
  public static void main(String[] args) {
	 Director director = new Director();
	 Builder builder1 = new ConcreteBuilder1();
	 Builder builder2 = new ConcreteBuilder2();
	 
	 director.construct(builder1);
	 Product product = builder1.getResult();
	 product.show();
	 
	 System.out.println();
	 
	 director.construct(builder2);
	 Product product2 = builder2.getResult();
	 product2.show();
}
}
