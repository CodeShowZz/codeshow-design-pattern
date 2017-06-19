package state.version2;

/**
 * 就不卖关子了,其实我们做事情的时间段就是一种状态,比如我们现在分为早上,中午,下午,晚上即可,实际上有
 * 可能分得更细,那么有什么办法能使得无论分得多细我们都能很容易的添加一个状态进去,而不用进行很长的判断?
 * 在这里,就直接的实现这个模式,这个模式其实要多研究代码的走向,就很容易懂了.
 * 再看Test类
 * 
 * @author 黄二狗
 *
 */

class Study {
  private State state;
  private int hour;
  
  public void setState(State state) {
		this.state = state;
	}
	
  public int getHour() {
		return hour;
	}
  
  public void setHour(int hour) {
	this.hour = hour;
}

  public Study() {
	  //初始化是早上
	  state = new Morning();
  }
  
  //时间流逝
  public void timeGoesBy() {
	  state.handle(this);
  }
}

public abstract class State {
  public abstract void handle(Study study);
}


class Morning extends State{

	@Override
	public void handle(Study study) { 
		if(study.getHour()< 12) {
			System.out.println("早上");
		} else {
			study.setState(new Afternoon());
			study.timeGoesBy();
		}
	}
}

class Afternoon extends State {

		@Override
		public void handle(Study study) { 
			if(study.getHour()< 16) {
				System.out.println("下午");
			} else {
				study.setState(new Evening());
				study.timeGoesBy();
		}
	}
}

class Evening extends State {
	
	@Override
	public void handle(Study study) { 
		if(study.getHour()< 24) {
			System.out.println("晚上");
		} else {
	       System.out.println("凌晨");
	}
}
	
}
	
