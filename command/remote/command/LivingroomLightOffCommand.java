package headfirst.designpatterns.command.remote.command;

import headfirst.designpatterns.command.remote.action.Light;

public class LivingroomLightOffCommand implements Command {
	Light light;

	public LivingroomLightOffCommand(Light light) {
		this.light = light;
	}

	public void execute() {
		light.off();
	}
}
