package memento.version1;

import memento.version2.GameRole;

/**
 * 下面的代码模拟了一个手动保存进度且在战斗之后挂掉恢复到原始状态的场景
 *  看起来好像并没有什么问题,但是需要我们手动保护和获取状态,太麻烦了.能不能有一些方法来使得保存和获取状态
 *  更简洁?
 * 
 *  在下一个版本中将会介绍.
 *  
 * 
 * @author 黄二狗
 *
 */
public class Test {
  public static void main(String[] args) {
	  GameRole huangErGou = new GameRole();
	  
	  //初始化状态
	  huangErGou.initState();
	  huangErGou.displayState();
	  
	  //保存进度  
	  GameRole scheduleOfNow = new GameRole();
	  scheduleOfNow.setBloodVolume(huangErGou.getBloodVolume());
	  scheduleOfNow.setAttackValue(huangErGou.getAttackValue());
	  scheduleOfNow.setDefenceValue(huangErGou.getDefenceValue());
	  
	  System.out.println();
	  
	  //战斗,假设挂掉了
	  huangErGou.fight();
	  huangErGou.displayState();
	  
	  System.out.println();
	  //恢复之前状态
	  huangErGou.setBloodVolume(scheduleOfNow.getBloodVolume());
	  huangErGou.setAttackValue(scheduleOfNow.getAttackValue());
	  huangErGou.setDefenceValue(scheduleOfNow.getDefenceValue());
	  huangErGou.displayState();
	
}
}
