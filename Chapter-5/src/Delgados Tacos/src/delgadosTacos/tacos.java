/**
 * 
 */
package delgadosTacos;

/**
 * @author MH137428
 *
 */
import javax.swing.JOptionPane;
import java.text.DecimalFormat;
public class tacos 
{

	public static void main(String[] args)	//Main Method
	{
		String response;	//String used for JOptionPane
		int burritos, tacos, churros, nachos, enchiladas, quesadillas, tamales, empanadas, fajitas, pops;	//Integers for inputs
		
		tacoTruck();	//Calling tacoTruck method
		
		response = JOptionPane.showInputDialog(null, "How many burritos would you like?");	//Question x10 in Input Dialog Boxes
		burritos = Integer.parseInt(response);	//Response to Integer x10
		response = JOptionPane.showInputDialog(null, "How many tacos would you like?");
		tacos = Integer.parseInt(response);
		response = JOptionPane.showInputDialog(null, "How many churros would you like?");
		churros = Integer.parseInt(response);
		response = JOptionPane.showInputDialog(null, "How many nachos would you like?");
		nachos = Integer.parseInt(response);
		response = JOptionPane.showInputDialog(null, "How many enchiladas would you like?");
		enchiladas = Integer.parseInt(response);
		response = JOptionPane.showInputDialog(null, "How many quesadillas would you like?");
		quesadillas = Integer.parseInt(response);
		response = JOptionPane.showInputDialog(null, "How many tamales would you like?");
		tamales = Integer.parseInt(response);
		response = JOptionPane.showInputDialog(null, "How many empanadas would you like?");
		empanadas = Integer.parseInt(response);
		response = JOptionPane.showInputDialog(null, "How many fajitas would you like?");
		fajitas = Integer.parseInt(response);
		response  = JOptionPane.showInputDialog(null, "How many drinks would you like?");
		pops = Integer.parseInt(response);
		
		salesTax(burritos, tacos, churros, nachos, enchiladas, quesadillas, tamales, empanadas, fajitas, pops);	//Calling salesTax method using user inputs
	}

	public static void salesTax(int bu, int tac, int ch, int na, int en, int qu, int tam, int em, int fa, int po)	//Declaring salesTax method with different inputs
	{
		DecimalFormat df = new DecimalFormat("0.00");	//Creating format for two decimals
		double burritoPrice = 2;	//Declaring values for objects
		double tacoPrice = 1.5;
		double churroPrice = .75;
		double nachoPrice = 1.75;
		double enchiladaPrice = 2;
		double quesadillaPrice = 1.25;
		double tamalePrice = 1.5;
		double empanadaPrice = 3;
		double fajitaPrice = 2.5;
		double popPrice = 1;
		double tax = .075;
		double cost, costTax;	//Declaring cost objects
		
		cost = (bu * burritoPrice) + (tac * tacoPrice) + (ch * churroPrice) + (na * nachoPrice) + (en * enchiladaPrice) + 	//Determining cost value
				(qu * quesadillaPrice) + (tam * tamalePrice) + (em * empanadaPrice) + (fa * fajitaPrice) + (po * popPrice);
		
		costTax = cost * tax;	//Determining costTax value
		
		JOptionPane.showMessageDialog(null, "Your food cost is $" + (df.format(cost)) + ". The sales tax is $" + (df.format(costTax)) + 
				". Your total price will be $" + (df.format(cost+costTax)) + ".");	//Displaying cost, costTax, and total											
	}
	
	public static void tacoTruck()	//Declaring method tacoTruck
	{
		System.out.println("******************************************");	//Displaying the tacoTruck in the console
		System.out.println("*   TACOS TACOS TACOS TACOS TACOS TACOS   ***");
		System.out.println("*        *************************           **");
		System.out.println("*        *                       *             *");
		System.out.println("*        *                       *             *");
		System.out.println("*        *                       *             *");
		System.out.println("*        *************************              ********");
		System.out.println("*                                                       **");
		System.out.println("*        *****   *    ***** *****                         *");
		System.out.println("*          *    * *   *     *   *                         *");
		System.out.println("*          *   *****  *     *   *                         *");
		System.out.println("*          *  *     * ***** *****                        *");
		System.out.println("*********************************************************");
		System.out.println("     *      *                              *      *");
		System.out.println("      **  **                                **  **");
		System.out.println("        **                                    **");
	}
	
}
