package Test;

import duck.Duck;
import duck.MallardDuck;
import duck.RedHeadDuck;
import duck.RubberDuck;

public class test {
	 public static void main(String[] args) { 
	        Duck mallard = new MallardDuck();  
	            System.out.println("ҰѼ"); 
	        mallard.performFly();  
	        mallard.performQuack();
	        System.out.println("��������������������"); 
	        
	        Duck redhead = new RedHeadDuck();
	        System.out.println("��ͷѼ");
	        redhead.performFly();
	        redhead.performQuack();
	        System.out.println("��������������������");
	        
	        Duck rebber = new RubberDuck();
	        System.out.println("��ƤѼ");
	        redhead.performFly();
	        redhead.performQuack(); 
	        

	 }
}
