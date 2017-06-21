package chainofresponsibility.version2;

public class ConcreteHandler1 extends Handler {

	public ConcreteHandler1(String name) {
		super(name);
	}

	@Override
	public void handleRequest(int request) {
       if(request >= 0 && request < 10) {
    	   System.out.println(super.getName() + "处理请求" + request);
       } else if(superior != null) {
    	   superior.handleRequest(request);
       }
	}
}
