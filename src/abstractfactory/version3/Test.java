package abstractfactory.version3;

/**
 * 我们可以看到,没有什么太大的问题.
 * 但是使用抽象工厂(也就是现在所使用的这种模式)也存在着缺点
 * 比如我们现在增加一个表Teacher,那么需要增加TeacherDAO MySQLTeacherDAO OracleTeacherDAO这三个类
 * 还要更改DAOFactory，MySQLFactory,OracleFactory,有点麻烦 
 * 
 * 所以对于目前的这个问题,我们使用简单工厂直接改进这个抽象工厂方法,在下一版本给出。
 * 
 * @author 黄二狗
 *
 */
public class Test {
  public static void main(String[] args) {
	User user =new User();
	Student student = new Student();
	
	//需要切换数据库时只需要修改一行代码
	DAOFactory daoFactory = new OracleDAOFactory();
	
	UserDAO userDAO = daoFactory.createUserDAO();
	userDAO.insert(user);
	userDAO.getUser(1);
	
	StudentDAO studentDAO = daoFactory.createStudentDAO();
	studentDAO.insert(student);
	studentDAO.getStudent(2);
}
}
