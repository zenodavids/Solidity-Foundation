// TENARY OPERATOR

c = a > b ? a : b // snytax;
// the answer is a, else is b

/////////////////////////////////
// COMMA OPERATOR

// this is the lowest precedence
a + b, c + d // syntax
// the first expression will be solved first before the second one.

////////////////////////////
// sequence point - this is when an expression ends with the semi colon (;). this means everthing has to be concluded in that expression before moving to the next one.
a + b;

// example;
for(sum = 0, i = 1; i <= 50; i++)
 sum += ;
 // this will print 1 + 2 + 3 + ... 50

///////////////////////////////
// example with tenary operator and switch statement

#include <stdio.h>
int main(){

 int speed;
 // define the speed variable

 printf("\nEnter your speed:");
 scanf("%d", &speed);
// ask user for speed input

 speed = (speed <= 65) ? (65) :(speed <= 70) ? (70) : (90);
 // (speed <= 65) ? 65... - if inputed speed is less or equals 65, return 65
 // (speed <= 70) ? (70) : (90) - else if speed isn't 65, check if its less than or equals 70. if it is, return 70 else return 90.
////////////////////////////////////////////////////////

/* SWITCH STATEMENT
 this replaces the if elde statement when you have multiple 'else if'.
 makes the code look neat.

syntax example;
switch (i)
 case 1 : a = 1 * i; break; //this executes if i equals 1
 case 2 : a = 2 * i; break; //this executes if i equals 2
 case 3 : a = 3 * i; break; //this executes if i equals 3
 default : a = 4 * i; //this executes if none of the cases above matches i

*/

 switch (speed)
 {
 case 65 : printf("\nNo speeding ticket\n\n"); break;
// if the speed is 65, return this

 case 70 : printf("\nspeeding ticket\n\n"); break;
// if the speed is 70, return this

 case 90 : printf("\nExpensive speeding ticket\n\n"); break;
// if the speed is 90, return this

 default : printf("\nIncorrect speed\n\n");
 // return this if no case above matches
 }
 return 0;
}