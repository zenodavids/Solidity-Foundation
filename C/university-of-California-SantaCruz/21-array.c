/* ARRAYS*/

int data[100];
/*syntax - where 'int' is the type, 'data' is the array name and '[100]' is the size.
*/


// array  samples;

int ssn = 55511122;
// this is not an array this i a variable being declared
int data[5];
// here we declare an array of 5 integers
int digits[5] = {1,2,3,4,5,6};
// we use this to get the fifth index of the array which is the sixth item
int data[5] = {0};
// if we want all the element to be zero
int data[] = {1,2,3};
// this is the official array syntax for c.

// example;
#include<stdio.h>

int main(void){
 const int SIZE = 5;

 int grades[SIZE] = {78, 67, 92,83, 88};
 double sum =0.0;
 int i;

 printf("\nmy grades are:\n");

 for (i = 0; i < SIZE; i++)
   printf("%d\t", grades[i]);

 printf("\n\n");

 for (i = 0; i < SIZE; i++)
  sum = sum + grades[i];

 printf("my average is %.2f\n\n", sum/SIZE);

 return 0;

}

//////////////////////////////////////
/* ARRAYS AND STRINGS
-- string is not a datatype, it is a series of characters - a string is an array of char
*/

char str[] = "a, '', b,'', c, '\0'"; // this has 6 elements
// single quotes space is also an item in array and all char arrays ends with '\0' to tell c that it is the end of the file. using this;
str[0] // is indexed to 'a'
str[4] // is indexed to 'c'
str[5] // is indexed to '\0'

////////////////////////////////////////////////////////////

// formulae for calculating address in c
base address + offset (index) * the number of items in the array

/////////////////////////////////////////////////

/* ARRAYS AS PARAMETER

*/

#include <stdio.h>

// get the averages of grades
double averageGrades(int digits, int grades[]){
  int i;
  double sum = 0.0;
  // define variables

  for ( i = 0; i < digits; i++)
  // i = 0, i starts from 0 because arrays are 0 indexed.
    sum +=grades[i];

  return(sum/digits); // returns a double
}

// print the grades
void printGrades(int digits, int grades[]){
  int i;

  printf("I have %d grades\n", digits);
  for ( i = 0; i < digits; i++)
    printf("%d\t", grades[i]);
}

int main(void){
  const int SIZE = 5;
  int grades[SIZE] = {78, 67, 92,83, 88};

  printGrades(SIZE, grades);
  printf("\n\n");
  printf("my average is %.2f\n\n", averageGrades(SIZE, grades));

  return 0;
}
