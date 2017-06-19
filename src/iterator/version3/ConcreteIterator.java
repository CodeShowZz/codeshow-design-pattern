package iterator.version3;

public class ConcreteIterator implements Iterator<Object> {
  
	private Object [] objects;
	int position = 0;
	int size = 0;
	
	 public ConcreteIterator(Object []objects) {
		this.objects = objects;
		this.size = objects.length;
	}

	@Override
	public boolean hasNext() {
		if((position >= size) || (objects[position] == null))
              return false;
		return true;
}

	@Override
	public Object next() {
		Object object = objects[position];
		position++;
		return object;
	}

}
