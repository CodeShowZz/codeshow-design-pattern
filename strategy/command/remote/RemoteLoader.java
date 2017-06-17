package headfirst.designpatterns.command.remote;

import headfirst.designpatterns.command.remote.action.CeilingFan;
import headfirst.designpatterns.command.remote.action.GarageDoor;
import headfirst.designpatterns.command.remote.action.Light;
import headfirst.designpatterns.command.remote.action.Stereo;
import headfirst.designpatterns.command.remote.command.CeilingFanOffCommand;
import headfirst.designpatterns.command.remote.command.CeilingFanOnCommand;
import headfirst.designpatterns.command.remote.command.GarageDoorDownCommand;
import headfirst.designpatterns.command.remote.command.GarageDoorUpCommand;
import headfirst.designpatterns.command.remote.command.LightOffCommand;
import headfirst.designpatterns.command.remote.command.LightOnCommand;
import headfirst.designpatterns.command.remote.command.StereoOffCommand;
import headfirst.designpatterns.command.remote.command.StereoOnWithCDCommand;
import headfirst.designpatterns.command.remote.control.RemoteControl;

public class RemoteLoader {
 
	public static void main(String[] args) {
		RemoteControl remoteControl = new RemoteControl();
 
		Light livingRoomLight = new Light("Living Room");
		Light kitchenLight = new Light("Kitchen");
		CeilingFan ceilingFan= new CeilingFan("Living Room");
		GarageDoor garageDoor = new GarageDoor("");
		Stereo stereo = new Stereo("Living Room");
  
		LightOnCommand livingRoomLightOn = 
				new LightOnCommand(livingRoomLight);
		LightOffCommand livingRoomLightOff = 
				new LightOffCommand(livingRoomLight);
		LightOnCommand kitchenLightOn = 
				new LightOnCommand(kitchenLight);
		LightOffCommand kitchenLightOff = 
				new LightOffCommand(kitchenLight);
  
		CeilingFanOnCommand ceilingFanOn = 
				new CeilingFanOnCommand(ceilingFan);
		CeilingFanOffCommand ceilingFanOff = 
				new CeilingFanOffCommand(ceilingFan);
 
		GarageDoorUpCommand garageDoorUp =
				new GarageDoorUpCommand(garageDoor);
		GarageDoorDownCommand garageDoorDown =
				new GarageDoorDownCommand(garageDoor);
 
		StereoOnWithCDCommand stereoOnWithCD =
				new StereoOnWithCDCommand(stereo);
		StereoOffCommand  stereoOff =
				new StereoOffCommand(stereo);
 
		remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
		remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
		remoteControl.setCommand(2, ceilingFanOn, ceilingFanOff);
		remoteControl.setCommand(3, stereoOnWithCD, stereoOff);
  
		System.out.println(remoteControl);
 
		remoteControl.onButtonWasPushed(0);
		remoteControl.offButtonWasPushed(0);
		remoteControl.onButtonWasPushed(1);
		remoteControl.offButtonWasPushed(1);
		remoteControl.onButtonWasPushed(2);
		remoteControl.offButtonWasPushed(2);
		remoteControl.onButtonWasPushed(3);
		remoteControl.offButtonWasPushed(3);
	}
}
