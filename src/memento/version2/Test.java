package memento.version2;



/**
 * 将状态存储起来不暴露给外部,这样就能解决之前的问题了
 * 这就是备忘录模式,在下一个版本将会给出类图定义和结构代码
 * @author 黄二狗
 *
 */
public class Test {
  public static void main(String[] args) {
	  GameRole huangErGou = new GameRole();
	  huangErGou.initState();
	  huangErGou.displayState();
	  System.out.println();
	  
	  //获取游戏状态管理器
	  RoleStateManager roleStateManager = huangErGou.saveState();
	  
	  //打怪挂掉
	  huangErGou.fight();
	  huangErGou.displayState();
	  
	  System.out.println();
	  //恢复状态,但客户端并不需要知道初始状态是什么.
	  huangErGou.restoreState(roleStateManager.getRoleStateMemento());
	  huangErGou.displayState();
	  
}
}
