package iterator.version3;

public class ConcreteAggregate implements Aggregate{
   
	private Object objects[];
	private final int size = 10;
	private int objectIndex = 0;
	 
    public ConcreteAggregate() {
		this.objects = new Object[size];
	}
    
    public void addItem(Object object) {	
    	if(objectIndex >= size) {
    		System.out.println("数组已经满了");
    	} else {
    	objects[objectIndex] = object;
    	  objectIndex++;
    	}  	
    }   
	@Override
	public Iterator createItertor() {
		return new ConcreteIterator(objects);
	}
	
    
}
 