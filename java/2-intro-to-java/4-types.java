/**/ TYPES

// A type specifies how data should be represented, interpreted and operated on as well as what operation you can do with it. examples are;
FileResource
//for files

int
//fr numbers

Point
// for points

/////////////////////////////////////////////////////////

// there two major types in JAVA - primitive and objects

/**
 * * Primitives
 * characteristics;
 * - value is directly in box
 * - can't invoke method call on them
 * - can't be null (but can use wrapper class)
 *
 ** the eight primitive types are;*/
int, double, char, boolean, float, long, byte, short


/**
 * * Objects
 * characteristics;
 * - reference (arrow) to object
 * - can invoke methods, access fields with dot
 * - can be null
 * - == checks if arrows point at some object
 *
 * * after the eight primitive type, every other type is an object and examples are; */
String
Shape
Point
//any point you name


//////////////////////////////////////////////////////////

/**/ CONVERSION BETWEEN TYPES
// this is achieved in three ways;

int x = 3;
double d = x;
//implicit conversion

double d = 3.14;
int x = (int)d;
// explicit cast - here we put '(int)' in parenthesis to enforce the conversion.

String s = '3';
int x = Integer.parseInt(s)
// using method calls
