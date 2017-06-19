package proxy.version2;

/**
 * 代理模式有很多变种,在这里叫静态代理,在JDK中存在着动态代理
 * 但个人认为静态和动态只是语法问题.
 * 
 * 在下一个版本中,演示一下JDK提供的代理(经常被称为保护访问代理)
 * 
 * @author 黄二狗
 *
 */ 
public class Client {
   
   public static void main(String[] args) {
	   Proxy proxy = new Proxy();
	   proxy.request();
}
}
