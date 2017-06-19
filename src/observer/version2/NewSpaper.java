package observer.version2;

import java.util.ArrayList;
import java.util.List;


/**
 *  接着上一版本的问题,上一版本提到报社要提供多种信息.所以报社面向的订阅者不能再只是NBA爱好者了
 *  还有音乐爱好者,新闻爱好者,等等,这些人都是观察者,所以这个时候要提供一个Lover接口,是订阅者的话
 *  就要实现这个接口,这样所有的这些爱好者都能收到报纸的更新信息,然后根据自己喜爱的内容来看.
 *  为了简便,直接在本类中修改.
 *  
 *  之后请看Test类
 */

public class NewSpaper {
     //提供多种信息
	private String nbaMessage;
	private String newsMessage;
	private String musicMessage;
	
	//这里的引用全部都要改成Lover(多态)
	
	List<Lover> loves = new ArrayList<>();
	
	public void addObserver(Lover lover) {
		loves.add(lover);
	}
	
	public void removeObserver(Lover lover) {
		loves.remove(lover);
	}
	
	public void notifyAllObserver() {
		for(Lover lover : loves){
			lover.update();
		}
	}
  
	//多个信息一起更新发布
    public void setMessage(String nbaMessage, String newsMessage, String musicMessage) {
    	this.nbaMessage = nbaMessage;
    	this.newsMessage = newsMessage;
    	this.musicMessage = musicMessage;
    	notifyAllObserver();
    }
	
	public String getNBAMessage() {
		return nbaMessage;
	}
	
	public String getMusicMessage() {
		return musicMessage;
	}
	
	public String getNewsMessage() {
		return newsMessage;
	}
	
}

interface  Lover {
	void update();
}

class NBALover implements Lover{
	private String name;
	private NewSpaper newSpaper;
	
	public NBALover(String name, NewSpaper newSpaper) {
        this.name = name;
		this.newSpaper = newSpaper;
		newSpaper.addObserver(this);
	}
	
	public void update() {
		System.out.println("报纸更新了, " +"NBA爱好者"+ name + "在看 ");
		System.out.println( "报纸内容:" + newSpaper.getNBAMessage());
	}
	
	void cancelSubscribe() {
		newSpaper.removeObserver(this);
	}
}

class MusicLover implements Lover{
	private String name;
	private NewSpaper newSpaper;
	
	public MusicLover(String name, NewSpaper newSpaper) {
        this.name = name;
		this.newSpaper = newSpaper;
		newSpaper.addObserver(this);
	}
	
	public void update() {
		System.out.println("报纸更新了, " +"音乐爱好者"+ name + "在看 ");
		System.out.println( "报纸内容:" + newSpaper.getMusicMessage());
	}
	
	void cancelSubscribe() {
		newSpaper.removeObserver(this);
	}
}

class NewsLover implements Lover{
	private String name;
	private NewSpaper newSpaper;
	
	public NewsLover(String name, NewSpaper newSpaper) {
        this.name = name;
		this.newSpaper = newSpaper;
		newSpaper.addObserver(this);
	}
	
	public void update() {
		System.out.println("报纸更新了, " + "新闻爱好者"+name + "在看 ");
		System.out.println( "报纸内容:" + newSpaper.getNewsMessage());
	}
	
	void cancelSubscribe() {
		newSpaper.removeObserver(this);
	}
	
}
