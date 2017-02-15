/**
 * 
 */
package youDoIt;

import java.util.Scanner;

/**
 * @author MH137428
 *
 */
public class assignVolunteer4 
{

	public static void main(String[] args)
	{
		int donationType;
		String volunteer, message;
		final int clothingCode = 1;
		final int furnitureCode = 2;
		final int electronicsCode = 3;
		final int otherCode = 4;
		final String clothingPricer = "Regina";
		final String furniturePricer = "Walter";
		final String electronicsPricer = "Lydia";
		final String otherPricer = "Marco";
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("What type of donation is this?");
		System.out.print("Enter " + clothingCode + " for clothing, " + furnitureCode + " for furniture, " + electronicsCode +
				" for electronics, and " + otherCode + " for anything else. > ");
		donationType = input.nextInt();
		
		switch(donationType)
		{
			case(clothingCode):
				volunteer = clothingPricer;
				message = "a clothing donation";
				break;
			case(furnitureCode):
				volunteer = furniturePricer;
				message = "a furniture donation";
				break;
			case(electronicsCode):
				volunteer = electronicsPricer;
				message = "an electronics donation";
				break;
			case(otherCode):
				volunteer = otherPricer;
				message = "another donation type";
				break;
			default:
				volunteer = "invalid";
				message = "an invalid donation type";
		}
		
		System.out.println("You entered " + donationType);
		System.out.println("The volunteer who will price this item is " + volunteer);
		System.out.println("This is " + message);
	}

}
