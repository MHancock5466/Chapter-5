/**
 * 
 */
package excercises;

/**
 * @author MH137428
 *
 */
import javax.swing.JOptionPane;
public class condoSales2 
{

	public static void main(String[] args) 
	{
		String msg = null;
		int condo, garage, parkCost = 150000, golfCost = 170000, lakeCost = 210000, garageCost = 5000;
		
		condo = Integer.parseInt(JOptionPane.showInputDialog(null, "1 = Park View\n2 = Golf Course View\n3 = Lake View"
				+ "\nWhere would you like to stay?"));
		garage = Integer.parseInt(JOptionPane.showInputDialog(null, "1 = Yes\n2 = No\nWould you like a garage?"));
		
		if(condo == 1)
		{
			if(garage == 1)
			{
				msg = "Your cost will be $" + (parkCost+garageCost);
			}
			if(garage == 2)
			{
				msg = "Your cost will be $" + parkCost;
			}
		}
		if(condo == 2)
			if(garage == 1)
			{
				msg = "Your cost will be $" + (golfCost+garageCost);
			}
			if(garage == 2)
			{
				msg = "Your cost will be $" + golfCost;
			}
		if(condo == 3)
		{
			if(garage == 1)
			{
				msg = "Your cost will be $" + (lakeCost+garageCost);
			}
			if(garage == 2)
			{
				msg = "Your cost will be $" + lakeCost;
			}
		}
		else
			msg = "Invalid Input";
		JOptionPane.showMessageDialog(null, msg);
	}

}
