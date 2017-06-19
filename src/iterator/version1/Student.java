package iterator.version1;

import java.util.ArrayList;
import java.util.List;

/**
 * 公司开发系统,里面记录学生的记录
 * 小张用数组来存储学生,而小李用ArrayList来存储学生
 * 别人可以用它们提供的类来增加学生和获取所有学生的记录
 * 为了方便,小张和小李的实现都现在这个类中.两个人开发出来的东西都是一样的,只是它们的使用方式不一样,使用它们开发的东西的人必须有要清楚
 * 内部的学生对象是按照什么方式组织的,然后遍历内部的数据.请看Test类
 * 
 * 
 * 
 * @author 黄二狗
 *
 */
public class Student {
    private String name;
    private int age;
    
    public Student(String name, int age) {
    	this.name = name;
    	this.age = age;
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
    
}

class StudentArray {
	private final int MAX_SIZE = 6;
	Student [] students;
	int numOfStudents = 0;
	
	public StudentArray() {
	   this.students = new Student[MAX_SIZE];	
	  addStudent("小明", 5);
	  addStudent("小东", 6);
	  addStudent("小李", 9);
	  addStudent("小张", 8);
	}
	
	public void addStudent(String name, int age) {
		
		if(numOfStudents > MAX_SIZE -1) {
			System.out.println("该数组已经满了,无法再添加学生");
		} else {
			Student student = new Student(name,age);
			students[numOfStudents] = student;
			numOfStudents++;
		}
	}
	
	public Student [] getStudents() {
		return students;
	}			
}

class StudentArrayList {
	private ArrayList<Student> students;
	
	public StudentArrayList() {
		students = new ArrayList<>();
		  addStudent("小明", 5);
		  addStudent("小东", 6);
		  addStudent("小李", 9);
		  addStudent("小张", 8);
	}
	
	public void addStudent(String name, int age) {
		Student student = new Student(name,age);
		students.add(student);
	}
	
	public ArrayList <Student> getStudents() {
		return students;
	}
	
	
}


