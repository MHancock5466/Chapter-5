/**
 * 
 */
package youDoIt;

/**
 * @author MH137428
 *
 */
import java.util.Scanner;
public class assignVolunteer 
{

	public static void main(String[] args) 
	{
		int donationType;
		String volunteer;
		final int clothingCode = 1;
		final int otherCode = 2;
		final String clothingPricer = "Regina";
		final String otherPricer = "Marco";
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("What type of donation is this?");
		System.out.print("Enter " + clothingCode + " for clothing, " + otherCode + " for anything else...");
		donationType = input.nextInt();
		
		if(donationType == clothingCode)
			volunteer = clothingPricer;
		else
			volunteer = otherPricer;
		
		System.out.println("You entered " + donationType);
		System.out.println("The volunteer who will price this item is " + volunteer);
	}

}
