package singleton.version1;

/**
 * 
 * 在这个例子中构造器被私有化了,这个时候如果下面的这个类不再修改,那么它将永远的不能生成一个实例.
 * 私有化的原因是因为如果公开化了,是无法保证单例的.
 * 理清思路请看下一个类 ClassHaveOneStaticMethodToInitialObject
 * 
 * @author 黄二狗
 *
 */


public class NormalClassHavePrivateConstructor {
   
	//构造器被私有化了
	private NormalClassHavePrivateConstructor() {
	   
   }
}
