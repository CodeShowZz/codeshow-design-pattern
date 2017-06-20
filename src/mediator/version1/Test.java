package mediator.version1;

/**
 * 在下一个版本中给出类图定义和具体结构
 * 
 * @author 黄二狗
 */
public class Test {
  public static void main(String[] args) {
	  
	  China china = new China();
	  American american = new American();
	  Russia russia = new Russia();
	 
	  UnitedNation unitedSecurityCouncil = new UnitedSecurityCouncil(china, american, russia);
      china.setUnitedNation(unitedSecurityCouncil);
      china.setName("中国");
      american.setUnitedNation(unitedSecurityCouncil);
      american.setName("美国");
      russia.setUnitedNation(unitedSecurityCouncil);
	  russia.setName("俄罗斯");
  	  
  /*  将会通知美国和俄罗斯,但是信息是先发给联合国的,联合国再转发给美国和俄罗斯,因此中国不必关心其它国家
	    而是交给让联合国(终结者)去关心
	    */
	  china.sendMessage("中国即将发射神州8号飞船");
	  
	  System.out.println();
      american.sendMessage("美国军队驻扎非洲某部落");
      
      System.out.println();
      russia.sendMessage("俄罗斯研发出新型武器");
}
}
