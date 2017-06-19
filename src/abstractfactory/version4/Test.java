package abstractfactory.version4;
/**
 * 现在已经感觉很清爽了,其实还有更好的办法来给DataAccess类的databaseName赋值
 * 那就是使用读取配置文件的方式,并且加上反射机制,我们就不需要Switch语句了,将在下个版本中给出
 * 
 * @author 黄二狗
 *
 */
public class Test {
  public static void main(String[] args) {
	User user = new User();
	Student student = new Student();
	
	UserDAO userDAO = DataAccess.createUserDAO();
	userDAO.insert(user);
	userDAO.getUser(1);
	
	StudentDAO studentDAO = DataAccess.createStudentDAO();
	studentDAO.insert(student);
	studentDAO.getStudent(2);
}
}
