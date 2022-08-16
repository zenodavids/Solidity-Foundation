/*
- char is short for characters and is made up of a character of letters
- char is a datatype for strings or single alphabetical letters.
*/

////////////////////////////////////////////
// EXAMPLES OF CHAR
"n" // letters
"7" // numbers in double quotes
"\n",  // non-printing characters

/////////////////////////////////////
// ASCII values are 0 - 127: these are char datatypes and among the values are;

// uppercase (65 - 90)
'A' // is integar value 65
'Z' // is integar value 90

// lowercase (97 - 122)
'a' // is integar value 97
'z' // is integar value 122

// digits as a string in the ASCII Table (48 - 57)
'0' // is integar value 48
'9' // is integar value 57

// other characters
'[' // is integar value 91
'+' // is integar value 43
'$' // is integar value 36

// non - printing characters
'\n' // put this in printf(), it prints 10
'\a' // put this in printf(), it prints 7

// lets see how the non - printing characters work.

#include <stdio.h>
int main(void){
 char c = 'a';
 printf("c the character %c\n", c);
 // returns the value of c which is a
 printf("c in ASCII is %d\n", c);
 // returns the value of c which is a in ASCII table
  printf("Three consecutive characters are: %c%c%c \n", c, c + 1, c + 2, c + 3);
  // returns 'abcd'
 printf("The bell rings characters are: %c%c%c \n", '\a', '\a', '\a');
 // expected to make three sounds

 return 0;
}


// NOTE that you can store these ASCII values in a byte