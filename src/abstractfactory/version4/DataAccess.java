package abstractfactory.version4;
/**
 * 为了方便,我们使用简单工厂,在这里只要我们稍微修改一下
 * databaseName,就能在MySQL和Oracle之间自由切换了
 * 请看Test类
 * 
 * @author 黄二狗
 *
 */


public class DataAccess {
  private static final String databaseName = "MySQL";
  
  public static UserDAO createUserDAO() {
	  UserDAO userDAO =null;
	  switch (databaseName) {
	  case "MySQL" :
		userDAO = new MySQLUserDAO();
		break;
     
	  case "Oracle":
		userDAO = new OracleUserDAO();
		break;
	}
	  return userDAO;
  }
  
  public static StudentDAO createStudentDAO() {
	  StudentDAO studentDAO =null;
	  switch (databaseName) {
	  case "MySQL" :
		studentDAO = new MySQLStudentDAO();
		break;
		
	  case "Oracle":
		studentDAO = new OracleStudentDAO();
		break;
	}
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