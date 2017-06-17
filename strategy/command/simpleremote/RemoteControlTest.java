package headfirst.designpatterns.command.simpleremote;

import headfirst.designpatterns.command.simpleremote.action.GarageDoor;
import headfirst.designpatterns.command.simpleremote.action.Light;
import headfirst.designpatterns.command.simpleremote.command.GarageDoorOpenCommand;
import headfirst.designpatterns.command.simpleremote.command.LightOnCommand;
import headfirst.designpatterns.command.simpleremote.control.SimpleRemoteControl;

public class RemoteControlTest {
	public static void main(String[] args) {
		SimpleRemoteControl remote = new SimpleRemoteControl();
		Light light = new Light();
		LightOnCommand lightOn = new LightOnCommand(light);
		
		GarageDoor garageDoor = new GarageDoor();
		GarageDoorOpenCommand garageOpen = 
		    new GarageDoorOpenCommand(garageDoor);
 
		remote.setCommand(lightOn);
		remote.buttonWasPressed();
		
		remote.setCommand(garageOpen);
		remote.buttonWasPressed();
    }
	
}
