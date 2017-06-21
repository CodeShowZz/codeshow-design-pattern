package memento.version3;

/**
 * 
 * 
 * @author 黄二狗
 *
 */
public class Originator {
    private String state;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
    
    public Caretaker createCaretaker() {
       	Memento memento = new Memento(this.state);
       	Caretaker caretaker = new Caretaker();
       	caretaker.setMemento(memento);
       	return caretaker;
    } 
    
    public void restoreToMemento(Memento memento) {
    	this.state = memento.getState();
    }
}
