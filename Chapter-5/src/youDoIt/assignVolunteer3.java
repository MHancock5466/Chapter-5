/**
 * 
 */
package youDoIt;

import java.util.Scanner;

/**
 * @author MH137428
 *
 */
public class assignVolunteer3 
{

	public static void main(String[] args) 
	{
		int donationType;
		String volunteer, message;
		final int clothingCode = 1;
		final int otherCode = 2;
		final String clothingPricer = "Regina";
		final String otherPricer = "Marco";
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("What type of donation is this?");
		System.out.print("Enter " + clothingCode + " for clothing, " + otherCode + " for anything else...");
		donationType = input.nextInt();
		
		if(donationType == clothingCode)
		{
			volunteer = clothingPricer;
			message = "a clothing donation";
		}
		if(donationType == otherCode)
		{
			volunteer = otherPricer;
			message = "a non-clothing donation";
		}
		else
		{
			volunteer = "no longer here.";
			message = "an error.";
		}
		System.out.println("You entered " + donationType);
		System.out.println("The volunteer who will price this item is " + volunteer);
		System.out.println("This is " + message);
	}

}
