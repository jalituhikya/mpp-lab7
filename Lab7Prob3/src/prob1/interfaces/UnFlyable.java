package prob1.interfaces;


public interface UnFlyable extends Flyable {

	@Override
	default void fly() {
		System.out.println(" cannot fly");

	}

}
