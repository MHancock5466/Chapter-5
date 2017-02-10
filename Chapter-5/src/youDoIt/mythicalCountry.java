/**
 * 
 */
package youDoIt;

/**
 * @author MH137428
 *
 */
import java.util.Scanner;
public class mythicalCountry 
{

	public static void main(String[] args) 
	{
		double rate, hours, normalPay, overtimePay, overtimePayRate;
		double tax = .5;
		final int overtimeHours = 32;
		
		Scanner input = new Scanner(System.in);
		System.out.println("How many hours did you work this week?");
		hours = input.nextDouble();
		
		System.out.println("What is your rate of pay?");
		rate = input.nextDouble();
		
		if(hours > overtimeHours)
		{
			overtimePayRate = 2 * rate;
			normalPay = overtimeHours * rate;
			overtimePay = overtimePayRate * (hours - overtimeHours);
		}
		else
		{
			normalPay = hours * rate;
			overtimePay = 0;
		}
		System.out.println("You worked " + hours + " hours this week, at a rate of $" + rate + " per hour. Your normal pay is $" + 
				(normalPay+overtimePay) + ". The tax is " + tax + ". Your income will be $" + (normalPay+overtimePay)*tax + ".");
	}

}
