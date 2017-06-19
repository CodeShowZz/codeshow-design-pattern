package state.version1;

/**
 * 状态模式是我最喜欢的一个模式了,感觉它很巧妙的切换了状态,第一次学习的时候感觉有点蒙,懂了之后
 * 就感觉非常爽.
 * 
 * 假设这样一个场景,我们学习有一个时间段,在特定的时间我们学习某个科目,或者睡觉,或者运动。
 * 最简单的代码如下.在特定的时间我们会做特定的事情,但是很有可能这个时间段分得很细,那么就有可能导致很冗长的判断代码,之后也不好维护.
 * 所以下一个版本我们要解决这个问题.
 * 
 * @author 黄二狗
 *
 */
public class Study {
  private int hour;
  
  public int getHour() {
	return hour;
}

public void setHour(int hour) {
	this.hour = hour;
}


public void study() {
	if(hour<9) {
		System.out.println("读语文书");
	} else if(hour<12) {
		System.out.println("做数学题");
	} else if(hour<20) {
		System.out.println("看电影");
	} else {
		System.out.println("睡觉");
	}
}
  
}
