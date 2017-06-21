package chainofresponsibility.version2;

public class ConcreteHandler3 extends Handler {

	public ConcreteHandler3(String name) {
		super(name);
	}

	@Override
	public void handleRequest(int request) {
		
	        if(request > 20 && request < 30) {
	        	System.out.println(super.getName() + "处理请求" + request);
	        } else if(superior != null) {
	        	superior.handleRequest(request);
	        }
		}        
}
