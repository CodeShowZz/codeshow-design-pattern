package mediator.version2;

public class ConcreteMediator extends Mediator{
     ConcreteColleague1 concreteColleague1;
     ConcreteColleague2 concreteColleague2;
	@Override
	public void exchangeMessage(String message, Colleague colleague) {
	   if(concreteColleague1 == colleague) {
		   concreteColleague2.receiveMessage(message);
	   } else if(concreteColleague2 == colleague) {
		   concreteColleague1.receiveMessage(message);
	   }
	}
     public ConcreteMediator(ConcreteColleague1 concreteColleague1,ConcreteColleague2 concreteColleague2) {
    	 this.concreteColleague1 = concreteColleague1;
    	 this.concreteColleague2 = concreteColleague2;
     }
}
