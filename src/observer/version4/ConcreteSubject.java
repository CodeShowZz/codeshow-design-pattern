package observer.version4;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements Subject {
	
	List<Observer> observers = new ArrayList<>();
	
	@Override
	public void addObserver(Observer observer) {
	    observers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyAllObservers() {
		for(Observer observer : observers) {
			observer.update();
		}
	}
	
	public void stateChanged() {
	  notifyAllObservers();	
	}

}
