package decorator.version5;

/**
 * 通过测试代码 来看看这些组件如何组合在一起的
 * 
 * @author 黄二狗
 *
 */
public class Test {
  public static void main(String[] args) {
	 Component component = new ConcreteDecoratorB(
			 new ConcreteDecoratorA(
					 new ConcreteComponent()));

     component.operation(); 
  }
	
}
