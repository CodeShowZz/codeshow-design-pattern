package adapter.version3;

//客户端
public class Client {
  public static void main(String[] args) {
	 Target target = new Adapter(new Adaptee());
	 target.request();
}
}
