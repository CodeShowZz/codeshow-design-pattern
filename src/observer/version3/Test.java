package observer.version3;

/**
 * 从这个测试代码中,我们可以看到一个观察者可以选择不同的发布者,而一个发布者可以添加各种观察者
 * 其实也就是面向多态编程了,写代码要有扩展性,也就是多态运用得好,运用得多.s
 * 
 * 下一个版本将会提供类图定义和代码结构
 * 
 * @author 黄二狗
 *
 */

public class Test {
  public static void main(String[] args) {
	  NewSpaper newsPaper = new NewSpaper();
	  Observer nbaLover = new NBALover("黄二狗", newsPaper);
	  newsPaper.setMessage("76人队再次抽到状元签", "石油价格降低", "本周音乐风云榜排名公布");
	  
	  //一般来说,一开始是不会切换订阅的,一开始就会确定订阅什么信息
	  System.out.println("切换订阅");
	  
	  ShortMessage shortMessage = new ShortMessage();
	  Observer nbaLover2 = new NBALover("黄二狗",shortMessage);
	  shortMessage.setPhoneFee(20.0);
}
}
