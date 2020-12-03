/**
 * 
 */
package atelier1;
import java.lang.Math;
/**
 * @author Admin
 *
 */
public class Point {
	public Double x;
	public Double y;
	
	public Point(Double x,Double y) {
	  this.x=x;
	  this.y=y;
	}
	
	public Double dist(Point p) {
	  return Math.sqrt(Math.pow((this.x-p.x),2)+Math.pow((this.y-p.y),2));

	}

}
