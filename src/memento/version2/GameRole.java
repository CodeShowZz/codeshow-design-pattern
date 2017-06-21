package memento.version2;

/**
 * 有这样一个场景,你打游戏,最开始有一个角色,有血量,攻击力和防御力,你可以显示自己的状态
 * 这里假设你一旦fight,你就会挂掉.  所以一开始你把一个状态保存着,等你挂掉的时候再回来,当然在这个类中
 * 表达不出你保存的情况,在写一个改进版本就会很清楚的看到我们如何保存状态.
 * 
 * 请看Test类
 * 
 * 
 * @author 黄二狗
 *
 */
public class GameRole {
	  
	private int bloodVolume;
	private int attackValue;
	private int defenceValue;
	 
	public int getBloodVolume() {
		return bloodVolume;
	}
	public void setBloodVolume(int bloodVolume) {
		this.bloodVolume = bloodVolume;
	}
	public int getAttackValue() {
		return attackValue;
	}
	public void setAttackValue(int attackValue) {
		this.attackValue = attackValue;
	}
	public int getDefenceValue() {
		return defenceValue;
	}
	public void setDefenceValue(int defenceValue) {
		this.defenceValue = defenceValue;
	}
	
	public RoleStateManager saveState() { 
		RoleStateManager roleStateManager = new RoleStateManager();
		RoleStateMemento roleStateMemento = new RoleStateMemento();
		roleStateMemento.setBloodVolume(this.getBloodVolume());
	    roleStateMemento.setAttackValue(this.getAttackValue());
	    roleStateMemento.setDefenceValue(this.getDefenceValue());
		roleStateManager.setRoleStateMemento(roleStateMemento);
		return roleStateManager;
	}
	
	public void restoreState(RoleStateMemento roleStateMemento) {
	   this.bloodVolume = roleStateMemento.getBloodVolume();
	   this.attackValue = roleStateMemento.getAttackValue();
	   this.defenceValue = roleStateMemento.getDefenceValue();
	}
	
	public void displayState() {
		System.out.println("角色当前状态:");
		System.out.println("血量:" + this.bloodVolume);
		System.out.println("攻击力:" + this.attackValue);
		System.out.println("防御力:" + this.defenceValue);
	}
	
	public void initState() {
		this.bloodVolume = 100;
		this.attackValue = 100;
		this.defenceValue = 100;
	}
	
	public void fight() {
		this.bloodVolume = 0;
		this.attackValue = 0;
		this.defenceValue = 0;
	}
}

class RoleStateMemento {
	
	private int bloodVolume;
	private int attackValue;
	private int defenceValue;
	 
	public int getBloodVolume() {
		return bloodVolume;
	}
	public void setBloodVolume(int bloodVolume) {
		this.bloodVolume = bloodVolume;
	}
	public int getAttackValue() {
		return attackValue;
	}
	public void setAttackValue(int attackValue) {
		this.attackValue = attackValue;
	}
	public int getDefenceValue() {
		return defenceValue;
	}
	public void setDefenceValue(int defenceValue) {
		this.defenceValue = defenceValue;
	}
}

class RoleStateManager {
	private RoleStateMemento roleStateMemento;

	public RoleStateMemento getRoleStateMemento() {
		return roleStateMemento;
	}

	public void setRoleStateMemento(RoleStateMemento roleStateMemento) {
		this.roleStateMemento = roleStateMemento;
	}

}

