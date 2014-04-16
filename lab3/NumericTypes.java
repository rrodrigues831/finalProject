/**
   This program demonstrates how numeric types and operators behave in Java
*/

public class NumericTypes
{


   public static void main (String [] args)
   {
       
      //******************  Problem 1 *****************************
      //variable declarations
      double number = 2 ;     // number of scores
      double score1 = 100;    // first test score
      double score2 = 95;     // second test score
      double average;            // arithmetic average
      String output;             // line of output to print out
      
      // Find the average of score1 and score2
      average = (score1 + score2) / number;
      
      // Print the average with explanatory info
      System.out.println("The average of " + score1 + " and " + score2 + " is " + average);      
      System.out.println();      // to leave a blank line 
      
      //****************** End Problem 1 ***************************/      
      //******************  Problem 2 *****************************
      
      int fahrenheit = 212;  // boiling temperature in fahrenheit
      int celsius;               // temperature in celsius
     
      // Convert Fahrenheit temperatures to Celsius
      celsius = (int)(5.0/9 * (fahrenheit - 32));
      System.out.println(fahrenheit + "deg F = " + celsius + "deg C");
      System.out.println();      // to leave a blank line

      //****************** End Problem 2 ***************************/      
      //******************  Problem 3 *****************************
      
      double diameter = 6.0; // the diameter of a sphere

      // Create a variable to store the radius and initialize with 
      //    one half of the diameter 
      double radius = diameter/2.0;
      
      // calculate and store the volume of the sphere using Math.PI and Math.pow
      double volume;
      volume = ((4.0/3.0)*Math.PI)*(Math.pow(radius,3));
      System.out.println("The volume of the sphere is:" + volume + " meters");
      // print out the volume
      
      
      //****************** End Problem 3 *****************************/
      
   }  
}