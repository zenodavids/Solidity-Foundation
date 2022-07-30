// a simple declaration is a type, followed by an identifier. ie;
int a;

// a complex declaration is a type identifier followed by an equal (=) sign and initializer. this is not an assignment, this is an initialization. ie;
int a = 2;

// a more complicated declaration is seperated by commas ;
int a - 3, b = 5;


#include <stdio.h>
int main(void){
 int a = 5, b = 7, c = 6; //declare and initialize
 double average = 0.0;  //since the type is a double, it MUST be a float

 printf("a = %d, b = %d, c = %d\n", a, b, c);
 average = (a + b + c) / 3.0 // use float since we used double
 printf("average = %lf\n", average);

 return 0;
}
