package at.fhj.itm.herzelek15;

/**
 * Specialization of the {@link ICalculator} interface which supports
 * performing the calculation by using strings from the commandline
 *  
 * @author Gerhard Seuchter
 *
 */
public interface ICommandLineDistance {
	/**
	 * Returns the minimal number of arguments the calculator needs from the command line
	 * @return
	 */
	int getMinArguments();
	
	/**
	 *	Returns an information string which contains information about the command line arguments for the end user 
	 * @return
	 */
	String getUsage();
	
	/**
	 * Performs calculation by using strings retrieved from the command line
	 * @param args command line input
	 * @return the calcuation result
	 * @throws NumberFormatException if a number for an operation was in an invalid format
	 * @throws IllegalArgumentException if the wrong number of arguments or an unknown parameter was specified
	 * @throws MathOperationException if an illegal mathematical operation was perfomred
	 */
	double calcCommandLine(String[] args) throws NumberFormatException,IllegalArgumentException;
}
