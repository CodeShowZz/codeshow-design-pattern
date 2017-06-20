package mediator.version2;

public class Test {
   public static void main(String[] args) {
	  ConcreteColleague1 colleague1 = new ConcreteColleague1();
	  ConcreteColleague2 colleague2 = new ConcreteColleague2();
	  
	  Mediator mediator = new ConcreteMediator(colleague1,colleague2);
	  colleague1.setName("同事1号");
	  colleague1.setMediator(mediator);
	  colleague2.setName("同事2号");
	  colleague2.setMediator(mediator);
	  
	  //其实同事一也不知道会发给谁
	  colleague1.sendMessage("你还爱我吗?");
	  
	  //同事1 乱发了一句
	  colleague2.sendMessage("爱");
	  
}
}
