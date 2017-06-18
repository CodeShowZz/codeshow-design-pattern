package decorator.version4;

import org.omg.CORBA.PUBLIC_MEMBER;

/**
 * 在这个类中,是配料组件,这些配料可以在配料的基础上再加配料
 * 最终达成的效果就好像链表一样,计算价格时调用上一个组件(饮料或配料)的价格
 * 请看Test类
 * 
 * @author 黄二狗
 *
 */

//配料抽象类
public abstract class Burdening extends Beverage{
   //为了达到装饰的效果,这个地方是重点
    Beverage beverage; 	
	public abstract String getDescription();
	
	public Burdening(Beverage beverage) {
		this.beverage = beverage; 
    
  }
	
	@Override
	public double cost() {
		return beverage.cost();
	}
} 

class Ice extends Burdening{
	public Ice(Beverage beverage) {
		super(beverage);
	}


	@Override
	public String getDescription() {
	   return beverage.getDescription() + "加冰";
	}


	@Override
	public double cost() {
	  return super.cost() + 1;
	}
}

class Lemon extends Burdening {
	
	public Lemon(Beverage beverage) {
		super(beverage);
	}


	@Override
	public String getDescription() {
	   return beverage.getDescription() + "加柠檬";
	}
	
	@Override
	public double cost() {
	  return super.cost() + 4;
	}
}

class Sugar extends Burdening {
	 
		 public Sugar(Beverage beverage) {
			super(beverage);	
		 }
		@Override
		public String getDescription() {
		   return beverage.getDescription() + "加糖";
		}
		
		@Override
		public double cost() {
		  return super.cost() + 0.5;
		}
}

