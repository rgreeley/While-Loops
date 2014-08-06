import java.util.Scanner;
import java.util.Random;

public class KeepGuessing
{

		public static void main( String[] args )
		{
		
			Scanner keyboard = new Scanner(System.in);
			Random r = new Random();
			
					int number = 1 + r.nextInt(10);

					System.out.println( "This shall be the worst guessing game ever...." );
					System.out.println();
					
					System.out.print( "I am thinking of a number between 1-10. Try and guess and you shall earn a chocolate. " );
					int guess = keyboard.nextInt();


					while ( guess != number )
					{
						System.out.print( "Sorry not what we were looking for." );
						System.out.print( "\nHow about another try...." );
						guess = keyboard.nextInt();
					}
					
						System.out.println( "Well crap I wasn't expecting this. It was " + number + ". I owe you one chocolate." );
		}
}


