package duck;

import FlyBehavior.FlyNoWay;
import QuackBehavior.Squeak;

public class RubberDuck extends Duck {
	 
	public RubberDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Squeak();
	}
 
	public void display() {
		System.out.println("ÏðÆ¤Ñ¼");
	}
}
