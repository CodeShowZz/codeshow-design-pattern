package prototype.version2;

import java.security.KeyStore.PrivateKeyEntry;

/**
 * 克隆需要注意什么问题呢?
 * 
 * 大家都知道一个对象里面有引用类型和基本类型,默认的克隆方式的机制如下:
 * 1 将基本类型的值赋予克隆出来的对象,这个很简单
 * 2 引用类型的值也是赋予克隆出来的对象
 * 
 * 这里注意到,引用类型的值也被赋予给克隆出来的对象
 * 这导致被克隆的对象的某些引用和克隆出来的对象的某些引用指向的是同一个对象(而不是复制)
 * 如果被克隆出来的对象通过这个引用改变了指向的那个对象的状态,那么原本那个被克隆
 * 的对象的某些引用指向的对象的状态也改变了.
 * 
 * 这里说的有点太绕,直接看代码吧。
 * 接着看Test类
 * 
 * @author 黄二狗
 *
 */

//注意学生类中多了一个指向Phone对象的引用
public class Student implements Cloneable{
   private Phone phone;
   private String name;
   private int age;
   
   public Phone getPhone() {
	return phone;
}
   public void setPhone(Phone phone) {
	this.phone = phone;
}
   public String getName() {
	return name;
}
   public void setName(String name) {
	this.name = name;
}
   public int getAge() {
	return age;
}
   public void setAge(int age) {
	this.age = age;
}
   public Student cloneStudent() throws CloneNotSupportedException {
	   return (Student) this.clone();
   }
   
}


class Phone {
	private double price;
	private String brand;
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	
}
