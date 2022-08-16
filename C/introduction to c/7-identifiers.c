int main() // 'int' is a keyword, 'main' is an identifier - it is the name of the function

/*RULES FOR CHOOSING IDENTIFIERS
- the syntax should be;
 identifier = letter / underscore(_)
 identifier = letter / underscore(_) / digits
- identifiers can be long
- treat identifiers like variables
 - they should be readable and match the documentation of your code

*/

//  using the below code expression, lets note the identifiers;

#include<stdio.h>

#define PI 3.14159
// PI is anidentifier
int main(){
 double area = 0.0 , radius = 0.0;
 // area and radius are identifiers
 printf("Enter radius:");
 // printf is a standard idenifier from the I/O library
 scanf("%lf", &radius);
 // scanf is a standard idenifier from the I/O library
 area = PI * radius * radius;
 printf("raduis od %lf meters; area is %lf sq.meters\n", radius, area);

 return 0;
}