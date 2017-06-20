package factorymethod.version2;

public class Product {
    private String name;

    public Product(String name) {
    	this.name = name;
    }
  
	public void commonMethod() {
		System.out.println("处理叫做"+name+"的产品");
	}
  
}


