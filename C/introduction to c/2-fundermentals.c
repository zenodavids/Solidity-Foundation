///////////////////////////////////////////
/*
 lets compute the area of a circle
 program with both input and output
 */

#include <stdio.h>
// this allows us to make use of the scanf() and printf()
#define PI 3.14159
// this preprocessor directive is also called the macros directive. thi is used to declare an expression with a name that can be used througoutthe c program
int main(){
  // tihs introduces the progam with the name 'main', its where the program begins
 double area = 0.0, radius = 0.0;
//  this is a declaration statement where area and radius is defined. the are also called 'identifiers'. identifiers can be ordinary words
 printf('Enter radius:');
//  prints out this statement
 scanf('%lf', &radius);
 //asks the user to input something
 area = PI * radius * radius;
 printf('radius of %lf meters; area of %lf sq. meters\n' radius, area);
//  prints our answer
 return 0;
  // here, 0 means the code is completed correctly- this is optional
}



// ESCAPE SEQUENCE

/* if you have two print statements in a c program, they will seat on the same line. to aviod this we use one of the escape sequence '\n' and this will create a new line as seen in the above example.
 Other escape sequence includes;*/

'\n' // creates a new line
'\\' // inserts a blackslash
'\t' // creates a horizontal tab
'\"' // inserts doublw quotes
'\a' // this triggers an alarm when it is in a system.


///////////////////////////////////////////
// define keyword

#include<stdio.h>

#define PI 3.14159
// the define keyword is a preproccessor that iss used to declare a constant variable
int main(){
 double area = 0.0 , radius = 0.0;
 printf("Enter radius:");
 scanf("%lf", &radius);
 area = PI * radius * radius;
 printf("raduis od %lf meters; area is %lf sq.meters\n", radius, area);

 return 0;
}
