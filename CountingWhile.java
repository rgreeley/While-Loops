import java.util.Scanner;

public class CountingWhile
{
		public static void main( String[] args )
		{
				Scanner keyboard = new Scanner(System.in);
				
				System.out.println( "Type in a message, and I'll display it several times." );
				System.out.print( "Message: " );
				String message = keyboard.nextLine();
				
				System.out.print( "How many times would you like?" );
				int entry = keyboard.nextInt();
				
				int n = 0;
				while ( n < entry )
				{
						System.out.println( ( (n+1)*10 ) + ". " + message );
						n++;
				}
			}
}