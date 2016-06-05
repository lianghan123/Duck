package duck;

import Interfaces.FlyBehavior;
import Interfaces.QuackBehavior;

public abstract class Duck {
		FlyBehavior flyBehavior;
		QuackBehavior quackBehavior;
	 
		public Duck() {
		}
	        //��̬���÷�����Ϊ
		public void setFlyBehavior (FlyBehavior fb) {
			flyBehavior = fb;
		}
	 
		public void setQuackBehavior(QuackBehavior qb) {
			quackBehavior = qb;
		}
	        //��ͬ��Ѽ�ӱ��ֲ�ͬ
		abstract void display();
	        //��������Ϊί�и�������Ϊ�ദ��
		public void performFly() {
			flyBehavior.fly();
		}
	        //�����ɽ���Ϊί�и����ɽ���Ϊ�ദ��
		public void performQuack() {
			quackBehavior.quack();
		}
	        //����Ѽ�Ӷ��ḡˮ
		public void swim() {
			System.out.println("���е�Ѽ�Ӷ�����Ӿ!");
		}
	}


