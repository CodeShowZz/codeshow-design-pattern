package strategy.version6;

/**
 * 这个版本直接看类图,定义,代码,就不多说什么了
 * 
 * @author 黄二狗
 *
 */

public class Context {
   Strategy strategy;
   
   public void setStrategy(Strategy strategy) {
	this.strategy = strategy;
  }
   
   public void contextInterface() {
	   strategy.algorithmInterface();
   }
}
