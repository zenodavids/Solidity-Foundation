// expressions too have order of precedence
int a = 1;
int b = 2;
int c;
c = a + b; // c is assigned the value of a and b, hence c becomes 3

/////////////////////////////////////////////////
// ASSOCIATIVITY

a + b + c
// from left to right

((a + b) + c)
// because of the (), solve a + b, then add the sum with c

a = b = c = 3
// from right to left, c = 3, then b = c, which is still 3, then a = 3, which is also 3. we can break it down more to;
(a =(b =(c =3)))

/////////////////////////////////////////////////////
// EXPRESSION EVALUATION

a = ++b; // pre-increment
// this means a = b + 1 . then if b sums to 5, so will be a.

a = b++; // post-increment
// this mean a = b, b = b + 1. ie; if b was 4; using the above expression, a will be 4 and b will become 5

#include <stdio.h>
int main(){
 int a = 5, b = 7, c, 0, d = 0 //initialize
 c = a - b;
 printf("a = %d, b = %d, c = %d, d = %d\n", a, b, c, d );
 c = b - a;
 printf("a = %d, b = %d, c = %d, d = %d\n", a, b, c, d );
 c = a / b; d = b / a;
 printf("a = %d, b = %d, c = %d, d = %d\n", a, b, c, d );
 c = a % b;  d = b % a;
 printf("a = %d, b = %d, c = %d, d = %d\n", a, b, c, d );
 c = -a - b;  d = -b - a;
 printf("a = %d, b = %d, c = %d, d = %d\n", a, b, c, d );
 a = ++b; b = a++;
 printf("a = %d, b = %d, c = %d, d = %d\n", a, b, c, d );

 return 0;
}