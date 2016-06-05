package duck;

import FlyBehavior.FlyWithWings;
import QuackBehavior.Quack;

public class MallardDuck extends Duck {
	 
	public MallardDuck() {
		quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
	}
 
	public void display() {
		System.out.println("ҰѼ");
	}
}
