/* FUNCTIONS

- importance of functions;
-- reusable codes
-- cruial if they exist in libraries
-- breaks down a big piece of code to smaller pieces

- how to use a function;
-- function should be able to do one thing well - one task   per function
-- functions should stay in noe page of code
-- test (pre, post) - the right input will give the right output.

 - syntax;
type function-name (datatype parameter(s)){
 declarations and statements
}

*/

// typical functions;
int main(void),
int printf('with many arguments') // etc

/////////////////////////////////
// syntax example;

// defining a function
void writeAddress(void){
 //due to this void keyword, this function returns nothing
 printf("claus\n");
 printf("north Pole\n");
};

// invoke / call a function
writeAddress(); // this can be called inside an int main()

//////////////////////////////////////////////
// ACTUAL EXAMPLE;

#include <stdio.h>

// define the function / declare a function
void wrtVery(int count){
 /*
 -- the 'int count' can be said to be this function's signature - thats the return type
 -- this function uses an input from the user to return how many times they love someone
*/
  while (count > 0)
 // al long as it is greater than 0, we run the while loop.
{
 printf("\n very" );
 count--;
 // this will run until is no longer less than 10
};
printf("much.\n\n");
};


int main(void){

 int repeat = 0;
 // initialize from zero

 printf("how strong is your love 1 - 10? :");
 scanf("%d", &repeat);
 // ask user for input

 printf("i love you very");

 wrtVery(repeat);
 // here, we call the function and the variable'repeat' get passed as 'count'.

 return 0;
}
///////////////////////////////////////////////////

// RETURN STATEMENT

// there are three ways to use the return statement in a function
return;
return 0;
return (a + b);

// simple use in a function

double cube(double x){
// this function returns a double and computes a double
//function declaration

 return (x * x * x);

}
a = cube(3.5); // prints the answer of 3.5 * 3.5 * 3.5
// invoking / calling the function

//////////////////////////////////////////////////////////////
/* FUNCTION DECLARATION AND PROTOTYPE

 so far, we've been defining / declaring functions. what if main() doesn't know about the function because it was declared elsewhere or later

 -- prototype is calling a function before defining it

*/

 //syntax ie;

 double square(double);
 // define the function prototype.
 // this is also its 'special signature'.

 int main(){
  a = square(3.5);
  //calling the function
 }

 double square(double x){return (x * x);}
 //function declaraton

// example;

#include <stdio.h>

double squared(double);
double cubed(double);
// these functions return a double and computes a double
// function prototype and no definition yet.


int main(main)
{
 int howMany = 0, i ,j;
// define variables

 printf("I want square and cube for 1 to x, where x is:");
scanf("%d", &howMany);
 // ask the user for input.

 printf("\n square and cubes by interval of .1\n");

// nested for loop
 for(i = 1; i <= howMany; i++) //outer loop
 // starting i from 1, if i is less than or equals the user's input, increment i
  for(j = 0; j < 10; j++) // inner loop
  //starting j from 0, if 0 is less than 10, increment j

   printf("\n%lf\t%lf\t%lf",
   i + j/10.0, squared(i + j/10.0), cubed(i + j/10.0));

 printf("\n\n");

 return 0;
}

double squared( double x)
{ return ( x * x);}
// actual definition of the squared function

double cubed( double x)
{ return ( x * x * x);}
// actual definition of the cubed function

/////////////////////////////////////////////////////////
// FUNCTION INVOCATION
int computeSum(int n){
 int sum = 0;
 for(; n > 0; n--)
  sum += n;
 // if n was 5 inside the function parenthesis, this counts down to 0 adding numbers. ie. 5+4+3+2+1+0

 return sum;

}

/* when the above function is invoked;

1 -- each expression in the argument list is evaluated. ie if m = 5
2 -- conversion is posible if the parameter type doesnt match the number. ie; since the parameter type is int(integar), if we pass in a float, it converts the return value to an integar.
3 -- call by value - using the above function, the value for n never changes. even if it is reduced to 0, the local variale representing n never changes.
4 -- the function body is then executed.
5 -- the return statement, when encountered, exits to where the function body was called.
6 -- the datatype that is used in the function parameter is what will be used in the environment where the function was called.
7 -- if there was no return statement,or if 'return;' was the last statement in the code block, the code will still run when called.


 when a function is invoked;
-- how  parameters behave

*/

//////////////////////////////////////////////////////////

// FUNCTION DEFINITION AND SCOPE RULES

// scope rules - nested and parallel
{
 int i = 5
 {
  int i = 7
 }
}
/* NESTED SCOPE
this involves declaration and declarations starts and ends in a code block.
for example, using the above function, the life span of 7 starts and ends in its own code block(the inner code block).

5 is paused in the outer code block till the inner code block is done executing.
*/

/* PARALLEL SCOPE
codeblock A initiates and once it enters codeblock B, values from A dies inside codeblock B and gives rise to new values.
*/

{
 int n = 4
}
// codeBlock A👆🏾

 {
  int n = 6
 }
 // codeBlock B👆🏾


 // PRACTICAL EXAMPLE

 #include<stdio.h>

 extern int reps = 0;
 // using the 'extern' keyword, reps becomes a global scope and it specifies that the template has already been called elsewhere..

 void f(void){
  static int called = 0;
  // static means will can use 'called ' throughout the program.
  printf("f called %d\n", called);
  called++;
  reps = reps + called;
 }


int main(void){
 auto int i = 1;
//  auto here means that i is automatic
// i is initialized to 1

 const int Limit = 10;
 // const means the value of Limit will stay 10
 for(i = 1; i < Limit; i++){
  printf("i local = %d, reps global =%d\n", i, reps);
  f();

 }
 return 0;
}

//////////////////////////////////////////////////////////////
/*  RECURSION

-- doing things repeatedly
-- this can be used to replace loop iteration.
*/

//instead of this for loop,
#include <stdio.h>
long int factorial(int n){
  long f = 1;
  int i;

  for(i = 1; i <= n; i++)
   f = f * i;
  return f;
}

// we can use this recursion instead;
long int recursiveFactorial(int n){
  if (n == 1)
    return 1;
// this is a base case

  else
    return (recursiveFactorial(n - 1) * n);
// if the base case doesn't exist, we count backwards.
}

int main(void){
  int howMany = 0, i;
  // define variables

  printf("I want a table of factorials up to n:\n");
  scanf("%d", &howMany);
  // ask user for input

  printf("\nFactorials\n");

  for (i = 1; i <= howMany; i++){
    printf("\n\t%d\t %ld\n", factorial(i));
  }

  // run the for loop

  printf(("\n\n"));

  for (i = 1; i <= howMany; i++){
    printf("\n\t%d\t %ld\n", recursiveFactorial(i));
  }

  // run the recursive

  printf(("\n\n"));

  return 0;
}

//EXAMPLE 2;
// Fibonacci formula - f(n)=f(n-1)+f(n-2);f(0)=0, f(1)=1

#include <stdio.h>

// ITERATIVE FIBONACCI
long fibonacci(int n){
  long f2 = 0, f1 = 1, oldF;
  int i;

  for (i = 0; i < n; i++){
    oldF = f2;
    f2= f2 + f1;
    f1 = oldF;
  };
  return f2;
}

// RECURSIVE FIBONACCI
long recursiveFibonacci(int n){
  if(n <= 1)
    return n;
  else
    return(recursiveFibonacci(n - 1) + recursiveFibonacci(n - 2));
}

int main(void){

  int digits = 0, i;

  printf("i want table of fibonacci up to n:");
  scanf("%d", &digits);

  printf("\nfibonacci\n");

  for (i = 0; i < digits; i++)
    printf("\n\t%d\t %ld\t %ld\n", i, fibonacci(i), recursiveFibonacci(i));

  return 0;
}



