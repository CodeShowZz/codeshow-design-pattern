package proxy.version2;

public class RealSubject implements Subject{

	@Override
	public void request() {
         System.out.println("真正的请求");
	}

}
