package prob1.interfaces;

public interface UnQuackable extends Quackable {

	@Override
	default void quack() {
		System.out.println(" cannot quack");

	}

}
