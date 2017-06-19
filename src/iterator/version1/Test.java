package iterator.version1;

import java.util.ArrayList;

/**
 * 已经在默认提供的两个数据结构中初始化了学生对象,在Test中测试如何迭代它们
 * 可以看到我们迭代一个数据结构的时候都要知道它们真实的数据表示,有没有什么方式能我们不需要了解它们的内部表示
 * 以一个统一的方式来访问这些数据结构呢?下一个版本就要解决这个问题
 * 
 * 
 * @author 黄二狗
 *
 */
public class Test {
  public static void main(String[] args) {
	   //迭代第一种数据结构
	  StudentArray studentArray = new StudentArray();
	  Student students [] = studentArray.getStudents();
	  for(int i=0; i<students.length;i++) {
		  Student student = students[i];
		  if(student != null) {
		  System.out.println("姓名:"+student.getName());
		  System.out.println("年龄:"+student.getAge());
	  }
	  }
		  
	//迭代第二种数据结构
		 StudentArrayList studentArrayList = new StudentArrayList();
		 ArrayList students2 = studentArrayList.getStudents();
		 for(int i = 0; i<students2.size();i++) 
		 {
			 Student student2 = (Student) students2.get(i);
			  System.out.println("姓名:"+student2.getName());
			  System.out.println("年龄:"+student2.getAge());
		 }
		 
	}
  }

	  
	  

