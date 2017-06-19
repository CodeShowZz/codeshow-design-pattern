package prototype.version1;

/**
 * 在这里,我们说的是原型模式.
 * 个人觉得原型模式和单例模式一样都不能算成设计模式
 * 我的意思是它们本质上来看就是语法问题
 * 
 * 原型模式对应于语言中的克隆,就是根据一个对象的状态复制一份一样状态的对象,但是他们
 * 不是同一个对象,所以地址不同.
 * 
 * Java提供了一个clone()方法,因为语法限制,克隆只能在本类中调用
 * 所以需要暴露一个方法给外面进行克隆。并且语法的问题,
 * 能被克隆的对象要实现Cloneable接口,否则会抛出异常
 * 
 * 克隆其实很简单,在下一版本中将说明克隆需要注意的地方
 * 
 * @author 黄二狗
 *
 */

public class Student implements Cloneable{
  private String name;
  private int age;

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
  
public Student cloneStudent() throws CloneNotSupportedException{
	return (Student) this.clone();
}

}
