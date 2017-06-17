package headfirst.designpatterns.command.simpleremote.command;

import headfirst.designpatterns.command.simpleremote.action.Light;

public class LightOnCommand implements Command {
	Light light;
  
	public LightOnCommand(Light light) {
		this.light = light;
	}
 
	public void execute() {
		light.on();
	}
}
