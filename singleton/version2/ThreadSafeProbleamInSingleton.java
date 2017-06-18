package singleton.version2;

/**
 * 下面这个例子来说明在多线程环境下,单例模式有可能会出现非单例的情况
 * 这个例子非单例的可能性有点小,但有可能因为微小的可能性毁了一个应用程序
 * 
 * 反复运行下列程序,就有可能出现非单例的情况,原因是多线程情况下两个线程可能同时进入到一个代码块里面执行
 * 
 * 问题解析:
 * 		if(singleInstance == null) {
 *	                 当第一个线程进来的时候,还没实例化对象的时候,第二个线程在判断是否已经实例化
 *        这个时候就有可能出现两个线程同时来到这个if语句内生成两个对象                        
 *			  singleInstance = new ClassHaveOneStaticMethodToInitialObject();
 *		  }
 *		  return singleInstance;
 *	}
 * 
 * 理清思路,下一个版本就要解决这个问题
 * 
 * 
 * @author 黄二狗
 *
 */

public class ThreadSafeProbleamInSingleton {
  
	public static void main(String[] args) throws InterruptedException {
      	
	  //在正常情况下 打印出的两个对象的地址是一样的,但是多尝试几次,就有可能出现不一样的地址,也就是非单例情况	
		Runnable createSingletonTask = new CreateSingletonTask();
        Thread thread1 = new Thread(createSingletonTask);
        Thread thread2 = new Thread(createSingletonTask);
        thread1.start();
        thread2.start();
	}	
}

class CreateSingletonTask implements Runnable {

	// 这里是重点,最终调用的是单例类的静态方法来创建对象
	public  void createSingleton() {
	 ClassHaveOneStaticMethodToInitialObject singleton = ClassHaveOneStaticMethodToInitialObject.getInstance();
	 System.out.println(singleton);
	}
	
	@Override
	public void run() {
		createSingleton();
	}
}
