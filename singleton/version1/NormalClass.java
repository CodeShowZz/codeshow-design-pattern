package singleton.version1;

/**
 * 
 *  一个普通的类一般会提供一个很简单的构造器,只要这个类公开了,到处都可以实例化.
 *  只要你喜欢,你可以不断的生成那个类的对象,但是每次生成的那个对象都不是同一个,最终的地址都不一样.
 *  但是,有可能出于某种目的,你可能想要使得一个类生成的对象只有一个,那么怎么办呢?看完下面的代码
 *  理清思路再看NormalClassHavePrivateConstructor这个类.
 *  
 * @author 黄二狗
 *
 */

public class NormalClass {
	
	//注意:这里的构造器是公有的,在下一个例子中,你将会看到不一样的修饰符
	public NormalClass() {
		
	}

}
