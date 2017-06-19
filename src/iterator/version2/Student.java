package iterator.version2;

import java.util.ArrayList;
import java.util.List;

/**
 *  为了解决上面的数据表示问题,我们需要使用一种叫迭代器的东西,小张和小李都必须去实现它们各自的迭代器,
 *  而目前的数据结构不需要改变,现在这里的两种表示学生的集合需要实现一个共同的接口,叫做StudenCollection,都必须实现一个可以
 *  生成一个迭代器的方法.而迭代器的实现请看Iterator类
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

interface StudentCollection {
   Iterator<Student> createIteror();
}



class StudentArray implements StudentCollection{
	private final int MAX_SIZE = 6;
	Student [] students;
	int studentsIndex = 0;
	
	public StudentArray() {
	   this.students = new Student[MAX_SIZE];	
	  addStudent("小明", 5);
	  addStudent("小东", 6);
	  addStudent("小李", 9);
	  addStudent("小张", 8);
	}
	
	public void addStudent(String name, int age) {
		
		if(studentsIndex  > MAX_SIZE -1) {
			System.out.println("该数组已经满了,无法再添加学生");
		} else {
			Student student = new Student(name,age);
			students[studentsIndex] = student;
			studentsIndex ++;
		}
	}
	
	public Student [] getStudents() {
		return students;
	}

	@Override
	public Iterator<Student> createIteror() {
	    return new StudentArrayItertor(students);
	}			
}

class StudentArrayList implements StudentCollection {
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

	@Override
	public Iterator<Student> createIteror() {
		return new StudentArrayListIterator(students);
	}
	
	
}


