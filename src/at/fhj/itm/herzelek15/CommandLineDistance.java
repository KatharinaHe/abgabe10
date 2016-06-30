package at.fhj.itm.herzelek15;
/**
 * Calculator that can interpret results directly from the command line
 * @author gseuchter
 *
 */
public class CommandLineDistance extends Point2d implements ICommandLineDistance {

	@Override
	public int getMinArguments() {
		return 5;
	}

	@Override
	public String getUsage() {
		return "usage <operation> <integer> <integer> <integer> <integer>\n\t operations: (dist <x> <y> <x> <y>)";
	}

	@Override
	public double calcCommandLine(String[] args) throws NumberFormatException,
	IllegalArgumentException {
		if(args.length != getMinArguments()){
			throw new IllegalArgumentException("Wrong number of parameters");
		}
		
		/**
		 * Create 2 Points
		 */
		Point2d p1 = new Point2d();
		Point2d p2 = new Point2d();
		
		String op = args[0].trim().toLowerCase();
		
		
		/**
		 * Read all arguments
		 */
		int numA = Integer.parseInt(args[1]);
		int numB = Integer.parseInt(args[2]);
		int numC = Integer.parseInt(args[3]);
		int numD = Integer.parseInt(args[4]);
		
		
		/**
		 *Calculate distance Distance 
		 */
		switch(op){
		case "dist":
			p1.setX(numA);
			p1.setY(numB);
			p2.setX(numC);
			p2.setY(numD);
			return p1.distanceFrom(p2);
			default:
			throw new IllegalArgumentException(String.format("Unknown operator '%s'", op));

		}
	}

}
