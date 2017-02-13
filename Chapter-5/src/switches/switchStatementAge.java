/**
 * 
 */
package switches;

/**
 * @author MH137428
 *
 */
import java.util.Scanner;
public class switchStatementAge 
{

	public static void main(String[] args) 
	{
		int user;
		Scanner input = new Scanner(System.in);
		
		System.out.print("How old are you? > ");
		user = input.nextInt();
		switch(user)
		{
			case 18:
				System.out.print("You're 18.");
				break;
			case 19:
			case 20:
			case 21:
				System.out.print("You're between 19 and 21.");
				break;
			case 22:
			case 23:
			case 24:
			case 25:
			case 26:
			case 27:
			case 28:
			case 29:
			case 30:
				System.out.print("You're between 22 and 30.");
				break;
			case 31:
			case 32:
			case 33:
			case 34:
			case 35:
			case 36:
			case 37:
			case 38:
			case 39:
			case 40:
				System.out.print("You're between 31 and 40.");
				break;
			default:
				System.out.print("You're getting old.");
		}
	}

}
