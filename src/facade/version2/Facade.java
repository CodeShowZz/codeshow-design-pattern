package facade.version2;

/**
 * 在这个版本中,根据类图写出结构代码
 * 
 * 
 * @author 黄二狗
 *
 */
public class Facade {
    SubSystemOne subSystemOne;
    SubSystemTwo subSystemTwo;
    SubSystemThree subSystemThree;
    SubSystemFour subSystemFour;
    
    public Facade(SubSystemOne subSystemOne,SubSystemTwo subSystemTwo,
    		SubSystemThree subSystemThree, SubSystemFour subSystemFour) {
    	this.subSystemOne = subSystemOne;
    	this.subSystemTwo = subSystemTwo;
    	this.subSystemThree = subSystemThree;
    	this.subSystemFour = subSystemFour;
    }
    
    public void methodA() {
    	subSystemFour.methodFour();
    	subSystemOne.methodOne();
    }
    
    public void methodB() {
    	subSystemOne.methodOne();
    	subSystemThree.methodThree();
    	subSystemTwo.methodTwo();
    }
}
