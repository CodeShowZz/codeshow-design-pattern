package mediator.version2;

public abstract class Colleague {
    private Mediator mediator;
    private String name;
    
    public void setName(String name) {
    	this.name = name;
    }
    
    public void setMediator(Mediator mediator) {
    	this.mediator = mediator;
    }
    
    public void sendMessage(String message) {
       mediator.exchangeMessage(message, this);	
    }
    
    public void receiveMessage(String message) {
    	System.out.println(name+"收到消息,消息内容为:"+message);
    }
}
