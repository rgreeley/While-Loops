import java.util.Scanner;

public class AddingValuesinaLoop
{
		public static void main( String[] args )
		{
					Scanner keyboard = new Scanner(System.in);
						int total = 0;
						int number = 1;
						System.out.println( "I will add up the numbers you give me." );

						while ( number != 0 )
						{
							System.out.print( "Number: " );
							number = keyboard.nextInt();
							total += number;
							
							if ( number != 0 )
								System.out.println( "The total so far is " + total );
						}

							System.out.println( "\nThe total is " + total );
		}
}