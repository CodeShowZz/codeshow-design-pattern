package state.version3;

public abstract class State {
  public abstract void handle(Context context);
}

class ConcreteStateA extends State {

	@Override
	public void handle(Context context) {
      context.setState(new ConcreteStateA());
	}
}

class ConcreteStateB extends State {

	@Override
	public void handle(Context context) {
       context.setState(new ConcreteStateB());
	}
}

class Context {
	private State state;
	
	public void setState(State state) {
		this.state = state;
	}
	
	public Context(State state) {
		this.state = state;
	}
	
	public void request() {
		state.handle(this);
	}
}
