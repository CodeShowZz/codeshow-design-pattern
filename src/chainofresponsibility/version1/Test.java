package chainofresponsibility.version1;

/**
 * 在这里我们看到经理知道总监,总监知道总经理,这样请求可以从经理那里开始处理,当然也可以直接让总监或总经理处理
 * 下一个版本,将给出类图定义及其结构代码
 * 
 * @author 黄二狗
 *
 */
public class Test {
  public static void main(String[] args) {
	 Manager commonManager = new CommonManger("经理");
	 Manager majorDemo = new Majordomo("总监");
	 Manager generalManager = new GengralManager("总经理");
	 commonManager.setSuperior(majorDemo);
	 majorDemo.setSuperior(generalManager);
	 
	 Request request = new Request();
	 request.setType("请假");
	 request.setContent("二狗请假");
	 request.setCount(1);
	 commonManager.applyRequest(request);
	 
	 Request request2 = new Request();
	 request2.setType("请假");
	 request2.setContent("二狗请假");
	 request2.setCount(4);
	 commonManager.applyRequest(request2);
	 
	 Request request3 = new Request();
	 request3.setType("加薪");
	 request3.setContent("二狗请求加薪");
	 request3.setCount(500);
	 commonManager.applyRequest(request3);
	 
	 Request request4 = new Request();
	 request4.setType("加薪");
	 request4.setContent("二狗请求加薪");
	 request4.setCount(1000);
	 commonManager.applyRequest(request4);
}
}
