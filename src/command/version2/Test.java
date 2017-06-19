package command.version2;

/**
 * 完成了改进,在下一版本中,就将给出类图定义和结构代码
 * @author 黄二狗
 *
 */

public class Test {
  public static void main(String[] args) {
	 Cook cook =new Cook();
	 Command bakeMuttonCommand1 = new BakeMuttonCommand(cook);
	 Command bakeMuttonCommand2 = new BakeMuttonCommand(cook);
	 Command bakeChickenWingCommand1 = new BakeChickenWingCommand(cook);
	 Waiter waiter = new Waiter();
	 
	 //可以增加订单,取消订单
	 waiter.addOrder(bakeMuttonCommand1);
	 waiter.addOrder(bakeMuttonCommand2);
	 waiter.cancelOrder(bakeMuttonCommand2);
	 waiter.addOrder(bakeChickenWingCommand1);
	 
	 waiter.Notify();
}
}
