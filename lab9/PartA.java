import javafx.geometry.Point2D;
import javafx.scene.shape.Rectangle;

/**
 * Created by brian on 3/22/14.
 */
public class PartA  {

    public static void main(String[] args) {
        System.out.println("\f");

        // ~~~ 9.1 CREATING AN OBJECT VARIABLE AND A NEW OBJECT ~~~~~~~~~~~~~~~~~~~
        // In Java, a point is represented by a Point object.
        // To create a new point, you have to
        //    a) create an object variable to refer to it, and
        //    b) use new to create the actual object

        Point2D dot = new Point2D(3, 4);  // dot contains a reference to a newly created Point object
        // every Point object has an x and a y instance variable
        
        // Create a new point object named foo
        Point2D foo = new Point2D(2, 3);


        // ~~~ 9.3 ACCESSING THE INSTANCE VARIABLES OF AN OBJECT ~~~~~~~~~~~~~~~~~
        // The pieces of data that make up an object are called instance variables
        // because each object, which is an instance of its type, has its own copy
        // of the instance variables.

        double xCoord = dot.getX(); //go to the object dot refers to, and get the value of instance variable x

        System.out.println("Here are the x and y values of dot: " + dot.getX() + ", " + dot.getY());

        // Declare a second Point object variable and have it refer to a
        // new Point with coordinates 18,7
        Point2D second = new Point2D(18, 7);


        // Then print out the instance variables of your new point
        System.out.println("x = " + second.getX() + " y = " + second.getY());


        // ~~~ 9.2 USING THE INSTANCE VARIABLES TO CALCULATE A NEW VALUE ~~~~~~~~~~
        double distanceSquared = dot.getX() * dot.getX() + dot.getY() * dot.getY();
        System.out.println("The distance of dot from the origin is " + Math.sqrt(distanceSquared) ) ;



        // ~~~ 9.4 OPTIONS FOR PRINTING A POINT OBJECT ~~~~~~~~~~~~~~~~~~~~~~~~~~~
        System.out.print("Printing dot using printPoint, dot = ");
        printPoint(dot);     // here we are passing dot to the printPoint method to be printed there

        // or we can just use a built in method in the Point class
        System.out.println("Using built in method to print a Point, dot = " + dot);



        // ~~~ 9.5 RECTANGLE OBJECTS ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        Rectangle box = new Rectangle(0, 0, 100, 200);
        System.out.println("box = " + box);

        // make a printRectangle method and invoke it here
        //printRectangle(box);
        // You can change the contents of an object by making an assignment to one of its instance variables.
        // For example, to “move” a rectangle without changing its size, you can modify the x and y values:

        box.setX(box.getX() + 50);
        box.setY(box.getY() + 100);



        // ~~~ 9.6 OBJECTS CAN BE RETURNED FROM METHODS AS WELL ~~~~~~~~~~~~~~~~~~
        Point2D center = findCenter(box);

        printPoint(center);



        // ~~~ 9.7 OBJECTS ARE MUTABLE (Changeable) ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        Rectangle box1 = new Rectangle(100, 200, 80, 40);
        moveRect(box1, 50, 100);
        System.out.println("After moveRect(box1, 50, 100), box1 = " + box1);


        // a) figure out how to use distance to determine the distance
        //    between the upper left corners of box and box1.
        double d = distance(new Point2D(box.getX(), box.getY()),
                new Point2D(box1.getY(), box1.getY()));
        System.out.println("distance = " + d);



        // ~~~ 9.8  ALIASING ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        //      when two or more object variables refer to the same object
        Rectangle box2 = box1;

        // change box2 and see what happens to both box1 and box2
        printRectangle(box1);



        // ~~~ 9.9 THE KEYWORD NULL ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        Point2D blank = null;           // blank does not refer to any object
        //double xValue = blank.getX();        // NullPointerException

        // ~~~ 9.10 GARBAGE COLLECTION ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        blank = new Point2D(1,2);       // Now blank refers to an actual Point object
        blank = null;                 // Now blank does not refer to an object
        //   The Point(1,2) object has been "orphaned"
        //   and will be removed from memory
        blank = new Point2D(5,6);       // Now blank refers to a different Point object
        //   that has just been created by new


    }

    public static void printPoint(Point2D p) {
        System.out.printf("(%.2f, %.2f)\n", p.getX(), p.getY());
    }
    public static void printRectangle(Rectangle r) {
    System.out.printf("The x is " + r.getX() + " The y is " + r.getY() + " The width is " + r.getWidth() +
            " The height is " + r.getHeight());
    }

    public static Point2D findCenter(Rectangle rect) {
        double x = rect.getX() + rect.getWidth() / 2;
        double y = rect.getY() + rect.getHeight() / 2;
        return new Point2D(x, y);
    }

    public static void moveRect(Rectangle box, double dx, double dy) {
        box.setX(box.getX() + dx);
        box.setY(box.getY() + dy);
    }

    public static double distance(Point2D p1, Point2D p2) {
        double dx = p2.getX() - p1.getX();
        double dy = p2.getY() - p1.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }



}
