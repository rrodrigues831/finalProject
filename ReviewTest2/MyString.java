
/**
 * Write a description of class MyString here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */


  public class MyString {

    private String s;
    
    public MyString(String s) {
        this.s = s;
    }

    public String getString() {
        return s;
    }

    public void display() {
        System.out.println(getString());
    }

}

