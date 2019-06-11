package lesson5.lecture.intfaces2;

import java.util.Arrays;

public interface Polygon extends ClosedCurve {


	 public double[] getSides();
	 
	 default double computePerimeter() {
		 
		return Arrays.stream(getSides()).sum();
		 
	 }
	 
	 
}
