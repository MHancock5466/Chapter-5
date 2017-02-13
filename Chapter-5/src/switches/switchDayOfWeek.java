/**
 * 
 */
package switches;

/**
 * @author MH137428
 *
 */
import java.util.Scanner;
public class switchDayOfWeek 
{
	
	public static void main(String[] args) 
	{
		String day;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a day during the week for your schedule > ");
		day = input.nextLine();
		switch(day)
		{
			case "Monday":
			case "monday":
				System.out.print("Reserve room for Friday meeting");
				break;
			case "Tuesday":
			case "tuesday":
				System.out.print("Meeting with Principal.");
				break;
			case "Wednesday":
			case "wednesday":
				System.out.print("Go to the gym.");
				break;
			case "Thursday":
			case "thursday":
				System.out.print("Go to dinner at Clark's Landing for Tacos");
				break;
			case "Friday":
			case "friday":
				System.out.print("Attend Friday meeting");
				break;
			case "Saturday":
			case "saturday":
			case "Sunday":
			case "sunday":
				System.out.print("Relax");
				break;
			default:
				System.out.print("Day not recognized");
		}
	}

}
