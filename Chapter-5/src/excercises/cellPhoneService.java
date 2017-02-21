/**
 * 
 */
package excercises;

/**
 * @author MH137428
 *
 */
import javax.swing.JOptionPane;
public class cellPhoneService 
{

	public static void main(String[] args) 
	{
		String msg = null;
		int minutes, texts, gigabytes;
		
		minutes = Integer.parseInt(JOptionPane.showInputDialog(null, "How many minutes a month do you need?"));
		texts = Integer.parseInt(JOptionPane.showInputDialog(null, "How many texts do you send a month?"));
		gigabytes = Integer.parseInt(JOptionPane.showInputDialog(null, "How many gigabytes of data do you need monthly?"));
		
		if(gigabytes == 0)
			if(minutes < 500)
			{
				if(texts == 0)
					msg = "Plan A, for $49 a month";
				if(texts > 0)
					msg = "Plan B, for $55 a month";
			}
			if(minutes >= 500)
			{
				if(texts < 100)
					msg = "Plan C, for $61 a month";
				if(texts >= 100)
					msg = "Plan D, for $70 a month";
			}
		if(gigabytes > 0)
		{
			if(gigabytes < 2)
				msg = "Plan E, for $79 a month";
			if(gigabytes >= 2)
				msg = "Plan F, for $87 a month";
		}
		JOptionPane.showMessageDialog(null, "Based on your choices you should pick " + msg);
	}

}
