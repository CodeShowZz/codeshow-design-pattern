package prototype.version3;

import java.security.KeyStore.PrivateKeyEntry;

/**
 * 
 * 这个版本我们要进行深度克隆,也就是在学生中的手机也要调用它的clone()方法,这样才能使得克隆出来的对象和
 * 被克隆出来的对象不是只想同一个引用.
 * 有人会说String字符串也要克隆吗?其实不需要,因为String是不可变的,
 * 这东西就不需要控制了,大家都分享一个不可变的东西反而性能更好.
 * 而对于引用的可变对象就要进行深度克隆,就是连这个引用的对象也要调用clone()方法.
 *  
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
   
   //这里是关键,进行深度克隆
   public Student cloneStudent() throws CloneNotSupportedException {
	   
      Student student = (Student) this.clone();
      student.phone = phone.clonePhone();
      return student;
   }
   
}


class Phone implements Cloneable{
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
	
	public Phone clonePhone() throws CloneNotSupportedException {
		return (Phone) this.clone();
	}
	
}
