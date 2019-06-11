package prob1.interfaces;

public interface Squeakable extends Quackable {

	@Override
	default void quack() {
		System.out.println(" squeaking");

	}

}
