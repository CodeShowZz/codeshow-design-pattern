package abstractfactory.version1;

/**
 * 假设 这样一个场景,我们有User对象,现在我们要使用MySQL数据库来存储这个对象
 * 这里没有真正的使用MYSQL驱动,因为我们在模式,而不是在进行数据库操作
 * 
 * 为了简便,将代码写在这个类中,在看Test类
 * 
 * @author 黄二狗
 *
 */

public class User {
  private int id;
  private String name;
}

class MySQLUserDAO {
	public void insert(User user) {
		System.out.println("使用MYSQL给User表插入一条记录");
	}
	
	public User getUser(int id) {
		System.out.println("在MYSQL中根据id获取一条User记录");
		return null;
	}
}
