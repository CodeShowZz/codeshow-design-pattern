package chainofresponsibility.version2;

public class ConcreteHandler2 extends Handler {

	public ConcreteHandler2(String name) {
		super(name);
	}

	@Override
	public void handleRequest(int request) {
        if(request >= 10 && request < 20) {
        	System.out.println(super.getName() + "处理请求" + request);
        } else if(superior != null) {
        	superior.handleRequest(request);
        }
	}   
}
