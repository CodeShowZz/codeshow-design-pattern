package chainofresponsibility.version1;

/**
 * 有这样一个场景,你要向部门的管理人员请求某些事情,比如请假和加薪,比如你向经理请假,它会看看它是否有这个权限处理,
 * 如果权限不足,这个请求会一直向上转达,最终得到一个请求,代码如下
 *
 * 
 * 
 * 
 * @author 黄二狗
 *
 */
class Request {
    
    private String type;
    private String content;
    private int count;
    
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
}

public abstract class Manager {
   private String name;
   protected Manager superior;
   
   public Manager(String name) {
	   this.name = name;
   }
  
   public void setName(String name) {
	this.name = name;
}
   
   public String getName() {
	return name;
}
  
   public void setSuperior(Manager superior) {
	this.superior = superior;
}
   
   public abstract void applyRequest(Request request);
 
} 


class CommonManger extends Manager {
	
	public CommonManger(String name) {
		super(name);
	}

	@Override
	public void applyRequest(Request request) {
		if(request.getType() == "请假" && request.getCount() <= 2) {
			System.out.println(super.getName() + ":" + request.getContent() + "数量" + request.getCount() + "被批准");
		} else {
			//如果无权处理,就上交上级
			if(superior != null) {
				superior.applyRequest(request);
			}
		}
	}
}

class Majordomo extends Manager 
{
	public Majordomo(String name) {
		super(name);
	}
	
	@Override
	public void applyRequest(Request request) {
		if(request.getType() == "请假" && request.getCount() <= 5) {
			System.out.println(super.getName() + ":" + request.getContent() + "数量" + request.getCount() + "被批准");
		} else {
			//如果无权处理,就上交上级
			if(superior != null) {
				superior.applyRequest(request);
			}
		}
	}	
}

class GengralManager extends Manager {

	public GengralManager(String name) {
		super(name);
	} 

	@Override
	public void applyRequest(Request request) {
	    if(request.getType() == "请假") {
	    	System.out.println(super.getName() + ":" + request.getContent() + "数量" + request.getCount() + "被批准");
	    } else if(request.getType() == "加薪" && request.getCount() <= 500) {
	    	System.out.println(super.getName() + ":" + request.getContent() + "数量" + request.getCount() + "被批准");
	    } else {
	    	System.out.println(super.getName() + ":" + request.getContent() + "数量" + request.getCount() + "以后再说吧");
	    }
	}
}
