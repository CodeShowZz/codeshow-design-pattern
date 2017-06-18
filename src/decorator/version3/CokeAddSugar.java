package decorator.version3;

/**
 * 最开始的想法是这样的,如果是可乐加糖,就是实现一个类叫做可乐加糖,类似的有雪碧加柠檬
 * 芬达加冰,并且返回正确的价格.一开始听起来还很有道理的样子,但是仔细想想饮料不止这三种
 * ,后续还会推出很多饮料和配料,想起来这简直是一个恶梦的开始.
 * 
 * 接下来的版本将会解决这个问题.
 * 
 * @author 黄二狗
 *
 */
public class CokeAddSugar {
   
	public double cost() {
		return 3.5;
	}
}

class SprintAddLemon {
	
	public double cost() {
		return 6.5;
	}
}

class FentaAddIce {
	
	public double cost() {
		return 5.0;
	}
}
