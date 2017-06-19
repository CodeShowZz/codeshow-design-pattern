package command.version1;

/**
 * 有这样一个场景,比如我们去吃饭,如果大家都直接和厨师说要做什么,要吃什么,那么经常出现的情况就是厨师记不住,有可能
 * 忘记炒某道菜了,有可能客人点菜的顺序记错了,所以这个时候需要菜单,还需要服务员.
 * 
 * 点某道菜就相当于一个命令,对应下面的Command
 * 炒菜的人就是执行该命令的人,对应下面的Cook
 * 通知执行命令的的人,对应下面的Waiter
 * 而我们就是告诉服务员要吃什么的人,相当于客户端
 * 
 * 请看Test类
 * 
 * @author 黄二狗
 *
 */


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



class Waiter {
	private Command command;
	
	public void setOrder(Command command) {
		this.command = command;
	}
	
	public void Notify() {
		command.executeCommand();
	}
}

