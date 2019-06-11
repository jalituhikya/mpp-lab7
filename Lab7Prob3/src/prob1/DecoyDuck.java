package prob1;

import prob1.interfaces.UnFlyable;
import prob1.interfaces.UnQuackable;

public class DecoyDuck extends Duck implements UnFlyable,UnQuackable{

	@Override
	public void display() {
		System.out.println(" displaying"); 
	}

}
