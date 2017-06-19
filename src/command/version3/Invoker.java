package command.version3;

public class Invoker {
   private Command command;
   
   public void setCommand(Command command) {
	   this.command = command;
   }
   
   public void execuCommand() {
	   command.execute();
   }
}
