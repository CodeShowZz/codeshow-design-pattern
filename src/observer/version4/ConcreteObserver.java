package observer.version4;

public class ConcreteObserver implements Observer{

	private Subject subject;
	
     public ConcreteObserver(Subject subject) {
	    this.subject = subject;
	    subject.addObserver(this);
	}

	@Override
	public void update() {
         System.out.println("被通知,将会采取某些行动");
	}
	

    
}
