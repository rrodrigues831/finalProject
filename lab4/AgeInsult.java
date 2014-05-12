/**  CORRECT THE ERRORS! Find all 8 (or more?), if you dare!		
 *
 * A program that reads an age that is typed in by the
 * user and insults them 
 */
import java.util.*;
 
public class AgeInsult {
	public static void main(String args) {

		Scanner keyboard = new Scanner(System.in);

		System.out.println("How old are you?");

		int age = keyboard.nextDouble();

		//Exactly one of these 4 main blocks will be executed.
		if (age <= 3) {
			System.out.println("Too young to know any better.")
		
		else if (age < 10) {
			Sytem.out.println(Not ready for prime time.);
		}
		else if (age < 18) {
			System.out.println("Grow up.");
		}
		else (age >=18) {
			System.out.println("Get a job!");
		}

		//if statement without "else if" or even an "else".
		//  this will either execute or not execute depending on age
		if (age > 120) {
			System.out.println("Way too old!  You are probably lying.");
		}
    }

*/
