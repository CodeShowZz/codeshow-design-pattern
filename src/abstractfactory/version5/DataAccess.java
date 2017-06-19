package abstractfactory.version5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * 在这个版本中,要使用配置加反射的方式来读取数据库名,并动态的获取DAO对象.
 *  利用反射,就可以动态的生成对象,将switch语句全部消灭掉
 *  虽然我们只是草草的讲了抽象工厂模式,但是这个模式挺简单
 *  在下一个版本将给出类图和定义
 *
 * @author 黄二狗
 *
 */


public class DataAccess {

	 private static String databaseName;
	 
  static {
  	try {
  	    File file = new File("src/abstractfactory/version5/db.txt");
	    Scanner scanner =new Scanner(file);
	    databaseName = scanner.nextLine();
         } catch (FileNotFoundException e) {
	      e.printStackTrace();
         }	
	   }  

  //下面的两个方面使用了反射,所以switch被消灭掉了.
  public static UserDAO createUserDAO() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
	   Class<UserDAO> userDAOClass = (Class<UserDAO>) Class.forName("abstractfactory.version5." + databaseName + "UserDAO");
	   UserDAO userDAO =userDAOClass.newInstance();
	   return userDAO;
  }
  
  public static StudentDAO createStudentDAO() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
	  Class<StudentDAO> studentDAOClass = (Class<StudentDAO>) Class.forName("abstractfactory.version5." + databaseName + "StudentDAO");
	  StudentDAO studentDAO =studentDAOClass.newInstance();
	  return studentDAO;
  }
}

class User {
	  private int id;
	  private String name;
	}

	class Student {
	  private int id;
	  private String name;
	  private String major;
	}



interface UserDAO {
	void insert(User user);
	User getUser(int id);
}

interface StudentDAO {
	void insert(Student student);
	Student getStudent(int id);
}

class OracleUserDAO implements UserDAO {
	
	public void insert(User user) {
		System.out.println("使用Oracle给User表插入一条记录");
	}
	
	public User getUser(int id) {
		System.out.println("在Oracle中根据id获取一条User记录");
		return null;
	}
}

class MySQLUserDAO implements UserDAO{
	public void insert(User user) {
		System.out.println("使用MYSQL给User表插入一条记录");
	}
	
	public User getUser(int id) {
		System.out.println("在MYSQL中根据id获取一条User记录");
		return null;
	}
}

class MySQLStudentDAO implements StudentDAO{
	public void insert(Student user) {
		System.out.println("使用MYSQL给Student表插入一条记录");
	}
	
	public Student getStudent(int id) {
		System.out.println("在MYSQL中根据id获取一条Student记录");
		return null;
	}
}

class OracleStudentDAO implements StudentDAO{
	public void insert(Student user) {
		System.out.println("使用Oracle给Student表插入一条记录");
	}
	
	public Student getStudent(int id) {
		System.out.println("在Oracle中根据id获取一条Student记录");
		return null;
	}
}