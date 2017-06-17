package headfirst.designpatterns.command.simpleremote.command;

import headfirst.designpatterns.command.simpleremote.action.Light;

public class LightOffCommand implements Command {
	Light light;
 
	public LightOffCommand(Light light) {
		this.light = light;
	}
 
	public void execute() {
		light.off();
	}
}
