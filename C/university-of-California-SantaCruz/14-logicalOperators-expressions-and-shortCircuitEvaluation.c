// IF ELSE STATEMENT

#include <stdio.h>
int main(){

 int outside, weather;
// define variables

 printf("\nEnter if outside. 1 true or 0 false :")
 scanf("%d", &outside);
 // ask the user whether outside or not

 printf("\nEnter if rain. 1 true or 0 false :")
 scanf("%d", &weather);
// ask the user whether it is raining or not

 if(outside && weather)
 // if the user is outside and it is raining
  printf("\nPlease use an umbrella.\n");
  // print this
 else
 // else...
  printf("\nDress normally\n")
  // print this
 return 0;
}
// if outside is false (meaning if the user is indoors), it will use the else statement. this is called a SHORT CIRCUIT EVALATION (where the first part of the statement already solves the issue).

/////////////////////////////////////////

// THE && TRUTH TABLE
// note that the && precdence in the mathematical operation is very low
a     &&    b            // result
true        true         true
true        false        false
false       true         false
false       false        false