/**
 * 
 */
package gameZone;

/**
 * @author MH137428
 *
 */
import javax.swing.JOptionPane;
import java.util.Random;
public class randomGuess2 
{

	public static void main(String[] args) 
	{
		Random r = new Random();
		String msg;
		int guess;
		final int low = 100;
		final int high = 1000;
		
		int result = r.nextInt(high) + low;
		
		guess = Integer.parseInt(JOptionPane.showInputDialog(null, "Guess a number between " + low + " and " + high, "Guess A Number", 
				JOptionPane.QUESTION_MESSAGE));
		
		if(guess == result)
			msg = "\nYou were right. Well done";
		else
			if(guess < result)
				msg = "\nYou guessed too low";
			else
				msg = "\nYou guessed too high";
		JOptionPane.showMessageDialog(null, "The number was " + result + msg);
	}
}
