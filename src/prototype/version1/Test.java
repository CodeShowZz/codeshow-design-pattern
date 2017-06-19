package prototype.version1;

/**
 * 在这里,克隆出了小明 
 * 
 * @author 黄二狗
 *
 */
public class Test {
  public static void main(String[] args) throws CloneNotSupportedException {
	   Student xiaoMing = new Student();
	   xiaoMing.setName("小明");
	   xiaoMing.setAge(18);
      
	   Student cloneXiaoMing = xiaoMing.cloneStudent();
	   System.out.println(cloneXiaoMing.getName());
	   System.out.println(cloneXiaoMing.getAge());
}
}
