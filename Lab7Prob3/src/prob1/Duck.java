package prob1;

import prob1.interfaces.Flyable;
import prob1.interfaces.Quackable;

public abstract class Duck implements Flyable, Quackable {


	public void swim() {

		System.out.println(" swimming");
	}

	public abstract void display();

}
