package proxy.version1;

/**
 *  大家都知道,经常一个人打官司,需要请一个代理律师,代理律师帮你表达你要说的东西,并且添加一些他辩诉的词汇
 *  一个人和那个律师都实现了打官司接口.
 *  这里,我们要介绍代理模式.
 *  为了简单我们将所有的这些类写在同一个类中,然后使用Test类进行测试
 * 
 * 
 * @author 黄二狗
 *
 */


public class Person implements goToCourt {

	@Override
	public void gotoCourt() {
      System.out.println("南村群童欺我老无力    与我轮流发生X关系");
	}

}

class ProxyLawer implements goToCourt {

	Person person;
    public ProxyLawer() {
		this.person = new Person();
	}

	@Override
	public void gotoCourt() {
		System.out.println("开始辩解");
		person.gotoCourt();
		System.out.println("结束辩解");
	}
	
}

interface goToCourt {
	void gotoCourt();
}