package abstractfactory.version2;

/**
 *我们现在直接在这个类中进行修改,在这个版本中我们使用工厂方法来修改代码
 *这个时候再看Test类
 *为了简便,都直接写在这个类中
 *
 * @author 黄二狗
 *
 */

public class User {
  private int id;
  private String name;
}

interface DAOFactory {
	UserDAO createUserDAO();
}

class MySQLDAOFactory implements DAOFactory {

	@Override
	public UserDAO createUserDAO() {
	   return new MySQLUserDAO();
	}
}

class OracleDAOFactory implements DAOFactory {

	@Override
	public UserDAO createUserDAO() {
	  return new OracleUserDAO();
	}
}

interface UserDAO {
	void insert(User user);
	User getUser(int id);
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
