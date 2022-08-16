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


/**
* * java is an object oriented programming language. and object oriented programming is a paradigm of programming language that groups data and the code that manipulates it together into logical units called objects.

*/


