package chainofresponsibility.version2;

public abstract class Handler {
  
	protected Handler superior;
	private String name;
	 
	public String getName() {
		return name;
	}
	
	public Handler(String name) {
		this.name = name;
	}
	
	public void setSuperior(Handler superior) {
		this.superior = superior;
	}
	
	public  abstract void handleRequest(int request);
}
