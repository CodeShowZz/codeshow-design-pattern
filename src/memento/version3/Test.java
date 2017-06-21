package memento.version3;


public class Test {
  public static void main(String[] args) {
	 Originator originator = new Originator();
	 originator.setState("原始状态");
	 System.out.println(originator.getState());
	 
	 System.out.println();
	 Caretaker caretaker = originator.createCaretaker();
	 
	 originator.setState("另一个状态");
	 System.out.println(originator.getState());
	 System.out.println();
	 
	 //恢复原始的状态
	 originator.restoreToMemento(caretaker.getMemento());
	 System.out.println(originator.getState());
}
}
