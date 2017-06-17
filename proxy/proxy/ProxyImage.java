package headfirst.designpatterns.proxy.proxy;

import headfirst.designpatterns.proxy.Image;
import headfirst.designpatterns.proxy.real.RealImage;

public class ProxyImage implements Image{

	   private RealImage realImage;
	   private String fileName;

	   public ProxyImage(String fileName){
	      this.fileName = fileName;
	   }

	   @Override
	   public void display() {
	      if(realImage == null){
	         realImage = new RealImage(fileName);
	      }
	      realImage.display();
	   }
	}
