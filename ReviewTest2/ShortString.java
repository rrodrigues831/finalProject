
/**
 * Write a description of class ShortString here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ShortString extends MyString
{
    public static void main (String [] args ) {
        firstAndLast(cat);
    }
    public String ShortString(String s){
        
        super(s);
        String firstChar;
        String lastChar;
        firstChar = s.substring(0);
        //lastChar = s.
        lastChar = System.out.println(s.length()-1);
        System.out.println(firstChar);
        String firstAndLast;
        firstAndLast = firstChar + lastChar;
        return firstAndLast;
    }
}
