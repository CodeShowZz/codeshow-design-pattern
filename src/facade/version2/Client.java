package facade.version2;

/**
 * 到此,外观模式叙述完毕.
 * @author 黄二狗
 *
 */

public class Client {
   public static void main(String[] args) {
	  SubSystemOne subSystemOne = new SubSystemOne();
	  SubSystemTwo subSystemTwo = new SubSystemTwo();
	  SubSystemThree subSystemThree = new SubSystemThree();
	  SubSystemFour subSystemFour = new SubSystemFour();
	  Facade facade = new Facade(subSystemOne, subSystemTwo, subSystemThree, subSystemFour);
	  facade.methodA();
	  System.out.println("-----------");
	  facade.methodB();
}
}
