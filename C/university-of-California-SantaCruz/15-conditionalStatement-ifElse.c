#include <stdio.h>
int main(){

 int speed;
 // define variable

 printf("\nEnter your speed as an integar:");
 scanf("%d", &speed);
 // ask user for speed

 if (speed < 65)
  printf("\nNo speeding ticket\n\n");
 // if speed < 65, print this👆🏾

 else
   printf("\nSpeeding ticket\n\n");
  // else print this 👆🏾

 return 0;
}

// in conditionals, 0 (zero) means false and non-zero means true

///////////////////////////////

// RELATIONAL OPERATORS

< // less than
> // greater than
<= // less than or equals to
>= // greater than or equals to

/////////////////////////

// PRECEDENCE

(speed < 65 + i)
// solve 65 + i first then check if speed is less than the sum.

