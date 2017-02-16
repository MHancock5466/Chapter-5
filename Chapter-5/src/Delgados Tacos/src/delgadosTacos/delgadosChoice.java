/**
 * 
 */
package delgadosTacos;

/**
 * @author MH137428
 *
 */
import javax.swing.JOptionPane;
public class delgadosChoice 
{

	public static void main(String[] args) 
	{
		String order;
		int amount;
		double tacoPrice = 1.49, burritoPrice = 1.99, churroPrice = .99, nachoPrice = 1.49, enchiladaPrice = 1.99, quesadillaPrice = 1.49,
				tamalePrice = 1.49, empanadaPrice = 2.99, fajitaPrice = 1.99, drinkPrice = .99;
		
		JOptionPane.showMessageDialog(null, "Welcome to Delgados Tacos");
		order = JOptionPane.showInputDialog(null, "What would you like? \nA taco, burrito, churro, nacho, enchilada, quesadilla, "
				+ "tamale, empanada, fajita, or drink?");
		
		if("taco".equals(order) || "burrito".equals(order) || "churro".equals(order) || "nacho".equals(order) || "enchilada".equals(order)
				|| "quesadilla".equals(order) || "tamale".equals(order) || "empanada".equals(order) || "fajita".equals(order)
				|| "drink".equals(order))
		{
			amount = Integer.parseInt(JOptionPane.showInputDialog(null, "How many " + order + "s would you like?"));
			
			if("taco".equals(order))
				JOptionPane.showMessageDialog(null, "The cost will be $" + (tacoPrice*amount) + " for " + amount + " " + order + "s.");
			if("burrito".equals(order))
				JOptionPane.showMessageDialog(null, "The cost will be $" + (burritoPrice*amount) + " for " + amount + " " + order + "s.");
			if("churro".equals(order))
				JOptionPane.showMessageDialog(null, "The cost will be $" + (churroPrice*amount) + " for " + amount + " " + order + "s.");
			if("nacho".equals(order))
				JOptionPane.showMessageDialog(null, "The cost will be $" + (nachoPrice*amount) + " for " + amount + " " + order + "s.");
			if("enchilada".equals(order))
				JOptionPane.showMessageDialog(null, "The cost will be $" + (enchiladaPrice*amount) + " for " + amount + " " + order + "s.");
			if("quesadilla".equals(order))
				JOptionPane.showMessageDialog(null, "The cost will be $" + (quesadillaPrice*amount) + " for " + amount + " " + order + "s.");
			if("tamale".equals(order))
				JOptionPane.showMessageDialog(null, "The cost will be $" + (tamalePrice*amount) + " for " + amount + " " + order + "s.");
			if("empanada".equals(order))
				JOptionPane.showMessageDialog(null, "The cost will be $" + (empanadaPrice*amount) + " for " + amount + " " + order + "s.");
			if("fajita".equals(order))
				JOptionPane.showMessageDialog(null, "The cost will be $" + (fajitaPrice*amount) + " for " + amount + " " + order + "s.");
			if("drink".equals(order))
				JOptionPane.showMessageDialog(null, "The cost will be $" + (drinkPrice*amount) + " for " + amount + " " + order + "s.");
		}
		else
			JOptionPane.showMessageDialog(null, "We could not understand your request. Please try again.");
	}

}
