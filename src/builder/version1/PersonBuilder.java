package builder.version1;

/**
 * 有这么一个需求,你要建造一个人,这个人可以胖,可以瘦,可以大长腿,短腿.总之建造这么一个人的方法都是定好的,
 * 至于建造特定的人留给具体的建造者实现,另外还有一个指挥者来指导建造的过程,再看Test类
 * 
 * 请看下面的代码
 * 
 * 
 * @author 黄二狗
 *
 */
//这里规定建造的一系列方法
public abstract class PersonBuilder {
    public abstract void buildHead();
    public abstract void buildBody();
    public abstract void buildArmLeft();
    public abstract void buildArmRight();
    public abstract void buildLegLeft();
    public abstract void buildLegRight();
}

class PersonThinBuilder extends PersonBuilder {

	@Override
	public void buildHead() {
		System.out.println("头有点大");
	}

	@Override
	public void buildBody() {
		System.out.println("身体很瘦");
	}

	@Override
	public void buildArmLeft() {
		System.out.println("左胳膊很瘦");	
	}

	@Override
	public void buildArmRight() {
		System.out.println("右胳膊很瘦");	
	}

	@Override
	public void buildLegLeft() {
		System.out.println("左腿很瘦");	
	}

	@Override
	public void buildLegRight() {
		System.out.println("右腿很瘦");	
	}
	
}

class PersonFatBuilder extends PersonBuilder {

	@Override
	public void buildHead() {
		System.out.println("头很大");
	}

	@Override
	public void buildBody() {
		System.out.println("身体很胖");
	}

	@Override
	public void buildArmLeft() {
		System.out.println("左胳膊很结实");	
	}

	@Override
	public void buildArmRight() {
		System.out.println("右胳膊很结实");	
	}

	@Override
	public void buildLegLeft() {
		System.out.println("左腿很粗");	
	}

	@Override
	public void buildLegRight() {
		System.out.println("右腿很粗");	
	}
}

class PersonDirector {
	private PersonBuilder personBuilder;
	
	public PersonDirector(PersonBuilder personBuilder) {
		this.personBuilder = personBuilder;
	}
	
	//指挥者指导建造过程
	public void createPerson() {
		personBuilder.buildHead();
		personBuilder.buildBody();
		personBuilder.buildArmLeft();
		personBuilder.buildArmRight();
		personBuilder.buildLegLeft();
		personBuilder.buildLegRight();
	}
}
