package singleton.version5;

/**
 * 使用预先加载的方式,不会有线程安全的问题,简单粗暴,代码稍有改动.看起来十分简洁
 * 
 * 至此,单例模式已经介绍完毕.
 * 
 * @author 黄二狗
 *
 */


public class ClassHaveOneStaticMethodToInitialObject {
     //这里预先实例化
    private static ClassHaveOneStaticMethodToInitialObject singleInstance = 
    		new ClassHaveOneStaticMethodToInitialObject();
    
	private ClassHaveOneStaticMethodToInitialObject() {
		
	}

	public static ClassHaveOneStaticMethodToInitialObject getInstance() {

		  return singleInstance;
	}
}
