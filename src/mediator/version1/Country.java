package mediator.version1;

/**
 * 在这一版本中介绍中介者模式
 * 中介就是充当中间人来传达信息.
 * 感觉用代码来说明还是最直观的,就不废话了.
 *
 *下面的代码讲述的是一个联合国作为中介传达消息的故事.
 *再看Test类
 * 
 * 
 * @author 黄二狗
 *
 */


//抽象国家类
public abstract class Country {
  private String name;
  private UnitedNation unitedNation; 
  
  public void setName(String name) {
	this.name = name;
}

public void setUnitedNation(UnitedNation unitedNation) {
	this.unitedNation = unitedNation;
}

public void sendMessage(String message) {
	  unitedNation.exchangeMessage(message, this);
  }
  
  public void receiveMessage(String message) {
	  System.out.println(name+"获取消息,消息内容: " + message);
  } 
}

class China extends Country{

}

class American extends Country {

}

class Russia extends Country {

}

//联合国抽象父类
abstract class UnitedNation {
  public abstract void exchangeMessage(String message,Country country);
}

//联合国安全理事会作为真正的中介来传递信息
class UnitedSecurityCouncil extends UnitedNation {

	//理事会知道美国,俄罗斯和中国
	private China china;
	private American american;
	private Russia russia;
	
    public UnitedSecurityCouncil(China china, American american, Russia russia) {
	     this.china = china;
	     this.american = american;
	     this.russia = russia;
}

	@Override
	public void exchangeMessage(String message, Country country) {
		 //中国发出的消息,美国和俄罗斯接收,以此类推  
		if(country == china) {
			 american.receiveMessage(message);
			 russia.receiveMessage(message);
		 } else if (country == american) {
			 china.receiveMessage(message);
			 russia.receiveMessage(message);
		 } else if (country == russia) {
			 american.receiveMessage(message);
			 china.receiveMessage(message);
		 }
	}
	
	
	
}


