/*
Program:  RandomNumberGen
Programmer:  Aaron Buelo
Purpose:  Create an 8 bit (byte) and ask user to identify the decimal, tell whether correct or not, give help if it's wrong
*/
import java.util.Random;
import javax.swing.JOptionPane;
public class Bytegenerator 
{
	 public static void main (String[] args)
	   {
		int num1, num2, num3, num4, num5, num6, num7, num8;
		double num1value, num2value, num3value, num4value, num5value, num6value, num7value, num8value, answer, input1 = 0;
		String input = "";
		Random generator = new Random();
		num1 = Math.abs(generator.nextInt()) % 2;
		num2 = Math.abs(generator.nextInt()) % 2;
		num3 = Math.abs(generator.nextInt()) % 2;
		num4 = Math.abs(generator.nextInt()) % 2;
		num5 = Math.abs(generator.nextInt()) % 2;
		num6 = Math.abs(generator.nextInt()) % 2;
		num7 = Math.abs(generator.nextInt()) % 2;
		num8 = Math.abs(generator.nextInt()) % 2;
		
		num1value = num1*Math.pow(2,0);
		num2value = num2*Math.pow(2,1);
		num3value = num3*Math.pow(2,2);
		num4value = num4*Math.pow(2,3);
		num5value = num5*Math.pow(2,4);
		num6value = num6*Math.pow(2,5);
		num7value = num7*Math.pow(2,6);
		num8value = num8*Math.pow(2,7);
		
		answer = num1value + num2value + num3value + num4value + num5value + num6value + num7value + num8value;
		System.out.println(answer);
			
			while(!input.equals("q"))
			{
				input = JOptionPane.showInputDialog("Your byte is: " + num8 + num7 + num6 + num5 + num4 + num3 + num2 + num1 + '\n' + "Please enter the integer value" +
						" of the binary number. Enter q to quit.");
				if(input.equals("q"))
				{
				break;
				}
				
				try{	
			 		input1 = Double.parseDouble(input);
					}
				catch(NumberFormatException numberFormatException)
					{
				JOptionPane.showMessageDialog(null, "You must enter a valid integer!", "INVALID FORMAT", JOptionPane.ERROR_MESSAGE);
					}
				if(input1 == answer)
					{
					JOptionPane.showMessageDialog(null,"GREAT JOB! You got it right!"); 
					}
				else
					{
					JOptionPane.showMessageDialog(null,"That's not right. Remember, the first value is 2^0, and the eigth value is 2^7." + 
							" Add the value if it is a 1, the 0's don't give you anything.");
					}
				num1 = Math.abs(generator.nextInt()) % 2;
				num2 = Math.abs(generator.nextInt()) % 2;
				num3 = Math.abs(generator.nextInt()) % 2;
				num4 = Math.abs(generator.nextInt()) % 2;
				num5 = Math.abs(generator.nextInt()) % 2;
				num6 = Math.abs(generator.nextInt()) % 2;
				num7 = Math.abs(generator.nextInt()) % 2;
				num8 = Math.abs(generator.nextInt()) % 2;
				
				num1value = num1*Math.pow(2,0);
				num2value = num2*Math.pow(2,1);
				num3value = num3*Math.pow(2,2);
				num4value = num4*Math.pow(2,3);
				num5value = num5*Math.pow(2,4);
				num6value = num6*Math.pow(2,5);
				num7value = num7*Math.pow(2,6);
				num8value = num8*Math.pow(2,7);
				answer = num1value + num2value + num3value + num4value + num5value + num6value + num7value + num8value;
				System.out.println(answer);
			}
	   }
	 
}
			
		

