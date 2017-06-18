package strategy.version3;

/**
 *  小张说了,既然有的类有飞这个行为,有的类没有飞这个行为,那么就搞一个接口出来,有飞这个行为的鸟实现这个接口
 *  没有飞这个行为的鸟就别实现这个接口.
 *  
 *  部门里经验丰富的老王看了小张写的代码,问道:我们接下来还有非常多的鸟,那会飞的都实现接口,
 *  那代码是不是一点都没有复用呢?比如黑鸟和白鸟的行为完全一样,能不能想办法复用呢?
 *  
 *  小张急了,心里暗想:"TMD,之前继承不行,现在实现接口也不行,叫我怎么办?"老王从小张的眼神里看到了焦急,
 *  于是对小张说了一句:"合二为一."小张一下子顿悟了,小张如何解决这个问题的?
 *  理清思路,请看下一个版本.
 *  
 * @author 黄二狗
 *
 */

public abstract class Bird {
   public void run() {
	   System.out.println("跑");
   }
   
   public void jump() {
	   System.out.println("跳");
   }
   
   //飞这个行为已经变成接口了
}


class BlackBird extends Bird implements Flyable{

	@Override
	public void fly() {
	   System.out.println("飞行");	
	}
	
}

class WhiteBird extends Bird implements Flyable{

	@Override
	public void fly() {
		 System.out.println("飞行");
	}
	
}

class GrayBird extends Bird {
	
	
}