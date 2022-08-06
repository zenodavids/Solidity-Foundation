/*
 - Java is object - oriented
 - code is organized in classes
 - the file extension is '.java'
 - source code is human readable with file extension '.java'
 - bytecode is machine readable with file extension '.class'
 - the conversion from source code to bytecode is called compilation
 - before you run your program, you need to compile it.

 * package
 this is a group of classes held together in one place
*/

/////////////////////////////////////////////////////////////

/*
* * SHAPES - collection of points

- to calculate the perimeter of shapes in java, we'll use a java class named 'shape' to model polygons and geometry.
* our java class 'shape' is a finite collection of points
- shapes (polygons) are used in many applications.
* triangle / polygons
- A triangle is the simplest polygon of shape - with a collection of three points.
-- triangles can be combined for complex and wire frame diagrams used by computers or video games.
- shape or polygon is the collection of points
-- we construct a shape/polygon by adding points one at a time.
-- the order in which the points are added to the shape is important.
- shape can be simple or complex and comprises of few points or many points.
* circle
- in geometry, a circle is an infinite collection of points that are all the same distance from the center of the circle.
- circle and other shapes are harder to model using our java class 'shape' because they are not really a finite collection of points
* however, we can model a circle with many points.
*/

//////////////////////////////////////////////////////////

// VARIABLES

int x = 4;
// the declares an integer called x and is assigned to 4

int y = 6;
// the declares an integer called y and is assigned to 6

////////////////

// MATHEMATICAL OPERATORS

int x;
// first we in initialize x

x = 4 + 3 * 2;
// since * has a higher precedence than + , x is 10

int y = x - 6;
// we initialize y and assign it to the value 'x - 6'

x = x * y;
// x is reassigned x * y

/////////////////////////////////////////////////////////

// FUNCTIONS

int myFunction(int x, int y){
    int z = 2 * x - y;
    return z * x
}

int f(int n){
    return 3 + myFunction(n, n + 1)
}

int g(){
    int a;
    a = myFunction(3, 7);
    int b = f(a * a)
    return b
}

/** say we wanted to deal with the above functions from function 'g'
** SEMANTICS
- create a frame called myFunction
- pass parameters: copy values in to frame
** - call site
-- note when to return when finished.
-- call site is simply the place where the function was called.

* * java doesn't have functions, it has methods and objects
 */

 //////////////////////////////////////////////////////////////////////

// CONDITIONALS - if else statement

int f (int x, int y){
    if (x < y){
        System.out.printIn('x < y');
// this is how to print in java - so we print 'x < y'
        return y + x;
// once this is returned, no other return statement in the function works.
    }
    else{
        System.out.printIn( 'x >= y');
        if(x > 8){
            return y + 7;
        }
    }
    return x - 2;
}

int g (){
    int a = f (3, 4);
    int b = f (a, 5);
    return b
}
///////////////////////////////////////////////////////////////////////

/**
* * java is an object oriented programming language. and object oriented programming is a paradigm of programming language that groups data and the code that manipulates it together into logical units called objects.

*/

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

        int dy = y - otherPt.getY();
// this calls the getX method on the otherPt object
        return Math.sqrt(dx * dx + dy * dy);
    }
    public static void main(String[] args){
        Point p1 = new Point(3, 4);
        Point p2 = new Point(6, 8);
        System.out.printIn(p1.distance(p2))
    }
}