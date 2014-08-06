import java.util.Scanner;

public class HighLowLimitedTries
{
		public static void main( String[] args )
		{
			Scanner keyboard = new Scanner(System.in);
			int secret, guess;
			int tries = 0;
			int max = 7;
			
			secret = 1 + (int) (Math.random()*100);
			
			System.out.println( "I'm thinking of a number between 1-100. You have 7 tries." );
			
			System.out.println( "Guess #" + ( tries + 1 ) + ":" );
			guess = keyboard.nextInt();
			tries++;
			
			while ( secret != guess && tries < max )
			{
				
				if ( guess < secret )
				{
					System.out.println( "Sorry, your guess is too low. Try again." );
					tries++;
				}
				if ( guess > secret )
				{
					System.out.println( "Sorry, your guess is too high. Try again." );
					tries++;
				}
				
				System.out.println( "Guess #" + tries + ":" );
				guess = keyboard.nextInt();
			}
			if (guess == secret)
				System.out.println( "You guessed it! What are the odds?!?" );
				
			else if 
				(tries >= max )
				System.out.println( "Sorry, you didn't guess it in " + tries + " tries. You lose." );
				
	}
}
					