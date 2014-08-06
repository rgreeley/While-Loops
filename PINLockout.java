import java.util.Scanner;

public class PINLockout
{
		public static void main( String[] args )
		{
				Scanner keyboard = new Scanner(System.in);
				
				int pin = 12345;
				int tries = 0;
				int max = 4;
				
				System.out.println( "WELCOME TO THE BANK OF ROBERT." );
				System.out.print("ENTER YOUR PIN: " );
				int entry = keyboard.nextInt();
				tries++;
				
				while ( entry != pin && tries < max )
				{
						System.out.println( "\n INCORRECT PIN. TRY AGAIN." );
						System.out.print("ENTER YOUR PIN: " );
						entry = keyboard.nextInt();
						tries++;
				}
				
				if ( entry == pin )
						System.out.println( "\n PIN ACCEPTED. YOU HAVE ACCESS TO YOUR ACCOUNT." );
				else if ( tries >= max )
						System.out.println( "\n YOU HAVE RUN OUT OF TRIES. ACCOUNT LOCKED." );
		}
}