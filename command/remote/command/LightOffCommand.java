package headfirst.designpatterns.command.remote.command;

import headfirst.designpatterns.command.remote.action.Light;

public class LightOffCommand implements Command {
	Light light;
 
	public LightOffCommand(Light light) {
		this.light = light;
	}
 
	public void execute() {
		light.off();
	}
}
