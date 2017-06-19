package abstractfactory.version2;

/**
 * 看起来已经解决上一版本的问题了,现在的需求又变了,希望增加一个对学生表的操作
 * 其实这问题并不难,和User的处理是一样的,在下一个版本中实现。
 * 
 * @author 黄二狗
 *
 */
public class Test {
  public static void main(String[] args) {
	 User user = new User();
	 //如果要切换成MySQL数据库,只需要切换这一行代码
	 DAOFactory factory = new OracleDAOFactory();
	 
	 UserDAO  userDAO =factory.createUserDAO();
	 userDAO.insert(user);
	 userDAO.getUser(1);
}
}
