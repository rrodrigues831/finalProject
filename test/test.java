
/**
 * Write a description of class test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class test
{
    public static void main (String [] args) {
        shirtSize(40);
        shirtSize(35);
        shirtSize(48);
    }

    public static void shirtSize(int inches){
        if (inches < 37) {
            System.out.println(inches + "inches is S");
        } else if (37 >= inches < 41) {
            System.out.println(inches + "inches is M");
        } else if (42 >= inches < 45){
            System.out.println(inches + "inches is L");
        }else {
            System.out.println(inches + "inches is XL");
        }

    }
}
