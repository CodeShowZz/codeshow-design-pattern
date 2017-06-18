package facade.version1;

/**
 *  现在要将的这个模式其实很简单,叫做外观模式
 *  所谓的外观模式,就是暴露一个方法给你,你调用那个方法,外观这个对象就可以帮你做
 *  一系列的事情,外观给你暴露的这个方法只是拿一系列事情的总结,你不需要知道外观
 *  怎么做到的.
 *  
 *  假设现在我们有一个遥控器,这个遥控器可以控制电灯,电脑,风扇,空调
 *  遥控器上有许多按键,比如第一个按键可以打开电灯和电脑,
 *  第二个按键关闭电扇和空调,第三个按键打开电灯和空调,等等
 *  其实事情已经很简单了.所有的代码都写在这个类中,看看Test类
 *  
 *  下一个版本 我们就会看到类图和定义
 *  
 * @author 黄二狗
 *
 */

//遥控器(外观)
public class RemoteControl {
     Light light;
     Computer computer;
     Fan fan;
     AirCondition airCondition;
     
     public RemoteControl(Light light,Computer computer,Fan fan,AirCondition airCondition) {
    	 this.light = light;
    	 this.computer = computer;
    	 this.fan = fan;
    	 this.airCondition = airCondition;
     }
     
     public void pressFirstButton() {
    	 light.open();
    	 computer.open();
     }
     
     public void pressSecondButton() {
    	 fan.close();
    	 airCondition.close();
     }
     
     public void pressThirdButton() {
    	 light.open();
    	 airCondition.open();
     }
     
     //还能补充很多
}

class Light {
	public void open() {
		System.out.println("电灯打开");
	}
	
	public void close() {
		System.out.println("关闭电灯");
	}
}

class Computer {
	public void open() {
		System.out.println("电脑打开");
	}
	
	public void close() {
		System.out.println("关闭电脑");
	}
}

class Fan {
	public void open() {
		System.out.println("风扇打开");
	}
	
	public void close() {
		System.out.println("关闭风扇");
	}	
}

class AirCondition {
	public void open() {
		System.out.println("空调打开");
	}
	
	public void close() {
		System.out.println("关闭空调");
	}
}

