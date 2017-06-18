package strategy.version5;

/**
 * 灰色鸟居然能使用火箭喷射器飞了,而且是动态的赋予行为了.
 * 我们可以看到,这些行为可以动态的改变,很巧妙的解决了一开始的问题,其实这些行为也就是策略,
 * 总体来说这样的套路就叫做策略模式,感觉比它的官方定义好理解多了.
 * 
 * 到这里我们可以看到 我们将会变化的fly()行为和不会变的那些行为隔离出来了,不变的行为大家都继承,会变的提取
 * 出来封装成类。
 * 
 * 策略模式就是这样子!
 * 
 * @author 黄二狗
 *
 */

public class BirdTest {
    
	public static void main(String[] args) {
		Flyable flyNoway = new FlyNoway();
		Bird grayBird = new GrayBird(flyNoway);
		//一开始不会飞
		grayBird.performFly();
		
		Flyable flyWithRocket = new FlyWithRocket();
		grayBird.setFlyable(flyWithRocket);
		//使用火箭喷射器
		grayBird.performFly();
	}

}
