package observer.version4;

public interface Subject {
  
	void addObserver(Observer observer);
	void removeObserver(Observer observer);
	void notifyAllObservers();
	
}
