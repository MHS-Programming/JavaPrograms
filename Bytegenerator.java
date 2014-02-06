/*
Program:  RandomNumberGen
Programmer:  Aaron Buelo
Purpose:  Create an 8 bit (byte) and ask user to identify the decimal, tell whether correct or not, give help if it's wrong
*/
import java.util.Random;
import javax.swing.JOptionPane;
public class Bytegenerator {
	 public static void main (String[] args)
	   {
		int num1, num2, num3, num4, num5, num6, num7, num8;
		Random generator = new Random();
		//
		num1 = Math.abs(generator.nextInt()) % 2;
		num2 = Math.abs(generator.nextInt()) % 2;
		num3 = Math.abs(generator.nextInt()) % 2;
		num4 = Math.abs(generator.nextInt()) % 2;
		num5 = Math.abs(generator.nextInt()) % 2;
		num6 = Math.abs(generator.nextInt()) % 2;
		num7 = Math.abs(generator.nextInt()) % 2;
		num8 = Math.abs(generator.nextInt()) % 2;
		JOptionPane.showInputDialog("Your byte is: " + num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8);
	   }
}