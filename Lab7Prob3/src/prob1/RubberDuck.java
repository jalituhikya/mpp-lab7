package prob1;

import prob1.interfaces.UnFlyable;
import prob1.interfaces.Squeakable;

public class RubberDuck extends Duck implements UnFlyable,Squeakable {

	@Override
	public void display() {
		System.out.println(" displaying");
	}
}
