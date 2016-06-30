package at.fhj.itm.herzelek15;

/**
 * Interface for an simple integer calcuator which supports the four basic operations
 * @author Gerhard Seuchter
 *
 */
public interface IPoint2d {
	public void setX(double px);
	public void setY(double py);
	public double distanceFrom(Point2d pt);
	
}
