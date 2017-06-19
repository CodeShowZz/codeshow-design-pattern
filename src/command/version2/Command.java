package command.version2;


import java.util.ArrayList;
import java.util.List;

/**
 * 为了改进上一版本所说的东西,其实就只需要改进服务员这个类,毕竟我们是和服务员交互的,而服务员去通知执行
 * 为了更醒目,将改进的服务员类放在最上面的位置.请再看Test类
 * 
 * @author 黄二狗
 *
 */

class Waiter {
	private List <Command> orders = new ArrayList<>();
	
	public void addOrder(Command command) {
		orders.add(command);
	}
	
	public void cancelOrder(Command command) {
		orders.remove(command);
	}
	
	public void Notify() {
	    for(Command order : orders) {
	    	order.executeCommand();
	    }
	}
}


public abstract class Command {
   protected Cook cook;
   
   public Command(Cook cook) {
	   this.cook = cook;
   }
   
   abstract public void executeCommand();
}

class BakeMuttonCommand extends Command {
	public BakeMuttonCommand(Cook cook) {
		super(cook);
	}
	
	public void executeCommand() {
		cook.bakeMutton();
	}
}

class BakeChickenWingCommand extends Command {
	public BakeChickenWingCommand(Cook cook) {
		super(cook);
	}

	@Override
	public void executeCommand() {
      cook.backChickenWing();
	}
}

 class Cook {
    public void bakeMutton() {
    	System.out.println("烤羊肉串");
    }
    
    public void backChickenWing() {
    	System.out.println("烤鸡翅");
    }
}



