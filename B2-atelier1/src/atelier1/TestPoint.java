/**
 * 
 */
package atelier1;

/**
 * @author Admin
 *
 */
public class TestPoint {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p1 = new Point(1.0,4.0);
		Point p2 = new Point(2.0,2.0);
		Double d=p1.dist(p2);
		System.out.print("La distance est : "+d+"");

	}

}
