 package prototype.version3;

/**
 * 
 * 还是上一版本的测试代码
 * 但是从测试结果来看,可以看出解决了上一版本留下的问题
 * 
 * 至此,原型模式介绍完毕.
 * 
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
       
       /*下面的代码不会改变原本小明手机的价格,也就是确实也克隆出了一个新手机
        * 这个是我们想要的
        */
       Student cloneXiaoMing = xiaoMing.cloneStudent();
       cloneXiaoMing.getPhone().setPrice(500);
       
       System.out.println(xiaoMing.getPhone().getPrice());
       
}
}
