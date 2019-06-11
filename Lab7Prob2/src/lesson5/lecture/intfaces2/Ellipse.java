package lesson5.lecture.intfaces2;

public class Ellipse implements ClosedCurve {
	
	private double a;
	private double E;
	
	
	
	public Ellipse(double a, double e) {
		super();
		this.a = a;
		E = e;
	}
	public double getA() {
		return a;
	}
	public void setA(double a) {
		this.a = a;
	}
	public double getE() {
		return E;
	}
	public void setE(double e) {
		E = e;
	}
	@Override
	public double computePerimeter() {
		// TODO Auto-generated method stub
		return 4*E*a;
	}
	
	

}
