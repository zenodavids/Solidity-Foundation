// C was invented by Dennis richie in 1972 and asisted by ken thompson' the purpose was actually an operating system called unix.
//  use the GNU Compiler and the GNU command GCC to compile our code.

// what makesthe c programming language powerful is it is small in size.

// it is a low level language

// https://www.msys2.org/ download the compiler and follow the instructions
// https://code.visualstudio.com/docs/cpp/config-mingw  to alogn the gcc compiler to vscode

/*
- vi add3.c = this command means create a file called 'add3.c'
- printf = prints output
- scanf = takes input from the user

*/

// C is sometimes referred to as a system implementation language (SIL)

// it replaced languages like B, BCPL
// C mainly relied on algol 60


// converts distance of a marathon from miles and yards to kilometers

#include <stdio.h>
// this is called preprocesor command because it happens before the C code is compiled.
// .h means header file

int main(void){
  // 'int' stands for introduction, 'main' is the name of the c program and 'void' means empty parenthesis
  int miles = 26, yards = 385;
  double kilometers;

  kilometers = 1.609 * (miles + yards / 1760.0);
  printf('\nA marathon is %lf kilometers.\n\n', kilometers);
  return 0;
}

///////////////////////////////////////////

#include <stdio.h>
int main(void){
  // void means the argument is empty or undefined
 int fahrenheit, celsius;
  printf("Please enter fahrenheit as an integar:");
  scanf("%d", &fahrenheit);
  //  &  is necessary here in front of the variable when using  scanf()
  celsius = (fahrenheit - 32)/1.8;
  printf("\n %d fahrenheit %d celsius.\n", fahrenheit, celsius);
  return 0;
}

///////////////////////////////////////

