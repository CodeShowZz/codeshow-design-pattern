package headfirst.designpatterns.command.party.command;

import headfirst.designpatterns.command.party.action.TV;

public class TVOffCommand implements Command {
	TV tv;

	public TVOffCommand(TV tv) {
		this.tv= tv;
	}

	public void execute() {
		tv.off();
	}

	public void undo() {
		tv.on();
	}
}
