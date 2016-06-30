package at.fhj.itm.herzelek15;
class Point2d {
	
	/**
	 * 
	 */
	private boolean debug;
	
	/**
	*Variablen fuer Koordinaten
	*/
	private double x = 0;
	private double y = 0;

	
	/**
	 * Konstruktor mit zwei Uebergabeparameter
	 * @param px
	 * @param py
	 */
	public Point2d (double px, double py)
	{ 
		this.x = px;
		this.y = py;
	}

	/**
	 * Konstruktor ohne Uebergabeparameter --> Ursprung
	 */
	public Point2d () 
	{	
		//Koordinaten 0 setzen
		this.x = 0;
		this.y = 0;
	}

	/**
	 * Konstruktor mit einem Uebergabeparameter
	 * @param pt
	 */
	public Point2d (Point2d pt) 
	{	
		this.x = pt.x;
		this.y = pt.y;
	}

	/**
	 * Wenn debug true --> ausgabe
	 * @param s
	 */
	public void dprint (String s) {
		if (debug)
			System.out.println("Debug: " + s);
	}

	/**
	 * Wert von Debug uebergeben
	 * @param b
	 */
	public void setDebug (boolean b) {
		this.debug = b;
	}

	/**
	 * Setter von x
	 * @param px
	 */
	public void setX(double px) {
		dprint ("setX(): Changing value of X from " + x + " to " + px );
	}

	/**
	 * Getter von x
	 * @return
	 */
	public double getX() {
		return this.x;
	}

	/**
	 * Setter von y
	 * @param py
	 */
	public void setY(double py)  {
		dprint ("setY(): Changing value of Y from " + y + " to " + py );
	}

	/**
	 * Getter von y
	 * @return
	 */
	public double getY() {
		return this.y;
	}

	/**
	 * Setter beider Koordinaten x und y
	 * @param px
	 * @param py
	 */
	public void setXY(double px, double py) {
		dprint ("setX(): Changing value of X from " + x + " to " + px );
		dprint ("setY(): Changing value of Y from " + y + " to " + py );
	}

	public double distanceFrom (Point2d pt) {
		double a = Math.abs(pt.x - this.x);
		double b = Math.abs(pt.y- this.y);
		
		System.out.println( Math.sqrt(Math.pow(a, 2) + Math.pow(b,2)));
		return Math.sqrt(Math.pow(a, 2) + Math.pow(b,2));

		
	}

	/**
	 * Liefert Abstand vom Ursprung
	 * @return
	 */
	public double distanceFromOrigin () {
		double a = Math.abs(this.x);
		double b = Math.abs( this.y);
		
		return Math.sqrt(Math.pow(a, 2) + Math.pow(b,2));
	}

	/**
	 * Ausgabe der Koordinaten in Konsole
	 */
	public String toString() {
		return"Punkt mit x= " + x + " und Y= " + y;
	}
}

