package builder.version2;

import java.util.ArrayList;
import java.util.List;

public class Product {
   List<String> parts = new ArrayList<>();
   
   public void add(String part) {
	   parts.add(part);
   }
   
   public void show() {
	   System.out.println("产品展示");
	   for(String part : parts) {
		   System.out.println(part);
	   }
   }
}
