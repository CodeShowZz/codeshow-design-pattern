package headfirst.designpatterns.command.simpleremoteWL.control;

import headfirst.designpatterns.command.simpleremoteWL.command.Command;

//
// This is the invoker
//
public class SimpleRemoteControl {
	Command slot;
 
	public SimpleRemoteControl() {}
 
	public void setCommand(Command command) {
		slot = command;
	}
 
	public void buttonWasPressed() {
		slot.execute();
	}
}
