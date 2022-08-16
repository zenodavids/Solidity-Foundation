/* POINTERS

-- a pointer is a variable that stores the memory address of another variable as its value.
-- every variable and datatype values are stored with an address as pointers.

*/

int a = 3; // variable declaration

// THREE WAYS TO DECLARING POINTER VARIABLES - syntax;
int *p = &a; // pointer declaration (most used)
int *p = &a;
int *p = &a;
/*here,
-- datatype is integer(int),
-- asterisk(*),
-- pointer variable name (p),
-- (&) stores the memory address of the a variable.

all the above syntax is saying is initialize the pointer variable (p) to where a is stored. the & operator is getting the address of the a variable and stores it in p
*/

printf("%p", p) // reference
    // output the memory address of a (a random hexadecimal thats always changing)

    printf("%p", *p) // dereference
// output the value of a with the pointer
// '%p' is the format specifier for pointers

// example;
#include <stdio.h>

    int main(void)
{

  const int SIZE = 5;

  int grades[SIZE] = {78, 67, 92, 83, 88};
  double sum = 0.0;
  // declare variable
  double *ptrToSum = &sum
                     // declare pointer
                     int i;

  printf("\nmy grades are:\n");

  for (i = 0; i < SIZE; i++)
    printf("%d\t", grades[i]);

  printf("\n\n");

  for (i = 0; i < SIZE; i++)
    sum = sum + grades[i];

  printf("my average is %.2f\n\n", sum / SIZE);
  printf("\n\n");

  printf("sum is at %p, or %lu and is %lf\n", ptrToSum, ptrToSum, *ptrToSum);

  return 0;
}

///////////////////////////////////////////////////////////////
/* CALL BY REFERENCE

-- normally, passing parameters are called by value, but here we can pass in an address (a pointer).
-- we use call by ref to change values in the calling environment.

*/

// say we wanted to use this swap function below to swap a and b
swap(a, b) // where a == 2, b == 5. and we want a to be 5 and b, 2.

    // solution
    void swap(int *i, int *j)
{
  int temp = *i;
  *i = *j;
  *j = temp;
}

/* steps to call by ref
-- declare params(parameter as a pointer)
-- use dereferenced pointer (*i and *j in the above example) in the body of the function
-- when calling the function, pass in the address of the variables we want the values swapped ie; swap(&a, &b)

*/
///////////////////////////////////////////////////////
// EXAMPLE - sorting bubble sort (this is inefficient)
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
      if (data[j - 1]; > data[j])
        // if the inputs are out of order,...
        swap(&data[j - 1], &data[j]);
    // ...swap them
  }
}

int main()
{
  const int SIZE = 5;
  int grades[SIZE] = {78, 67, 92, 83, 88};

  printf(SIZE, grades, "My grades\n");
  printf("\n\n");
  bubble(grades, SIZE);
  printf(SIZE, grades, "My sorted grades\n");
  printf("\n\n");

  return 0;
}

///////////////////////////////////////////////////////

/* MERGE SORT - this is more efficient.


-- this is use to sort files, arrays etc.
-- we use divide and conquer strategy
-- the principal idea is to have two piles (pile A and B) and you want to combine them as one (pile C)
*/

// basic merge algorithm - assume pile A and B have different numbers of items;
void merge(int a[], int b[], int c[], int m, int n)
{
  // where m is the number of items of pile A, n is the number of items of pile B

  int i = 0, j = 0, k = 0;
  // three indexes to keep track of where we are.
  // i is the index of pile A, j is the index of pile B and  is the pile, k is the index of pile C.

  while (i < m && j < n)
    // while the indexes are lesser than the number of items
    if (a[i] < b[j])
      // if a is less than b,...
      c[k++] = a[i++];
    // shove a into c.
    else
      c[k++] = b[j++];
  // else shove b into c.

  // this checks for clean up, just in case an integers remain either in pile A or B
  while (i < m)
    // while the A index is less than the number of items in A,
    c[k++] = a[i++];
  // shove the rest of A into C

  while (j < n)
    // while the B index is less than the number of items in B,
    c[k++] = b[j++];
  // shove the rest of B into C
}

// code Example - assume pile A and B have same numbers of items
#include <stdio.h>
void printArray(int howMany, int data[], char *str)
{
  int i;
  printf("%s", str);
  // print the string

  for (i = 0; i < howMany; i++)
    printf("%d\t", data[i]);
}

void merge(int a[], int b[], int c[], int howMany)
{

  int i = 0, j = 0, k = 0;
  // define the index variables

  while (i < howMany && j < howMany)
    // we check which pile is larger using their indexes
    if (a[i] < b[j])
      // if a is less than b,...
      c[k++] = a[i++];
    // shove a into c.
    else
      c[k++] = b[j++];
  // else shove b into c.

  // this checks for clean up, just in case an integers remain either in pile A or B
  while (i < howMany)
    // while the A index is less than the number of items in A,
    c[k++] = a[i++];
  // shove the rest of A into C

  while (j < howMany)
    // while the B index is less than the number of items in B,
    c[k++] = b[j++];
  // shove the rest of B into C
}

int main(void)
{

  const int SIZE = 5;
  int a[SIZE] = {67, 82, 83, 88, 99}; // define array a
  int b[SIZE] = {58, 69, 72, 81, 88}; // define array b
  int c[2 * SIZE];                    // define array c

  printf(SIZE, a, "My grades\n");
  printf("\n\n");
  printf(SIZE, b, "More grades\n");
  printf("\n\n");

  merge(a, b, c, SIZE);
  printf(2 * SIZE, c, "My sorted grades\n");
  printf("\n\n");

  return 0;
}

// example 2;- size is a power of 2 (also efficient)

#include <stdio.h>
void printArray(int howMany, int data[], char *str)
{
  int i;
  printf("%s", str);
  // print the string

  for (i = 0; i < howMany; i++)
    printf("%d\t", data[i]);
}

void merge(int a[], int b[], int c[], int howMany) // a and b same size
{

  int i = 0, j = 0, k = 0;
  // define the index variables

  while (i < howMany && j < howMany)
    // we check which pile is larger using their indexes
    if (a[i] < b[j])
      // if a is less than b,...
      c[k++] = a[i++];
    // shove a into c.
    else
      c[k++] = b[j++];
  // else shove b into c.

  // this checks for clean up, just in case an integers remain either in pile A or B
  while (i < howMany)
    // while the A index is less than the number of items in A,
    c[k++] = a[i++];
  // shove the rest of A into C

  while (j < howMany)
    // while the B index is less than the number of items in B,
    c[k++] = b[j++];
  // shove the rest of B into C
}

void mergeSort(int key[], int howMany)
{ // a power of 2

  int j, k;
  for (k = 1; k < howMany; k *= 2)
  {
    for (j = 0; j < howMany - k; j += 2 * k)
      merge(key + j, key + j + k, w + j, k);
    for (j = 0; j < howMany; j++)
      key[j] = w[j];
  }
}