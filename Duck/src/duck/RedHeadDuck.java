package duck;

import FlyBehavior.FlyWithWings;
import QuackBehavior.Quack;

public class RedHeadDuck extends Duck {
	 
	public RedHeadDuck() {
		flyBehavior = new FlyWithWings();
		quackBehavior = new Quack();
	}
 
	public void display() {
		System.out.println("��ͷѼ");
	}
}
