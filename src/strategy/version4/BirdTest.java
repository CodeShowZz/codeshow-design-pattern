package strategy.version4;

/**
 * 从这个测试代码可以发现,我们的飞行行为是我们给予鸟类的,而不是使用继承或者使用接口把代码写死的。
 * 这个时候老王走了过来,对小张说:"小伙子啊,悟性挺高的!不过你想想是不是可以做的更好一点,让鸟的飞行行为
 * 可以随意的变换,毕竟有时候系统和现实有点不一样,比如鸟的行为下一次有可能更新的,我给你提个建议,你让灰色的
 * 鸟想不会飞就不会飞,想使用火箭喷射器飞就使用火箭喷射器飞." 小张怎么做的? 请看下一版本
 * 
 * 
 * @author 黄二狗
 *
 */

public class BirdTest {
    
	public static void main(String[] args) {
		Flyable flyWithWing = new FlyWithWing();
		Flyable flyNoway = new FlyNoway();
		Bird whiteBird = new WhiteBird(flyWithWing);
		Bird blackBird = new BlackBird(flyWithWing);
		Bird grayBird = new GrayBird(flyNoway);
		
		whiteBird.performFly();
		blackBird.performFly();
		grayBird.performFly();
	}

}
