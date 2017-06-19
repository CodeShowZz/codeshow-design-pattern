package abstractfactory.version5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
/**
 * 为了切换数据库,我们只需要简单的修改配置文件即可,非常方便,使用MySQL时写成MySQL,使用Oracle时改为Oracle,
 * 
 * @author 黄二狗
 *
 */
public class Test {
 public static void main(String[] args) throws FileNotFoundException, InstantiationException, IllegalAccessException, ClassNotFoundException {
  
	 UserDAO userDAO = DataAccess.createUserDAO();
     User user = new User();
    userDAO.insert(user);
}
}
