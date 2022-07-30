#include <stdio.h>
int main(void){

 int blanks = 0, digits = 0, letters = 0, others = 0;
 int c; // use to indicate int value of character from the ASCII TABLE

 while((c = getchar()) != EOF){
  // the getchar() with no argument obtains from standard input
  // then we test to see if we are at the EOF (end of file) which is tyoically -1
  if (c == '')
   ++blanks;
   //checks if c equals banks, increment blanks
  else if (c >= '0' && c <= '9')
   ++digits;
   // else if c equals the integars 0 and 9 in the ASCII table
  else if (c >= 'a' && c <='z' || c>= 'A' && c <= 'Z')
   ++letters;
  // else if c equals the either the lowercase or uppercase letters, increment letters
  else
   ++others
 }
 printf("blanks = %d, digits = %d, letters = %d,", blanks, digits, letters);
 printf("others = %d\n\n", others);

 return 0;

}