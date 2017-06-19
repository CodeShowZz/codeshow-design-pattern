package command.version1;
/**
 * 从测试中可以很清楚的看出命令模式是如何实现的,其实命令只是暴露了一个简单的方法出来
 * 然后让我们挑选某个命令,最终如何执行不需要我们关心.
 * 
 * 当然,在这个版本中,还是不够的,比如我们还应该能设置多个命令,等我们点完了,服务员再去通知
 * 还有应该还可以取消某个命令,在下一个版本加以改进.
 * 
 * 
 * @author 黄二狗
 *
 */
public class Test {
	public static void main(String[] args) {
		Cook cook  = new Cook();
		//烤羊肉命令和厨师绑定
		Command bakeMuttonCommand = new BakeMuttonCommand(cook);
		//烤鸡翅命令和厨师绑定
		Command bakeBakeChickenWingCommand = new BakeChickenWingCommand(cook);
		
		//当然 还可以把烤羊肉和烤鸡翅组合成一个命令
		
		Waiter waiter = new Waiter();
	    waiter.setOrder(bakeMuttonCommand);
	    waiter.Notify();
	    
	    waiter.setOrder(bakeBakeChickenWingCommand);
	    waiter.Notify();
		
		
 	}
}
