package headfirst.designpatterns.command.party.command;

import headfirst.designpatterns.command.party.action.Light;

public class LivingroomLightOnCommand implements Command {
	Light light;

	public LivingroomLightOnCommand(Light light) {
		this.light = light;
	}
	public void execute() {
		light.on();
	}
	public void undo() {
		light.off();
	}
}
