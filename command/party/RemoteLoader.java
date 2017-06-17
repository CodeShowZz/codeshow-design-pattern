package headfirst.designpatterns.command.party;

import headfirst.designpatterns.command.party.action.Hottub;
import headfirst.designpatterns.command.party.action.Light;
import headfirst.designpatterns.command.party.action.Stereo;
import headfirst.designpatterns.command.party.action.TV;
import headfirst.designpatterns.command.party.command.Command;
import headfirst.designpatterns.command.party.command.HottubOffCommand;
import headfirst.designpatterns.command.party.command.HottubOnCommand;
import headfirst.designpatterns.command.party.command.LightOffCommand;
import headfirst.designpatterns.command.party.command.LightOnCommand;
import headfirst.designpatterns.command.party.command.MacroCommand;
import headfirst.designpatterns.command.party.command.StereoOffCommand;
import headfirst.designpatterns.command.party.command.StereoOnCommand;
import headfirst.designpatterns.command.party.command.TVOffCommand;
import headfirst.designpatterns.command.party.command.TVOnCommand;
import headfirst.designpatterns.command.party.control.RemoteControl;

public class RemoteLoader {

	public static void main(String[] args) {

		RemoteControl remoteControl = new RemoteControl();

		Light light = new Light("Living Room");
		TV tv = new TV("Living Room");
		Stereo stereo = new Stereo("Living Room");
		Hottub hottub = new Hottub();
 
		LightOnCommand lightOn = new LightOnCommand(light);
		StereoOnCommand stereoOn = new StereoOnCommand(stereo);
		TVOnCommand tvOn = new TVOnCommand(tv);
		HottubOnCommand hottubOn = new HottubOnCommand(hottub);
		LightOffCommand lightOff = new LightOffCommand(light);
		StereoOffCommand stereoOff = new StereoOffCommand(stereo);
		TVOffCommand tvOff = new TVOffCommand(tv);
		HottubOffCommand hottubOff = new HottubOffCommand(hottub);

		Command[] partyOn = { lightOn, stereoOn, tvOn, hottubOn};
		Command[] partyOff = { lightOff, stereoOff, tvOff, hottubOff};
  
		MacroCommand partyOnMacro = new MacroCommand(partyOn);
		MacroCommand partyOffMacro = new MacroCommand(partyOff);
 
		remoteControl.setCommand(0, partyOnMacro, partyOffMacro);
  
		System.out.println(remoteControl);
		System.out.println("--- Pushing Macro On---");
		remoteControl.onButtonWasPushed(0);
		System.out.println("--- Pushing Macro Off---");
		remoteControl.offButtonWasPushed(0);
	}
}
