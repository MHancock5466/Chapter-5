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
		double tacoPrice = 1.49, burritoPrice = 1.99, churroPrice = .99, drinkPrice = .99;
		order = JOptionPane.showInputDialog(null, "What would you like? \nA taco, burrito, churro, or drink");
		if("taco".equals(order) || "burrito".equals(order) || "churro".equals(order) || "drink".equals(order))
		{
			amount = Integer.parseInt(JOptionPane.showInputDialog(null, "How many " + order + "s would you like?"));
			if("taco".equals(order))
				JOptionPane.showMessageDialog(null, "The cost will be $" + (tacoPrice*amount) + " for " + amount + " " + order + "s.");
			if("burrito".equals(order))
				JOptionPane.showMessageDialog(null, "The cost will be $" + (burritoPrice*amount) + " for " + amount + " " + order + "s.");
			if("churro".equals(order))
				JOptionPane.showMessageDialog(null, "The cost will be $" + (churroPrice*amount) + " for " + amount + " " + order + "s.");
			if("drink".equals(order))
				JOptionPane.showMessageDialog(null, "The cost will be $" + (drinkPrice*amount) + " for " + amount + " " + order + "s.");
		}
	}

}
