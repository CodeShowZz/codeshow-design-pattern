package proxy.version2;

public class Proxy implements Subject {

	RealSubject realSubject;
	
	public Proxy() {
		this.realSubject = new RealSubject();
	}
	
	@Override
	public void request() {
		System.out.println("请求前");
        realSubject.request();
		System.out.println("请求后");
	}

}
