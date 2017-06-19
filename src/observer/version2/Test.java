package observer.version2;

/**
 * 到这里,我们把上一版本的问题解决了，但是对于一个用户来说,不仅应该可以订阅报纸,还可以选择
 * 订阅其它东西,比如短信通知,那么怎么定义多个发布者才能更加具有扩展性呢?
 * 下一个版本将会解决这个问题.
 * 
 * @author 黄二狗
 *
 */

public class Test {
   public static void main(String[] args) {
	 NewSpaper newSpaper = new NewSpaper();
	 Lover nbaLover = new NBALover("黄二狗", newSpaper);
     Lover musicLover = new MusicLover("王小慧", newSpaper);
     Lover newsLover = new NewsLover("老王", newSpaper);
     
     newSpaper.setMessage("76人队再次抽到状元签", "石油价格降低", "本周音乐风云榜排名公布");
     
     System.out.println("===============");
     // 黄二狗取消订阅
     NBALover huangergou = (NBALover)nbaLover;
     huangergou.cancelSubscribe();
     //再次更新新闻
     newSpaper.setMessage("莫雷再现神交易", "大米价格有所上涨", "本年度最佳灵魂歌手获得者公布");
     
     
   }
}
