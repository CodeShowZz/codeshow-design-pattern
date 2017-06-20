package builder.version1;

/**
 * 下一版本,给出类图定义及其代码结构
 * @author 黄二狗
 *
 */
public class Test {
  public static void main(String[] args) {
	 PersonBuilder thinPersonBuilder = new PersonThinBuilder();
	 PersonDirector personDirector = new PersonDirector(thinPersonBuilder);
	 personDirector.createPerson();
	 
	 System.out.println();
	 
	 PersonBuilder fatPersonBuilder = new PersonFatBuilder();
	 personDirector = new PersonDirector(fatPersonBuilder);
	 personDirector.createPerson();
	 
}
}
