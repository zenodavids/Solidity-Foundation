
//////////////////////////////////////////////////////////////////////

// CLASS

// A class is a template to make objects.

public class Point{
// declares a class called Point. this can be named anything
// this class represent two dimensional points

    private int x;
    private int y;
// declares two fields; int x and int y.
// field is the name for a variable inside of an object.
//these are also called instance variables
// private keyword means only code inside this class can directly manipulate these fields

    public Point(int startX, int startY){
// declares a constructor.
// constructor specifies how to create objects in this class
// this is code that gets run when an object is created to initialize that object.
// constructor looks like a function but has no return type
// constructor is named the same as the class
//public keyword means any code can use this to create a point

        x = startX;
        y = startY;
    }
    public int getX() {return x;}
    public int getY() {return y;}
    public double distance (Point otherPt) {
// declares three methods (getX, getY, distance)
// methods are functions inside a class.
// in java, everything is inside a class, so all functions in java are methods
// these methods are invoked or called on a particular object

        int dx = x - otherPt.getX();
// this calls the getX method on the otherPt object
// this would get the x of this particular point object.

        int dy = y - otherPt.getY();
// this calls the getY method on the otherPt object

        return Math.sqrt(dx * dx + dy * dy);
// Math.sqrt() is a java class
    }
    public static void main(String[] args){
// declares a static method
// static method don't add to any specific of a class, they just belong to the class
// this method is called 'main' which is a special method
//main is the stating point and execution begins in main before objects are even created

        Point p1 = new Point(3, 4);
        Point p2 = new Point(6, 8);
// the new keyword creates a new class (Point)
// every time we use 'new', we create data in a heap
// data in the heap does'nt go away when a function is returned,  destroying it's frame

        System.out.println(p1.distance(p2))
// this prints whats in it's parenthesis.
    }
}

/**
 *  * constructors and methods take an optional parameter named 'this' that tells them which object they are operating on.
 *

 ** method calls work like function calls except we have to pass 'this' parameter to let java know which method it's working on.
 * */

///////////////////////////////////////////////////////////////////