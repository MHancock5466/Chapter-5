/**
 * 
 */
package excercises;

/**
 * @author MH137428
 *
 */
import javax.swing.JOptionPane;
public class pay 
{

	public static void main(String[] args) 
	{
		int skill, hours, insurance, retire, extraPay, pay1 = 17, pay2 = 20, pay3 = 22;
		double pay;
		
		skill = Integer.parseInt(JOptionPane.showInputDialog(null, "What is your skill level?\n1, 2, or 3"));
		hours = Integer.parseInt(JOptionPane.showInputDialog(null, "How many hours did you work this week?"));
		
		if(hours > 40)
		{
			if(skill == 1)
			{
				pay = (pay1*hours);
				extraPay = pay1*(hours-40);
				JOptionPane.showMessageDialog(null, "Hours: " + hours + "\nHourly Rate: " + pay1 + "\nRegular Pay: " + pay
						+ "\nOvertime Pay: " + extraPay + "\nTotal Pay: " + (pay+extraPay) + "\nTotal with Expenses: " + (pay+extraPay));
			}
			if(skill == 2)
			{
				pay = pay2*hours;
				extraPay = pay2*(hours-40);
				insurance = Integer.parseInt(JOptionPane.showInputDialog(null, "1 = Medical\n2 = Dental\n3 = Long-Term Disabilty"
						+ "\nWhat insurance policy would you want?"));
				if(insurance == 1)
					JOptionPane.showMessageDialog(null, "Hours: " + hours + "\nHourly Rate: " + pay2 + "\nRegular Pay: " + pay
							+ "\nOvertime Pay: " + extraPay + "\nTotal Pay: " + (pay+extraPay) + "\nTotal with Expenses: " + (pay-32.50));
				if(insurance == 2)
					JOptionPane.showMessageDialog(null, "Hours: " + hours + "\nHourly Rate: " + pay2 + "\nRegular Pay: " + pay
							+ "\nOvertime Pay: " + extraPay + "\nTotal Pay: " + (pay+extraPay) + "\nTotal with Expenses: " + (pay-20));
				if(insurance == 3)
					JOptionPane.showMessageDialog(null, "Hours: " + hours + "\nHourly Rate: " + pay2 + "\nRegular Pay: " + pay
							+ "\nOvertime Pay: " + extraPay + "\nTotal Pay: " + (pay + extraPay) + "\nTotal with Expenses: " + (pay-10));
			}
			if(skill == 3)
			{
				pay = pay3*hours;
				extraPay = pay3*(hours-40);
				insurance = Integer.parseInt(JOptionPane.showInputDialog(null, "1 = Medical\n2 = Dental\n3 = Long-Term Disabilty"
						+ "\nWhat insurance policy would you want?"));
				retire = Integer.parseInt(JOptionPane.showInputDialog(null, "Do you want to participate in the retirement program?"
						+ "\n1 = Yes\n2 = No"));
				if(insurance == 1)
				{
					if(retire == 1)
						JOptionPane.showMessageDialog(null, "Hours: " + hours + "\nHourly Rate: " + pay3 + "\nRegular Pay: " + pay
								+ "\nOvertime Pay: " + extraPay + "\nTotal Pay: " + (pay+extraPay) + "\nTotal with Expenses: " + (pay-32.50));
					if(retire == 2)
						JOptionPane.showMessageDialog(null, "Hours: " + hours + "\nHourly Rate: " + pay3 + "\nRegular Pay: " + pay*.03
								+ "\nOvertime Pay: " + extraPay + "\nTotal Pay: " + (pay+extraPay)*.03 + "\nTotal with Expenses: " + ((pay*.03)-32.50));
				}
				if(insurance == 2)
				{
					if(retire == 1)
						JOptionPane.showMessageDialog(null, "Hours: " + hours + "\nHourly Rate: " + pay3 + "\nRegular Pay: " + pay
								+ "\nOvertime Pay: " + extraPay + "\nTotal Pay: " + (pay+extraPay) + "\nTotal with Expenses: " + (pay-20));
					if(retire == 2)
						JOptionPane.showMessageDialog(null, "Hours: " + hours + "\nHourly Rate: " + pay3 + "\nRegular Pay: " + pay*.03
								+ "\nOvertime Pay: " + extraPay + "\nTotal Pay: " + (pay+extraPay)*.03 + "\nTotal with Expenses: " + ((pay*.03)-20));
				}
				if(insurance == 3)
				{
					if(retire == 1)
						JOptionPane.showMessageDialog(null, "Hours: " + hours + "\nHourly Rate: " + pay3 + "\nRegular Pay: " + pay
								+ "\nOvertime Pay: " + extraPay + "\nTotal Pay: " + (pay+extraPay) + "\nTotal with Expenses: " + (pay-10));
					if(retire == 2)
						JOptionPane.showMessageDialog(null, "Hours: " + hours + "\nHourly Rate: " + pay3 + "\nRegular Pay: " + pay*.03
								+ "\nOvertime Pay: " + extraPay + "\nTotal Pay: " + (pay+extraPay)*.03 + "\nTotal with Expenses: " + ((pay*.03)-10));
				}
			}
		}
		if(hours <= 40)
		{
			if(skill == 1)
			{
				pay = (pay1*hours);
				JOptionPane.showMessageDialog(null, "Hours: " + hours + "\nHourly Rate: " + pay1 + "\nRegular Pay: " + pay
						+ "\nOvertime Pay: 0" + "\nTotal Pay: " + pay + "Total with Expenses: " + pay);
			}
			if(skill == 2)
			{
				pay = pay2*hours;
				insurance = Integer.parseInt(JOptionPane.showInputDialog(null, "1 = Medical\n2 = Dental\n3 = Long-Term Disabilty"
						+ "\nWhat insurance policy would you want?"));
				if(insurance == 1)
					JOptionPane.showMessageDialog(null, "Hours: " + hours + "\nHourly Rate: " + pay2 + "\nRegular Pay: " + pay
							+ "\nOvertime Pay: 0" + "\nTotal Pay: " + pay + "\nTotal with Expenses: " + (pay-32.50));
				if(insurance == 2)
					JOptionPane.showMessageDialog(null, "Hours: " + hours + "\nHourly Rate: " + pay2 + "\nRegular Pay: " + pay
							+ "\nOvertime Pay: 0" + "\nTotal Pay: " + pay + "\nTotal with Expenses: " + (pay-20));
				if(insurance == 3)
					JOptionPane.showMessageDialog(null, "Hours: " + hours + "\nHourly Rate: " + pay2 + "\nRegular Pay: " + pay
							+ "\nOvertime Pay: 0" + "\nTotal Pay: " + pay + "\nTotal with Expenses: " + (pay-10));
			}
			if(skill == 3)
			{
				pay = pay3*hours;
				insurance = Integer.parseInt(JOptionPane.showInputDialog(null, "1 = Medical\n2 = Dental\n3 = Long-Term Disabilty"
						+ "\nWhat insurance policy would you want?"));
				retire = Integer.parseInt(JOptionPane.showInputDialog(null, "Do you want to participate in the retirement program?"
						+ "\n1 = Yes\n2 = No"));
				if(insurance == 1)
				{
					if(retire == 1)
						JOptionPane.showMessageDialog(null, "Hours: " + hours + "\nHourly Rate: " + pay3 + "\nRegular Pay: " + pay
								+ "\nOvertime Pay: 0" + "\nTotal Pay: " + pay + "\nTotal with Expenses: " + (pay-32.50));
					if(retire == 2)
						JOptionPane.showMessageDialog(null, "Hours: " + hours + "\nHourly Rate: " + pay3 + "\nRegular Pay: " + pay*.03
								+ "\nOvertime Pay: 0" + "\nTotal Pay: " + pay*.03 + "\nTotal with Expenses: " + ((pay*.03)-32.50));
				}
				if(insurance == 2)
				{
					if(retire == 1)
						JOptionPane.showMessageDialog(null, "Hours: " + hours + "\nHourly Rate: " + pay3 + "\nRegular Pay: " + pay
								+ "\nOvertime Pay: 0" + "\nTotal Pay: " + pay + "\nTotal with Expenses: " + (pay-20));
					if(retire == 2)
						JOptionPane.showMessageDialog(null, "Hours: " + hours + "\nHourly Rate: " + pay3 + "\nRegular Pay: " + pay*.03
								+ "\nOvertime Pay: 0" + "\nTotal Pay: " + pay*.03 + "\nTotal with Expenses: " + ((pay*.03)-20));
				}
				if(insurance == 3)
				{
					if(retire == 1)
						JOptionPane.showMessageDialog(null, "Hours: " + hours + "\nHourly Rate: " + pay3 + "\nRegular Pay: " + pay
								+ "\nOvertime Pay: 0" + "\nTotal Pay: " + pay + "\nTotal with Expenses: " + (pay-10));
					if(retire == 2)
						JOptionPane.showMessageDialog(null, "Hours: " + hours + "\nHourly Rate: " + pay3 + "\nRegular Pay: " + pay*.03
								+ "\nOvertime Pay: 0" + "\nTotal Pay: " + pay*.03 + "\nTotal with Expenses: " + ((pay*.03)-10));
				}
			}
		}
	}
}
