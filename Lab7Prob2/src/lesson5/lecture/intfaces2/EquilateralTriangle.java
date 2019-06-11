package lesson5.lecture.intfaces2;

public class EquilateralTriangle implements Polygon {

	private double side;
	
	
	public EquilateralTriangle(double side) {
		super();
		this.side = side;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	@Override
	public double[] getSides() {
		// TODO Auto-generated method stub
		return new double[] {side};
	}

}
