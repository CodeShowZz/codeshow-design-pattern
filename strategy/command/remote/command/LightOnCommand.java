package headfirst.designpatterns.command.remote.command;

import headfirst.designpatterns.command.remote.action.Light;

public class LightOnCommand implements Command {
	Light light;

	public LightOnCommand(Light light) {
		this.light = light;
	}

	public void execute() {
		light.on();
	}
}
