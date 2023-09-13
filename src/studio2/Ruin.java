package studio2;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int startAmount = 2;
		double winChance = 0.7;
		int winLimit = 10;
		double currentAmount = 2;
		int totalPlays = 0;
		int totalSimulations = 0;
		
		while (totalSimulations<500)
		{
			//While1 start
			currentAmount = startAmount ;
			totalPlays = 0 ;
		while (currentAmount > 0 && currentAmount < winLimit)
		{
			//While2 Starts
			double random = Math.random() ;
		if (random<=winChance)
		{
			//if 1 start
		currentAmount = currentAmount + 1 ;
		totalPlays = totalPlays + 1;
	
		//if 1 end
		}
		else if (random > winChance)
		{	
			//else if 1 start
		currentAmount = currentAmount - 1 ;
		totalPlays = totalPlays + 1;
		}
		//else if 1 end
		}
		totalSimulations = totalSimulations+1;
		System.out.println("Day number: " + totalSimulations) ;
		System.out.println("Plays that day: " + totalPlays) ;
		if (currentAmount == winLimit)
		{
			System.out.println("Success") ;
		}
		else if (currentAmount == 0)
		{
			System.out.println("Ruin") ;
		}
		}
		//While1 end
		
		
	}
}
		
		
		
	


