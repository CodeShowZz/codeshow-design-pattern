package observer.version1;

/**
 * 
 *  我们的需求达到了,但是仔细想想,如果一家报社专门就提供NBA的信息,那么很快就要倒闭了,如何解决这个问题呢？
 *  请看下一个版本...
 * 
 * 
 * @author 黄二狗
 */

public class Test {
   public static void main(String[] args) {
	   NewSpaper newSpaper = new NewSpaper();
	   NBALover nbaLover = new NBALover("黄二狗", newSpaper);
	   
	   newSpaper.setNBAMessage("勇士队击败骑士队夺冠");
	System.out.println("==================");
	   // 报纸再次更新
	   newSpaper.setNBAMessage("火箭队补强阵容,小乔丹老将底薪加盟");
}
}
