// FLOAT TYPES

float
// this is the smallest. ranges from 10**-38 to 10**38 and can be expressed with six significant figures, as in 0.123456e12

double
// this is the next in size after float.  ranges from 10**-308 to 10**308 and can be expressed with 15 significant figures

long double
// this is the largest float. also range from 10**-308 to 10**308 but thiscan be expressed with 31 significant figures

// LITERALS FOR FLOAT - 1.0, 1., 0.1e1 are all the same.

/* input / output
- the conversion character prints three types;*/
" %e or %E prints as" 1.23456e+00
" %f prints as" 1.23456
" %g or %G" // this is the most preffered for all floats because it prints depending on the result.

///////////////////////////////////////////////////////

// INTEGAR

//  int is stored in 32 bits (4 bytes) with a range of -2147483648 to 2147483647.

// INTEGAR TYPES

short
// this means use less data - uses 2 bytes

int
// the isnthe normal integar datatype and it uses 4 bytes

long
// means use more data - uses 8 bytes

unsigned
// this returns only positive integars and ranges from  0 - 4billion

// literals

short = 35
int = 35
long = 35l
unsigned  = 35u
unsigned long = 35ul


// example
#include <stdio.h>
int main(void){
 short  short_a = 5;
 // can still use short int
 int normal_a = 67;
 unsigned unsigned_a = 67u;
 long long_a = 67l;
 printf("short_a = %hd, divide by int 2 is %d\n", short_a, short_a / 2);
 // divide with an integar
 printf("short_a = %hd, divide by float 2 is %lf\n", short_a, short_a / 2.0);
 // divide with a float
 printf("67 as a char is %c\n\n\n", normal_a);
 // use the char format to see the string on the ASCII table
 printf("sizes in bytes of short, int, unsigned and long on my machine:");
 printf("%lu, %lu, %lu, %lu\n", sizeof(short_a), sizeof(normal_a), sizeof(unsigned_a), sizeof(long_a) );
 // checks the bytes of int, short, long and unsigned

 return 0;
}
