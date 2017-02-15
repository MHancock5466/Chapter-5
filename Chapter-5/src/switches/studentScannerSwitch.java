/**
 * 
 */
package switches;

/**
 * @author MH137428
 *
 */
import javax.swing.JOptionPane;
public class studentScannerSwitch 
{

	public static void main(String[] args) 
	{
		String student;
		int ID;
		student = (String)JOptionPane.showInputDialog(null, "Please scan the student ID", "Enter User ID #", JOptionPane.QUESTION_MESSAGE);
		ID = Integer.parseInt(student);
		
		if(ID >= 100000 && ID <= 999999)
		{
			switch(ID)
			{
				case 274896:
					JOptionPane.showMessageDialog(null, "Andrew McKenzie");
					break;
				case 274885:
					JOptionPane.showMessageDialog(null, "Charles Carlstrom");
					break;
				case 316282:
					JOptionPane.showMessageDialog(null, "Ress Alzahrani");
					break;
				case 274884:
					JOptionPane.showMessageDialog(null, "Tatyana Vaughn");
					break;
				case 133778:
					JOptionPane.showMessageDialog(null, "Nick Hasson");
					break;
				case 131457:
					JOptionPane.showMessageDialog(null, "Kassie Remley");
					break;
				case 137412:
					JOptionPane.showMessageDialog(null, "Sebastian Frick");
					break;
				case 131147:
					JOptionPane.showMessageDialog(null, "Zach Dorris");
					break;
				case 274887:
					JOptionPane.showMessageDialog(null, "Chase Kress");
					break;
				case 133225:
					JOptionPane.showMessageDialog(null, "Isaiah Ponciano");
					break;
				case 137428:
					JOptionPane.showMessageDialog(null, "Mason Hancock");
					break;
				default:
					JOptionPane.showMessageDialog(null, "Error 404, Student Not Found");	
			}
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Code not accepted");
		}
	}

}
