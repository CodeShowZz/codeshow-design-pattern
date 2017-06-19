package abstractfactory.version1;

/**
 * 这个测试代码没有问题,但是实际上一个项目中,可能不止使用MySQl一种数据库(这里假设还有使用Oracle数据库),
 * 所以下面的DAO是面向实现编程
 * 下一个版本将会使用工厂方法进行改进
 * 
 * @author 黄二狗
 *
 */
public class Test {
    public static void main(String[] args) {
		User user = new User();
		//这里面向实现编程了,需要改正
		MySQLUserDAO mySQLUserDAO = new MySQLUserDAO();
		mySQLUserDAO.insert(user);
		mySQLUserDAO.getUser(1);
	}
}
