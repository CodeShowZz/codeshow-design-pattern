package headfirst.designpatterns.command.remote.command;

import headfirst.designpatterns.command.remote.action.Light;

public class LivingroomLightOnCommand implements Command {
	Light light;

	public LivingroomLightOnCommand(Light light) {
		this.light = light;
	}

	public void execute() {
		light.on();
	}
}
