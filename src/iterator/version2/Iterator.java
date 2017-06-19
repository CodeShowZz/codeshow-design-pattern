package iterator.version2;

import java.util.ArrayList;

/**
 *  数组迭代器和列表迭代器都需要实现Itertor接口
 * 
 * @author 黄二狗
 *
 */

//声明如何迭代一个集合
public interface Iterator<Student> {
    boolean hasNext();
    Student next();
}

class StudentArrayItertor implements Iterator<Student> {

	 int position =0;
	 private Student [] students;
	 
     public StudentArrayItertor(Student [] students) {
        this.students = students;
	 }
	
	
	@Override
	public boolean hasNext() {
		if(position > students.length -1 || students[position] == null) {
			return false;
		} 
		    return true;
	}

	@Override
	public Student next() {
	    Student student = students[position];
	    position++;
	    return student;
	}  
	
}


class StudentArrayListIterator implements Iterator<Student> {

	private ArrayList students;
	private int position = 0;
	private int size;
	
	public  StudentArrayListIterator(ArrayList<Student> students) {
		this.students = students;
		this.size = students.size();
	}
	
	@Override
	public boolean hasNext() {
		return position < size;	
	}

	@Override
	public Student next() {
	   Student student =  (iterator.version2.Student) students.get(position);
	   position = position +1;
	   return student;
	}
	
}
