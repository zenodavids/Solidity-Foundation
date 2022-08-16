#include <stdio.h>

int main()
{

 int a, b;
 // here, a is the index, b is the number of elements in the array

 double weight[900], sum = 0.0;
 // define variables

 printf("Enter number of items that will be in the array: ");
 scanf("%d", &a);
 // ask user for input

 for (b = 0; b < a; b++)
 {
  // if the number of items is lesser than the index, add an item in the array

  printf("Enter weight %d: ", b + 1);
  scanf("%lf", &weight[b]);
  // ask user for input
 }

 printf("Average weight for the set of the elephant seals. = %.4f units", (sum + weight[b]) / a);
 // print out the average

 return 0;
}

// or

#include <stdio.h>

int main()
{
 int number_of_elephant_seals, i;
 // define integer variables

 double weight[1000], sum = 0.0, average;
 // define double variables

 printf("Enter number of elephant seals(from 0 to 1000): ");
 scanf("%d", &number_of_elephant_seals);
 // ask user for number of elephant seals

 while (number_of_elephant_seals < 0 || number_of_elephant_seals > 1000)
 {
  printf("The number you entered is either lesser than 0, 0r greater than 1000. try again ");
  scanf("%d", &number_of_elephant_seals);
  // if the user enters wrong number (numbers lesser than 0 or greater than 1000.)
 }

 printf("Enter the weights into the array\n");

 for (i = 0; i < number_of_elephant_seals; ++i)
 { // create an array of elephant seals weights

  printf("Enter new weight %d: ", i + 1);
  scanf("%lf", &weight[i]);
  // ask user to enter weight of elephant seals

  sum += weight[i];
  // adds the inputs the user gave us into the array
 }

 average = sum / number_of_elephant_seals;
 // gets the average of elephant seals weights

 printf("Average weight equals: %.4f units\n", average);

 return 0;
}
//////////////////////////////////////////

