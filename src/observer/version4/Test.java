package observer.version4;

/**
 * 通过代码 将类图的大致轮廓表达出来
 * 至此,观察者模式结束
 * @author 黄二狗
 *
 */
public class Test {
  public static void main(String[] args) {
	  ConcreteSubject concreteSubject = new ConcreteSubject();
	  Observer observer = new ConcreteObserver(concreteSubject);
	  
	  //状态改变时通知观察者
	  concreteSubject.stateChanged();
}
}
