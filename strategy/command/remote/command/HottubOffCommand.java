package headfirst.designpatterns.command.remote.command;

import headfirst.designpatterns.command.remote.action.Hottub;

public class HottubOffCommand implements Command {
	Hottub hottub;

	public HottubOffCommand(Hottub hottub) {
		this.hottub = hottub;
	}

	public void execute() {
		hottub.cool();
		hottub.off();
	}
}
