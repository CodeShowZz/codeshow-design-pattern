package decorator.version4;

/**
 * 通过测试来说明如何实现可乐加柠檬再加冰块,并且能很好的算出价钱
 * 在举个雪碧加糖再加柠檬再加糖再加冰块的例子,加深理解
 * 管它能不能喝呢..
 * 
 * 这个例子其实就是装饰者的一个比较明显的例子了,接着下一个版本将会
 * 给出类图和准确的定义,并且给出一个该模式的结构代码
 * 
 * @author 黄二狗

 */ 
public class Test {
   public static void main(String[] args) {
	 //可乐加柠檬再加冰块
	 Beverage cokeAddLemonAddIce = new Ice(new Lemon(new Coke()));
     double cokeAddLemonAddIceCost = cokeAddLemonAddIce.cost();
     String cokeAddLemonAddIceDescription = cokeAddLemonAddIce.getDescription();
     System.out.println(cokeAddLemonAddIceCost);
     System.out.println(cokeAddLemonAddIceDescription);
     
     //雪碧加糖再加柠檬再加糖再加冰块
     Beverage sprintAddSugarAddLemonAddSugarAddIce = 
    		 new Ice(new Sugar(new Lemon(new Sugar(new Sprint()))));
     double sprintAddSugarAddLemonAddSugarAddIceCost = 
    		 sprintAddSugarAddLemonAddSugarAddIce.cost();
     String sprintAddSugarAddLemonAddSugarAddIceDescription =
    		 sprintAddSugarAddLemonAddSugarAddIce.getDescription();
     System.out.println(sprintAddSugarAddLemonAddSugarAddIceCost);
     System.out.println(sprintAddSugarAddLemonAddSugarAddIceDescription);
   
  }
}
