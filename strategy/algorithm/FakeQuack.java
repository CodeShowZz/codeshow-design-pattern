package headfirst.designpatterns.strategy.algorithm;

public class FakeQuack implements QuackBehavior {
	public void quack() {
		System.out.println("Qwak");
	}
}
