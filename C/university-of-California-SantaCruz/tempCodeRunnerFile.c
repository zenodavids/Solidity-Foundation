#include <stdio.h>

void swap(int *a, int *b)
{
  int temp = *a;
  *a = *b;
  *b = temp;
  // swap occurs between a and b
}

void printArray(int howMany, int data[], char *str)
{
  int i;
  printf("%s", str);
  // print the string

  for (i = 0; i < howMany; i++)
    printf("%d\t", data[i]);
}

// this will place the largest elements to the extreme right in the array
void bubble(int data[], int howMany)
{
  int i, j;
  // define two indexes i and j
  int goOn;
  // define variable for user to input

  for (i = 0; i < howMany; i++)
  {
    printArray(howMany, data, "\ninside bubble\n");

    printf("i = %d, input any int to continue:", i);
    scanf("%d", &goOn);
    // ask the user for input else the loop wont be complete

    for (j = howMany - 1; j > i; j--)
      // j starts as 5
      if (data[j - 1] > data[j])
        // if the inputs are out of order,...
        swap(&data[j - 1], &data[j]);
    // ...swap them
  }
}

int main()
{
  int size = 5;
  int grades[size] = {78, 67, 92, 83, 88};

  printf(size, grades, "My grades\n");
  printf("\n\n");
  bubble(grades, size);
  printf(size, grades, "My sorted grades\n");
  printf("\n\n");

  return 0;
}
