package strategy.version5;

/**
 * 小张在Bird类又添加了一个方法,setFlayable(Flayable),这样就能动态的切换飞这个行为了。
 * 除此之外,小张还实现了一个FlyWithRocket类,来使用火箭喷射器,灰色鸟怎么使用火箭喷射器的?
 * 理清思路,再看BirdTest
 *
 * @author 黄二狗
 *
 */
public abstract class Bird {
	
  private Flyable flyable;
  
  public void performFly() {
	  flyable.fly();
  }
	
  public void setFlyable(Flyable flyable) {
	this.flyable = flyable;
}
   
  public Bird(Flyable flyable) {
	  this.flyable = flyable;
  }
  
   public void run() {
	   System.out.println("跑");
   }
   
   public void jump() {
	   System.out.println("跳");
   }
   //飞这个行为已经变成接口了
}


//下面的子类并没有实现任何接口
class BlackBird extends Bird{
 
	public BlackBird(Flyable flyable) {
		super(flyable);
	}
	
}

class WhiteBird extends Bird{
	
	public WhiteBird(Flyable flyable) {
		super(flyable);
	}
	
}

class GrayBird extends Bird {
	
	public GrayBird(Flyable flyable) {
		super(flyable);
	}
	
}