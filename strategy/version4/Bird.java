package strategy.version4;

/**
 *  小张突然想到,能否把飞的这些方法提取出来,封装到一个类中。
 *  于是乎,就有了很多行为类,FlyWithWing(会飞),FlyNoway(不会飞),
 *  小张心想这下子大家都继承一个引用就可以了,除此之外大家都还要继承一个performFly()行为.
 *  用测试代码来说明现象,请看BirdTest
 *  
 * @author 黄二狗
 *
 */

public abstract class Bird {
	
  private Flyable flyable;
  
  public void performFly() {
	  flyable.fly();
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