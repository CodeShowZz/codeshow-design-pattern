package facade.version1;

/**
 * 测试遥控器是否能很好的控制那些设备
 * 
 * @author 黄二狗
 *
 */
public class Test {
   public static void main(String[] args) {
	 Light light = new Light();
	 Fan fan = new Fan();
	 Computer computer = new Computer();
	 AirCondition airCondition = new AirCondition();
	 RemoteControl remoteControl = new RemoteControl(light, computer, fan, airCondition);
	 remoteControl.pressFirstButton();
	 System.out.println("-------------------");
	 remoteControl.pressSecondButton();
	 System.out.println("-------------------");
	 remoteControl.pressThirdButton();
}
}
