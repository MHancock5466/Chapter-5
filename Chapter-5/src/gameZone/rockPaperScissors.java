/**
 * 
 */
package gameZone;

/**
 * @author MH137428
 *
 */
import javax.swing.JOptionPane;
public class rockPaperScissors 
{

	public static void main(String[] args) 
	{
		int response, random = 1 + (int)(Math.random() * 3);
		
		response = Integer.parseInt(JOptionPane.showInputDialog(null, "Choose Rock, Paper, or Scissors\n1 = Rock\n2 = Paper\n3 = Scissors"));
		
		if(response == random)
			JOptionPane.showMessageDialog(null, "You had the same answer. It's a tie.");
		else if((response == 1 && random == 3) ||  (response == 2 && random == 1) || (response == 3 && random == 2))
		{
			JOptionPane.showMessageDialog(null, "1 = Rock, 2 = Paper, 3 = Scissors\nYou chose " + response + " and the opponent chose " 
					+ random + ".\nYou win!");
		}
			else	
				JOptionPane.showMessageDialog(null, "1 = Rock, 2 = Paper, 3 = Scissors\nYou chose " + response + " and the opponent chose " 
						+ random + ".\nYou lose.");
	}

}
