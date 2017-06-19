package abstractfactory.version3;

/**
 * 我直接在这个类中进行改进.
 * 再看Test类
 *
 * @author 黄二狗
 *
 */

public class User {
  private int id;
  private String name;
}

class Student {
  private int id;
  private String name;
  private String major;
}

interface DAOFactory {
	UserDAO createUserDAO();
	StudentDAO createStudentDAO();
}

class MySQLDAOFactory implements DAOFactory {

	@Override
	public UserDAO createUserDAO() {
	   return new MySQLUserDAO();
	}

	@Override
	public StudentDAO createStudentDAO() {
	   return new MySQLStudentDAO();
	}
}

class OracleDAOFactory implements DAOFactory {

	@Override
	public UserDAO createUserDAO() {
	  return new OracleUserDAO();
	}

	@Override
	public StudentDAO createStudentDAO() {
	  return new OracleStudentDAO();
	}
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
