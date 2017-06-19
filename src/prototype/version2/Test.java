package prototype.version2;

/**
 * 还是小明这个人,只不过这次它多了一部手机
 * 
 * 问题其实就是因为默认的克隆方式并没有将引用也克隆出一份出来,所以我们要进行深度克隆
 * 请看下一版本
 * 
 * @author 黄二狗
 *
 */

public class Test {
  public static void main(String[] args) throws CloneNotSupportedException {
	   Student xiaoMing = new Student();
	   xiaoMing.setName("小明");
	   xiaoMing.setAge(18);
       Phone nokia = new Phone();
       nokia.setBrand("诺基亚");
       nokia.setPrice(2000);
       xiaoMing.setPhone(nokia);
       
       /*我们本以为应该克隆出另外一个拥有另外一部手机的小明,但下面的代码将会改变原本小明手机的价格
        * 这个不是我们想要的
        */
       Student cloneXiaoMing = xiaoMing.cloneStudent();
       cloneXiaoMing.getPhone().setPrice(500);
       
       System.out.println(xiaoMing.getPhone().getPrice());
       
}
}
