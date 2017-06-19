package iterator.version2;

/**
 * 通过这个迭代器的实现,我们给外部暴露的是一个Iterator的使用,而使用者不需要知道内部的数据是如何表示的.
 * 在下一个版本,给出类图和结构定义
 * 
 * 
 * @author 黄二狗
 *
 */
public class Test {
	
	public static void main(String[] args) {
		 //通过实现的迭代器,现在可以不用知道我们要迭代的对象集合的真正的数据表示了
	   StudentCollection studentCollection = new StudentArray();
	   Iterator<Student> studentIterator1 = studentCollection.createIteror();
	   printStudents(studentIterator1);
	   
	   System.out.println("===============================");
	   
	   StudentCollection studentCollection2 = new StudentArrayList();
	   Iterator<Student> studentIterator2 = studentCollection2.createIteror();
	   printStudents(studentIterator2);
          

	}
  
     /**
      * 因为我们不用知道所用对象的内部数据的真正表示,所以可以使用下列通用的方法来迭代	
      * @param studentIterator
      */
	public static void printStudents(Iterator<Student> studentIterator) {
		while(studentIterator.hasNext()) {
			Student student = studentIterator.next();
			System.out.println("名字:"+student.getName());
			System.out.println("年龄:"+student.getAge());
		}
		
	}
}
