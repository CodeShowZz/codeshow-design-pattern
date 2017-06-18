package singleton.version4;

/**
 *  多线程环境下单例为什么会存在性能问题呢?
 *  因为同步确实解决了问题,但是同步只是在第一次创建对象时起到了作用,在之后同步就失去了作用
 *  同步使得性能降低了,解决方法是"双重检查",不要被术语给吓到了,直接看下面的代码就知道怎么回事了.
 *  在下一个版本,给出预先加载的例子,它不存在线程安全的问题,是一个简单粗暴的方式.
 * @author 黄二狗
 *
 */

public class ClassHaveDoubleLockStaticMethodToInitialObject {
   
    private static ClassHaveDoubleLockStaticMethodToInitialObject singleInstance;
	
	private ClassHaveDoubleLockStaticMethodToInitialObject() {
		
	}
	 
	public static  ClassHaveDoubleLockStaticMethodToInitialObject getInstance() {
		 
		//如果已经实例化,那么就直接返回,这样能保证以后调用该方法,不用再进行同步的判断,提高性能
		if(singleInstance == null) {
			//如果未实例化,再进行同步
			  synchronized (ClassHaveDoubleLockStaticMethodToInitialObject.class) {
				  if(singleInstance == null)
					  singleInstance = new ClassHaveDoubleLockStaticMethodToInitialObject();
			}
		  }
		  return singleInstance;
	}
}
