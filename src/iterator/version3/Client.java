package iterator.version3;

public class Client {
  public static void main(String[] args) {
	  ConcreteAggregate concreteAggregate = new ConcreteAggregate();
	  concreteAggregate.addItem(new Object());
	  concreteAggregate.addItem(new Object());
	  concreteAggregate.addItem(new Object());
	  concreteAggregate.addItem(new Object());
	  concreteAggregate.addItem(new Object());
	  concreteAggregate.addItem(new Object());
	  concreteAggregate.addItem(new Object());
	  concreteAggregate.addItem(new Object());
	  concreteAggregate.addItem(new Object());
	  concreteAggregate.addItem(new Object());
	  concreteAggregate.addItem(new Object());
	  concreteAggregate.addItem(new Object());
	  
	  Iterator<Object> objectIterator = concreteAggregate.createItertor();
	  while(objectIterator.hasNext()) {
		  Object object = objectIterator.next();
		  System.out.println(object);
	  }
}
}
