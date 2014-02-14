/*
This program is an example of how the
quadratic equation program could be written 
making use of methods.  compare it to the 
program you wrote without methods to see
what's different/the same
Notice that there is a main section in
this program!
*/
import javax.swing.*;
public class quad_eq_methods
{
   
   
   // method: get_num
   // Asks the user to enter the value of a number,
   // tests the entered amount and returns the value entered
   // Parameters: the String name of the variable the user is entering
   // Return type: the value of the users entry
   public static double get_num(String name)
   {
      
      String entered_value;
      double ret_val=0;
      boolean worked= false;
      entered_value = JOptionPane.showInputDialog("Please enter the value of: " + name + ": ");
      while(worked == false)
      try
      {
         ret_val = Double.parseDouble(entered_value);
         worked = true;
      }catch(NumberFormatException numberFormatException){
         entered_value = JOptionPane.showInputDialog("I'm sorry you must enter an integer value for "+ name + ": ");
         
      }
      
    return ret_val;  
   }
   
   // method: determinant
   // This method takes in values for a,b,and c of a quadratic equation
   // and calculates/ returns the value of the determinant (b^2 - 4ac)
   public static double determinant(double A, double B, double C)
   {
      return (B*B - 4*A*C);
   
   }
  
   
   
   // I will test out my methods above int the main section of the program.
   public static void main(String[] args)
   {
      double a=0,b,c;   //why did I just initialize a?
      double det=0, root1, root2;   
      String output = " ";
      //get values for a,b, and c from the user
      while(a == 0)        //why do I care if a is 0, why do I keep asking till it's not 0?
         {
            a = get_num("A");
            if (a == 0)
               JOptionPane.showMessageDialog(null, "This is a line, you must enter a value other than 0 for A");
         }
      b = get_num("B");
      c = get_num("C");
      
      det = determinant(a,b,c);
      // NOTE:  I COULD ALSO JUST WRITE: 
      // det = determinant(get_num("A"),get_num("B"),get_num("C"));
      // try it!!!
      
      if(det >= 0)
      {
        
        
         root1 = (-b + Math.sqrt(det))/(2*a);
         root2 = (-b - Math.sqrt(det))/(2*a);
         if(root1 == root2) output = "The root is " + root1;
         else output = "The roots are " + root1 + " and " + root2 ;
        
      }
      else
      {
                    
         output = "The roots are (" + (-b)+" + " + Math.abs(Math.sqrt(-det)) + "i )/ "+(2*a)+" and (" + 
               (-b) + " - "+ Math.abs(Math.sqrt(-det)) + "i )/ "+(2*a);
      
      }
      JOptionPane.showMessageDialog(null, output);
   }

}