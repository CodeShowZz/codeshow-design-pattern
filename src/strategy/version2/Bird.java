package strategy.version2;

/**
 *  公司提出某些鸟要有飞的行为,比如黑鸟和白鸟要有飞的行为,比如红鸟(没写出来)和灰鸟不要有飞的行为
 *  这个时候小张直接在Bird父类加上了fly()方法,它也知道灰鸟不会飞,于是乎它重写了了灰鸟的飞行方法,
 *  让函数体什么也不做.
 *  
 *  但其实这样的解决办法不怎么符合逻辑,并且有很多鸟都不会飞,那么也都重写为空吗?
 *  
 *  于是机智的小张想到了另外一个办法
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
   
   public void fly() {
	   System.out.println("飞行");
   }
}


class BlackBird extends Bird {
	
}

class WhiteBird extends Bird {
	
}

class GrayBird extends Bird {
	
	@Override
	public void fly() {
		
	}
	
}