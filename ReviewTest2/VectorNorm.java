
/**
 * Write a description of class VectorNorm here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VectorNorm
{
    public static void main (String [] args) {
     System.out.println(norm(2, 3, 4));   
    }

    public static double norm (int x, int y, int z) {
        double magnitude;
        magnitude = Math.sqrt(x^2 + y^2 + z^2);
        return magnitude;
    }
}
