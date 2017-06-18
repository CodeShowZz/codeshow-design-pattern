package decorator.version5;

//抽象装饰类
public abstract class Decorator extends Component {
     private Component component;
   
	  @Override
      public void operation() {
	   component.operation();		
   	 }
	  
	 public Decorator(Component component) {
		 this.component = component;
	 }
}
