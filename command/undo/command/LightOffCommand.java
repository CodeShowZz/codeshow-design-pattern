package headfirst.designpatterns.command.undo.command;

import headfirst.designpatterns.command.undo.action.Light;

public class LightOffCommand implements Command {
	Light light;
	int level;
	public LightOffCommand(Light light) {
		this.light = light;
	}
 
	public void execute() {
        level = light.getLevel();
		light.off();
	}
 
	public void undo() {
		light.dim(level);
	}
}
