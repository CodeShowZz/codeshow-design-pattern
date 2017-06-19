package state.version2;
/**
 * 时间状态是连在一起的,如果添加更多的状态也没有什么问题,很具有扩展性
 * 下一个版本,将介绍类图,定义以及大致结构.
 * 
 * @author 黄二狗
 *
 */
public class Test {
   public static void main(String[] args) {
	  Study study = new Study();
	  study.setHour(8);
	  study.timeGoesBy();
	  
	  study.setHour(12);
	  study.timeGoesBy();
	  
	  study.setHour(14);
	  study.timeGoesBy();
	  
	  study.setHour(23);
	  study.timeGoesBy();
}
}
