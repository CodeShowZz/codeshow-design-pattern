package factorymethod.version1;

/**
 * 举个例子,假设我们要卖披萨,现在我们有两家分店,一家开在北京,一家开在上海,这两家分店的产品是一样的,但口味不一样.
 * 披萨是分店提供的,但是披萨的加工过程是总部规定的(相当于父类).
 * 从这个例子中,我们直接实现工厂方法.在看Test类
 * 
 * 为了简单,把代码全部写在这个类中
 * 
 * 
 * @author 黄二狗
 *
 */


public abstract class Pizza {
    String description;
    public String getDescription() {
    	return description;
    }
    
    public void cut() {
    	System.out.println("专业的切"+description);
    }
    
    public void packet() {
    	System.out.println("熟练的打包"+description);
    }
}

class ShangHaiChickenPizza extends Pizza {
	public ShangHaiChickenPizza() {
	  this.description = "上海鸡肉披萨";
	}
}

class ShangHaiBeefPizza extends Pizza {
	public ShangHaiBeefPizza() {
		this.description = "上海牛肉披萨";
	}
}

class BeiJingChickenPizza extends Pizza {
	public BeiJingChickenPizza() {
	  this.description = "北京鸡肉披萨";
	}
}

class BeiJingBeefPizza extends Pizza {
	public BeiJingBeefPizza() {
		this.description = "北京牛肉披萨";
	}
}

abstract class PizzaStore {
	//这个方法交给子类去实现,这个方法其实就是工厂方法
  public abstract Pizza createPizza(String type);
  
  public Pizza orderPizza(String type) {
	  Pizza pizza = createPizza(type);
	  pizza.cut();
	  pizza.packet();
	  return pizza;
  }
}

class ShangHaiPizzaStore extends PizzaStore {

	//上海工厂方法制作上海口味披萨
	@Override
	public Pizza createPizza(String type) {
		Pizza pizza = null;
		 if(type.equals("上海牛肉")) {
			 pizza = new ShangHaiBeefPizza();
		 } else if(type.equals("上海鸡肉")) {
			 pizza = new ShangHaiChickenPizza();
		 }
		    return pizza;
	}
} 

class BeijingPizzaStore extends PizzaStore {
	
	//北京工厂方法制作北京口味披萨
	@Override
	public Pizza createPizza(String type) {
		Pizza pizza = null;
		 if(type.equals("北京牛肉")) {
			 pizza = new BeiJingBeefPizza();
		 } else if(type.equals("北京鸡肉")) {
			 pizza = new BeiJingChickenPizza();
		 }
		 return pizza;
	}
	
}



