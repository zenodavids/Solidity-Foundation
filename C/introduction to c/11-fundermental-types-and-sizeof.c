// FUNDERMENTAL TYPES

int //  integars (whole numbers). ie; 123, -3, 0
char //  letters and words. ie; a, b, D, \n
unsigned // this removes negative integars
long // applies to integars( range + or - 2billion and we want a longer range) and doubles
double //  factional numbers and floats, ie; 1.234, 3.2e5. 'e' here means 'exponent' and this is raised to the power of 10.
float, double, long double // three kinds of double.

//////////////////////////////////////////////////////////////

/* BYTES

- a computer memory is a finite resource and it is organized in bytes.
- a byte is conventionally 8 bits.
- all modern computer uses a base 2 designation and bits to represent whatever you need to represent.
- int is 4 bytes and between -2147483648 to +2147483647 = 2**32 - 1. hence 4 bytes can be used to store 32 binary digits. one of the digits will be used for the sign, and that leaves us with 31 binary digits

*/

/* SIZEOF

- when we write our code, we need to know what is representable and do that using the sizeof keyword.
- C runs in computers of 2bytes(small computers) to 16bytes(large computers)

syntax:
sizeof(type)
sizeof(variable)

*/

#include <stdio.h>
int main(void){
 printf("on my system;\n");
 // thee below shows the size of datatypes in bytes
 printf("int is %lu bytes.\n", sizeof(int));
 printf("long int is %lu bytes.\n", sizeof(long int));
 printf("char is %lu bytes.\n", sizeof(char));
 printf("float is %lu bytes.\n", sizeof(float));
 printf("double is %lu bytes.\n", sizeof(double));
 printf("long double is %lu bytes.\n", sizeof(long double));

 return 0;
}