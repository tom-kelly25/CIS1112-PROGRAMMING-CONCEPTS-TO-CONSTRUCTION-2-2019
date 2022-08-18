/**
 * 
 */
package CW1_4.copy;

/**
 * @author Tom
 *
 */
public class TriangleSolver {

	/**
	 * @param args
	 */
	public String solveTriangle(Triangle t) {
		if(areEqual (t.getA(), t.getB()) && areEqual(t.getB(), t.getC())){
			return "Equilateral";
		}
		else if(areEqual(t.getA(), t.getB()) ^ areEqual(t.getA(), t.getC())) {
			return "Isosceles";
		}
		else {
			return "Scalene";
		}
	}
	public boolean areEqual(float a, float b) {
		if (a==b) {
			return true;
		}
		else {
			return false;
		}
	}
	

}
