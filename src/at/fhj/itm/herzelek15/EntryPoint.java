package at.fhj.itm.herzelek15;

public class EntryPoint {

	public static void main(String[] args) {
		ICommandLineDistance dist = new CommandLineDistance();
		
		if(args.length != dist.getMinArguments()){
			System.out.println(dist.getUsage());
			return;
		}
		
		try
		{
			double result = dist.calcCommandLine(args);
			System.out.println(result);
		}
		catch(Exception ex)
		{
			System.out.print("Invalid math operation: " + ex.getMessage());
		}
		
			
		
		
	}

}
