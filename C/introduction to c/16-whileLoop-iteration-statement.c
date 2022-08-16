/* WHILE STATEMENT

syntax;
expression 1;
while (expression 2)
{
 statement
 expression 3
}

typical use;
-- expression 1 gets executed as a statement
-- epression 2 is the test code
-- statement getsexceuted while condition meets code
-- expresion 3 is the increment / decrement




semantics =>
- if the condition is 0 (false), skip and move to the next statement
- if the codition is not zero(then it's true), execute the code in the while code block.
- then we repeat until it becomes false then we move to the nest statement

*/

#include <stdio.h>

int main(){
int i;

 printf("give me a number:");
 scanf("%d", &i);

 while (i < 10)
{
 printf("%d\n", i );
 i++;
 // this will run until is no longer less than 10
}
 return 0;
}
///////////////////////////////////////////////////////

//more examples - the below code, depending on the score, tells us how much we love our spouse.

#include <stdio.h>

int main(){

 int repeat = 0;
 // initialize from zero

 printf("how strong is your love 1 - 10? :");
 scanf("%d", &repeat);
 // ask user for input

 printf("i love you very");

 while (repeat > 0)
 // al long as it is greater than 0, we run the while loop.
{
 printF("\n very" );
 repeat--;
 // this will run until is no longer less than 10
};
printf("much.\n\n")
 return 0;
}



