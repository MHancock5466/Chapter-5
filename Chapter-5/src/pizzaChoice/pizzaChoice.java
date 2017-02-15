/**
 * 
 */
package pizzaChoice;

/**
 * @author MH137428
 *
 */
import javax.swing.JOptionPane;
public class pizzaChoice 
{

	public static void main(String[] args) 
	{
		String yes, size, kind; //User selects pizza/size/kind
		double smallCost = 6.99;
		double mediumCost = 9.99;
		double largeCost = 12.99;
		double extraLCost = 14.99;
		
		yes = JOptionPane.showInputDialog(null, "Would you like to order pizza? Yes or No"); //User selects they do/don't want pizza
		if("Yes".equals(yes) || "yes".equals(yes))
		{
			 size = JOptionPane.showInputDialog(null, "You said " + yes + " to ordering pizza. \nWhat size would you like? "
			 		+ "\nSmall, Medium, Large, or Extra Large"); //User selects size of pizza
			 if("Small".equals(size) || "Medium".equals(size) || "Large".equals(size) || "Extra Large".equals(size))
			 {
				 kind = JOptionPane.showInputDialog(null, "You said a " + size + " pizza. \nWhat kind of pizza would you like?"
				 		+ "\nPepperoni, Sausage, Cheese, Veggie, Taco, or Meat Lover's"); //User selects kind
				 	if("Small".equals(size))
				 		JOptionPane.showMessageDialog(null, "The cost will be $" + smallCost + " for a " + size + " " + kind + " Pizza.");
				 	if("Medium".equals(size))
				 		JOptionPane.showMessageDialog(null, "The cost will be $" + mediumCost + " for a " + size + " " + kind + " Pizza.");
				 	if("Large".equals(size))
				 		JOptionPane.showMessageDialog(null, "The cost will be $" + largeCost + " for a " + size + " " + kind + " Pizza.");
				 	if("Extra Large".equals(size))
				 		JOptionPane.showMessageDialog(null, "The cost will be $" + extraLCost + " for a " + size + " " + kind + " Pizza.");
			 }
		}
		
	}

}
