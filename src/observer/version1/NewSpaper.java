package observer.version1;

import java.util.ArrayList;
import java.util.List;


/**
 * 现在来看这么一个场景,一家报社提供了NBA新闻给NBA爱好者看,每当报纸内容更新,就会马上通知NBA爱好者
 * NBA爱好者可以选择订阅报纸,也可以选择取消订阅,为了明了,将代码写在这个类中
 * 在Test类中进行测试
 * 
 * @author 黄二狗
 *
 */

public class NewSpaper {
   
	private String nbaMessage;
	
	List<NBALover> nbaLoves = new ArrayList<>();
	
	public void addObserver(NBALover nbaLover) {
		nbaLoves.add(nbaLover);
	}
	
	public void removeObserver(NBALover nbaLover) {
		nbaLoves.remove(nbaLover);
	}
	
	public void notifyAllObserver() {
		for(NBALover nbaLover : nbaLoves){
			nbaLover.update();
		}
	}
	
	public void setNBAMessage(String nbaMessage) {
		this.nbaMessage = nbaMessage;
		notifyAllObserver();
	}
	
	public String getNBAMessage() {
		return nbaMessage;
	}
	
}

class NBALover {
	private String name;
	private NewSpaper newSpaper;
	
	public NBALover(String name, NewSpaper newSpaper) {
        this.name = name;
		this.newSpaper = newSpaper;
		newSpaper.addObserver(this);
	}
	
	public void update() {
		System.out.println("报纸更新了, " + name + "在看 ");
		System.out.println( "报纸内容:" + newSpaper.getNBAMessage());
	}
}
