/**
 * 
 */
package gameZone;

/**
 * @author MH137428
 *
 */
import java.util.Random;

import javax.swing.JOptionPane;
public class lottery 
{

	public static void main(String[] args) 
	{
		Random r = new Random();
		String msg;
		int guess1, guess2, guess3;
		final int low = 1;
		final int high = 10;
		
		int result1 = r.nextInt(high) + low;
		int result2 = r.nextInt(high) + low;
		int result3 = r.nextInt(high) + low;
		
		guess1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Guess a number between " + low + " and " + (high-1)));
		guess2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Guess a second number between " + low + " and " + (high-1)));
		guess3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Guess a third number between " + low + " and " + (high-1)));
		
		if(guess1 == result1 && guess2 == result2 && guess3 == result3)
			msg = "You win $1,000,000";
		else if((guess1 == result1 || guess1 == result2 || guess1 == result3) && (guess2 == result1 || guess2 == result2 || guess2 == result3)
					&& (guess3 == result1 || guess3 == result2 || guess3 == result3))
				msg = "You win $1,000";
			else if(((guess1 == result1 || guess1 == result2 || guess1 == result3) && 
					(guess2 == result1 || guess2 == result2 || guess2 == result3)) || 
					((guess2 == result1 || guess2 == result2 || guess2 == result3) && 
					(guess3 == result1 || guess3 == result2 || guess3 == result3)) || 
					((guess3 == result1 || guess3 == result2 || guess3 == result3) && 
					(guess1 == result1 || guess2 == result1 || guess1 == result3)))
				msg = "You win $100";
				else if((guess1 == result1 || guess1 == result2 || guess1 == result3) || 
						(guess2 == result1 || guess2 == result2 || guess2 == result3) ||
						(guess3 == result1 || guess3 == result2 || guess3 == result3))
					msg = "You win $10";
					else
						msg = "You lose";
		JOptionPane.showMessageDialog(null, "Your numbers: " + guess1 + ", " + guess2 + ", " + guess3 + "\nThe lottery numbers: " 
					+ result1 + ", " + result2 + ", " + result3 + "\n" + msg);
	}

}
