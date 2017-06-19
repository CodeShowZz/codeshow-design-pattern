package observer.version3;

import java.util.ArrayList;
import java.util.List;

import javax.lang.model.type.PrimitiveType;

/**
 * 接着上个版本,上个版本留下的问题是一个用户可以选择订阅其它信息,所以这个时候,所以这个时候NBA爱好者
 * 不能只知道报社,还要知道短信,等等,所以我们需要抽象出一个Publisher接口,这个时候所有的爱好者的引用
 * 应该是Publisher,这样一个用户可以订阅其它的信息。  为了更明了,将所有的类放在这个类中,观察者类缩减到两个
 * 实际的发布者类也有两个,再看Test类
 * 
 * 所以这个模式把面向多态编程体现得淋漓尽致.
 * 
 * 观察下面的代码
 * 
 * 
 * @author 黄二狗
 *
 */


interface Publisher {
   void addObserver(Observer observer);
   void removeObserver(Observer observer);
   void notifyAllObserver();
}

public class NewSpaper implements Publisher{
     //提供多种信息
	private String nbaMessage;
	private String newsMessage;
	private String musicMessage;
	
	
	List <Observer> observers = new ArrayList<>();
	
	public void addObserver(Observer observer) {
		observers.add(observer);
	}
	
	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}
	
	public void notifyAllObserver() {
		for(Observer observer : observers){
			observer.update();
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


class ShortMessage implements Publisher {
    private double phoneFee;
    
    List <Observer> observers = new ArrayList<>();
	
	public void addObserver(Observer observer) {
		observers.add(observer);
	}
	
	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}
	
	public void notifyAllObserver() {
		for(Observer observer : observers){
			observer.update();
		}
	}
	
	public void setPhoneFee(double phoneFee) {
		this.phoneFee = phoneFee;
		notifyAllObserver();
	}
	
	public double getPhoneFee() {
		return phoneFee;
	}
}

interface  Observer {
	void update();
}

class NBALover implements Observer{
	private String name;
	private Publisher publisher;
	
	//这个地方修改了
	public NBALover(String name, Publisher publisher) {
        this.name = name;
		this.publisher = publisher;
		publisher.addObserver(this);
	}
	
	public void update() {
		if(publisher instanceof NewSpaper) {
			NewSpaper newSpaper = (NewSpaper)publisher;
			System.out.println("报纸更新了, " +"NBA爱好者"+ name + "在看 ");
			System.out.println( "报纸内容:" + newSpaper.getNBAMessage());
		} else if (publisher instanceof ShortMessage) {
			ShortMessage shortMessage =(ShortMessage)publisher;
			System.out.println("收到一条短信");
			System.out.println("短信内容: 话费剩余 " + shortMessage.getPhoneFee());
		}
	}
	
	void cancelSubscribe() {
		publisher.removeObserver(this);
	}
}

class MusicLover implements Observer{
	private String name;
	private Publisher publisher;
	
	public MusicLover(String name, Publisher publisher) {
        this.name = name;
		this.publisher = publisher;
		publisher.addObserver(this);
	}
	
	public void update() {
		if(publisher instanceof NewSpaper) 	{
		NewSpaper newSpaper = (NewSpaper)publisher;
		System.out.println("报纸更新了, " +"音乐爱好者"+ name + "在看 ");
		System.out.println( "报纸内容:" + newSpaper.getMusicMessage());
		}	else if (publisher instanceof ShortMessage) {
			ShortMessage shortMessage =(ShortMessage)publisher;
			System.out.println("收到一条短信");
			System.out.println("短信内容: 话费剩余 " + shortMessage.getPhoneFee());
		  }
	}
	
	void cancelSubscribe() {
		publisher.removeObserver(this);
	}
}

	

