package singleton.version1;

/**
 * 
 * 运行下列代码 
 * 下面的代码会打印出"确实是单例",看样子好像大功告成了,
 * 其实还是有问题的,那就是多线程带来的问题
 * 理清思路,再看 version2.
 * 
 * @author 黄二狗
 *
 */

public class SingletonTest {
  
	public static void main(String[] args) {
		ClassHaveOneStaticMethodToInitialObject singleton = ClassHaveOneStaticMethodToInitialObject.
				getInstance();
		ClassHaveOneStaticMethodToInitialObject singleton2 = ClassHaveOneStaticMethodToInitialObject.
				getInstance();
		if(singleton == singleton2) {
			System.out.println("确实是单例");
		} else {
			System.out.println("不是单例");
		}	
	}
}
