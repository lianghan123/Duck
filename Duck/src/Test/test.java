package Test;

import duck.Duck;
import duck.MallardDuck;
import duck.RedHeadDuck;
import duck.RubberDuck;

public class test {
	 public static void main(String[] args) { 
	        Duck mallard = new MallardDuck();  
	            System.out.println("勸兌"); 
	        mallard.performFly();  
	        mallard.performQuack();
	        System.out.println("！！！！！！！！！！"); 
	        
	        Duck redhead = new RedHeadDuck();
	        System.out.println("碕遊兌");
	        redhead.performFly();
	        redhead.performQuack();
	        System.out.println("！！！！！！！！！！");
	        
	        Duck rebber = new RubberDuck();
	        System.out.println("�霪ぱ�");
	        redhead.performFly();
	        redhead.performQuack(); 
	        

	 }
}
