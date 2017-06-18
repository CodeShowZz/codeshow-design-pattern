package templatemethod.version5;

/**
 * 如果前面的例子看懂了,这个也就一目了然了.
 * 至此,用通用代码去表达类图也完成了.模板方法模式到此完结.
 * 
 * @author 黄二狗
 *
 */
public class Test {
  public static void main(String[] args) {
	 AbstractClass abstractClass = new ConcreteClass1();
	 AbstractClass abstractClass2 = new ConcreteClass2();
	 
	 abstractClass.templateMethod();
	 abstractClass2.templateMethod();
}
}
