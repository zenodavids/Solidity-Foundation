#include <stdio.h>

int main()
{

 int a, b;
 // here, a is the index, b is the number of elements in the array

 double weight[900], sum = 0.0;
 // define variables

 printf("Enter numbers between 0 - 900:");
     scanf("%d", &a);
 // ask user for input

 printf("Enter the weights into the array\n");

 for (b = 0; b < a; i++)
 {
  // if the number of items is lesser than the index, add an item in the array

  printf("Enter weight %d: ", b + 1);
  scanf("%lf", &weight[b]);
  // ask user for input
 }

 printf("Average weight for the set of the elephant seals. = %.2f units", (sum + weight[b]) / a);
 // print out the average

 return 0;
}
