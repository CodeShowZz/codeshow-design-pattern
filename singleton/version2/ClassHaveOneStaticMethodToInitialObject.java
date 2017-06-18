package singleton.version2;


//这里继续使用上个版本的类
public class ClassHaveOneStaticMethodToInitialObject {
   
    private static ClassHaveOneStaticMethodToInitialObject singleInstance;
    
	private ClassHaveOneStaticMethodToInitialObject() {
		
	}

	public static ClassHaveOneStaticMethodToInitialObject getInstance() {
		  
		if(singleInstance == null) {
			  singleInstance = new ClassHaveOneStaticMethodToInitialObject();
		  }
		  return singleInstance;
	}
}
