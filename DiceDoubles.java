import java.util.Random;

public class DiceDoubles
{
		public static void main( String[] args )
		{
		
			Random r = new Random();

			System.out.println( "Press ENTER to see the roll of the dice!" );
			System.out.println();

			int dice1 = 1 + r.nextInt(6), dice2 = 1 + r.nextInt(6);
			
			while ( dice1 !=dice2 )
			{
				System.out.println( "Roll #1: " + dice1 );
				System.out.println( "Roll #2: " + dice2 );
				System.out.println( "The total is " + (dice1 + dice2) +"!" );
				
				dice1 = 1 + r.nextInt(6);
				dice2 = 1 + r.nextInt(6);
			}

				System.out.println( "Roll #1: " + dice1 );
				System.out.println( "Roll #2: " + dice2 );
				System.out.println( "The total is " + (dice1 + dice2) +"!" );
		}
}




