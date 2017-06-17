package headfirst.designpatterns.command.remote.command;

import headfirst.designpatterns.command.remote.action.GarageDoor;

public class GarageDoorUpCommand implements Command {
	GarageDoor garageDoor;

	public GarageDoorUpCommand(GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}

	public void execute() {
		garageDoor.up();
	}
}
