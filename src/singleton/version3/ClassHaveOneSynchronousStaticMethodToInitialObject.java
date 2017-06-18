package singleton.version3;

/**
 * 解决多线程情况下可能出现的非单例问题的第一种方式：直接加同步,十分简单粗暴,很好的解决了问题.
 * 在这个版本就不测试了.
 * 理清思路,在下一个版本中,介绍多线程坏境下使用单例模式的性能问题.
 * 
 * @author 黄二狗
 *
 */

public class ClassHaveOneSynchronousStaticMethodToInitialObject {
   
    private static ClassHaveOneSynchronousStaticMethodToInitialObject singleInstance;
	
	private ClassHaveOneSynchronousStaticMethodToInitialObject() {
		
	}
	 
	// 这里加了同步关键字,从而阻止两个线程同时执行里面的代码
	public static synchronized ClassHaveOneSynchronousStaticMethodToInitialObject getInstance() {
		 
		if(singleInstance == null) {
			  singleInstance = new ClassHaveOneSynchronousStaticMethodToInitialObject();
		  }
		  return singleInstance;
	}
}
