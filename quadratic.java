/*
Key-in
Programmer:  Aaron Buelo
Program:  Quad
Purpose:  showing off all of the great skills you learned in semester 1


*/

import javax.swing.*;
public class quadratic 
{
	
	public static void main(String[] args) 
	{
			
			double A=0,B=0,C=0;
			String result = "", a = "", b = "", c = "";
			int quitprogram = 1;
			double determinant, denominator, ans1=0, ans2=0, top1=0, top2, imagnumber=0;
			loops:
			while(!(quitprogram == 0))
			{
			JOptionPane.showMessageDialog(null,"Enter A, B, and C. Enter q to quit.");
			a = JOptionPane.showInputDialog(null,"Enter the A value: ");
			if (a.equals("q")) System.exit(0);
			b = JOptionPane.showInputDialog(null,"Enter the B value: ");
			if (a.equals("q")) System.exit(0);
			c = JOptionPane.showInputDialog(null,"Enter the C value: ");
			if (a.equals("q")) System.exit(0);
			
			if (a.equals("q"))
				{
				quitprogram = 0;
				break loops;
				}
				try{
			 		A = Double.parseDouble(a);
			 		B = Double.parseDouble(b);
			 		C = Double.parseDouble(c);	
		
					}
		//process improperly formatted input.  This error will be displayed
		// if the user puts in a letter or decimal number	
				catch(NumberFormatException numberFormatException)
				{
				JOptionPane.showMessageDialog(null, "You must enter 3 numbers!!", "INVALID FORMAT", JOptionPane.ERROR_MESSAGE);
				}
	
				determinant = (B*B) - (4*A*C);
				denominator = (2*A);
				top1 = Math.sqrt(determinant);
				top2 = -1*B - top1;
				imagnumber = Math.sqrt(-determinant)/denominator;
				try
				{
					if(determinant == 0)
					{
						ans1 = top2/denominator;
						result = "One solution: " + ans1;
					}
					else if(determinant >0)
						{
							ans1 = (-B + Math.sqrt(determinant))/denominator;
							ans2 = (-B - Math.sqrt(determinant))/denominator;
							result = "Two Real solutions:  " + ans1 + " and " + ans2;
						}
					else
						{
							result = "The result is an imaginary number " + -B/denominator + "+/-" + imagnumber + "i";
						}
					}// end of 'try'
		// Process attempts to divide by zero
				catch(ArithmeticException arithmeticException)
				{
					JOptionPane.showMessageDialog(null, "This is linear!", "INVALID FORMAT", JOptionPane.ERROR_MESSAGE);
				}
		 	JOptionPane.showMessageDialog(null, result);
		 	
		 	quitprogram = JOptionPane.showConfirmDialog(null, "Would you like to quit?","TITLE HERE",JOptionPane.YES_NO_OPTION);
		 	if (quitprogram == 0)
		 		a = "q";
			}
  		}// end while loop

	}// end main 
// end class

/*
Try answering these without running it first and then run it to check to see 
if you were right!
1.  What type of data is expected for the coefficients?
 
2.   What happens if you enter a 0 for number 2?  Can you fix that?

3.  What happens if the user accidentally enters an 'a' for number 3?

4.  What happens if the user enters a 'q' alone?

5.  What happens if the user enters a 'q' with 2 numbers? 

6.  What happens if you do not initialize num1, num2, or num3?

7.  How could you improve this program?
 


*/