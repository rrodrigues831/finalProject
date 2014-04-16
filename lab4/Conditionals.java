

/**
   This program demonstrates how numeric types and operators behave in Java
*/

public class Conditionals
{


   public static void main (String [] args)
   {
       
      //******************  Demo 1 Modulus *****************************
      int a = 7;
      int b = 3;
      int quotient = a / b;   // 2
      int remainder = a % b;  // 1
      
      System.out.println(a + " divided by " + b + " = " 
                           + quotient + " remainder " + remainder);
                           
      System.out.println();      // to leave a blank line 
      
      //****************** End Demo 1 ***************************/      
      /******************  Demo 2 Conditionals *****************************
      
      int temp = 30;
      if (temp < 32){
          System.out.println("wear a coat");
      }

      int x = 3, y = 5;
      if(x > y) {
    	System.out.println(x + " is greater than " + y);
      }
    
      if(x == y) {
    	System.out.println(x + " equals " + y);
      }
    
      if(x != y)
      {
        System.out.println("X is not equal to Y");
        x = y;
        System.out.println("However, now it is.");
      }
      
      if (x % y == 0)
      {
          System.out.println("X is divisible by Y");
      }
      
      
      
      //****************** End Demo 2 ***************************/      
      /******************  Demo 3 *****************************
      // write a conditional to test if x is even or odd
      
      
      
      //****************** End Demo 3 *****************************/
      /******************  Demo 4 *****************************
      // write a method checkParity to do the task of Demo 3
      
      checkParity(40);
      checkParity(33);
      
      //****************** End Demo 4 ***************************/      
      /******************  Demo 5 Nested Conditionals *****************************
      int temp, snowfall;
      temp = 30; 
      snowfall = 3;  // inches of snow

        if (temp < 30){
             if (snowfall > 2){
                  System.out.println("wear a parka");
             }
             else{
                  System.out.println("wear a jacket");
             }
        }
        else{
             System.out.println("wear shorts");
        }     
      
      //****************** End Demo 5 ***************************/      
      /******************  Demo 6 Chained Conditional  *****************************

        int x = 20; 
        
        if (x > 0) {
           System.out.println("x is positive");
        } else if (x < 0) {
           System.out.println("x is negative");
        } else {
           System.out.println("x is zero");
        }

      //****************** End Demo 6 ***************************/      
      /******************  Demo 7 Return statement *****************************
      printSquareRoot(0);
      printSquareRoot(5);
      //****************** End Demo 7 ***************************/      
   }  
   
  public static void printSquareRoot(double x) {
    if (x < 0.0) {
      System.out.println("No negative numbers, please.");
      return;
    }

    double result = Math.sqrt(x);
    System.out.println("The square root of x is " + result);
  }   
}