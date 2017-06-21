package chainofresponsibility.version2;

public class Client {
  public static void main(String[] args) {
	  Handler handler1 = new ConcreteHandler1("处理者1");
	  Handler handler2 = new ConcreteHandler2("处理者2");
	  Handler handler3 = new ConcreteHandler3("处理者3");
      handler1.setSuperior(handler2);
      handler2.setSuperior(handler3);
      
      int [] requests = { 1, 23, 35, 17, 9};
      
      for(int request : requests) {
    	  System.out.println(request);
    	  handler1.handleRequest(request);
      } 
  }
}
