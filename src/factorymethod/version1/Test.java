package factorymethod.version1;

/**
 * 工厂方法就像简单工厂很像,只不过以方法的形式生成了对象.在共有的方法中调用了工厂方法来获取一个对象,而这个对象交
 * 给子类去实例化.
 * 下一版本,给出类图和定义
 * 
 * @author 黄二狗
 *
 */
public class Test {
   public static void main(String[] args) {
	PizzaStore shangHaiPizzaStore = new ShangHaiPizzaStore();
	Pizza pizza = shangHaiPizzaStore.orderPizza("上海牛肉");
	System.out.println("================");
	PizzaStore beiJingPizzaStore = new BeijingPizzaStore();
	pizza = beiJingPizzaStore.orderPizza("北京牛肉");
} 
}
