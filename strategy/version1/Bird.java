package strategy.version1;

/**
 * 有一个关于鸟的系统,
 * 有黑鸟,白鸟,灰鸟,起初这三种鸟都能跑能跳,它们继承共同的父类鸟,下面的类并无任何问题
 * 接下来,公司为了提高竞争力,提出了改进意见
 * 理清思路,再看下一个版本.
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
}


class BlackBird extends Bird {
	
}

class WhiteBird extends Bird {
	
}

class GrayBird extends Bird {
	
}