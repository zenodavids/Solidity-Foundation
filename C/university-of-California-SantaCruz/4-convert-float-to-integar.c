/*Distance of a marathon in yards
ABC pg. 11 - variation
*/

#include <stdio.h>

int main(void){
 int miles = 26, yards = 385;
 // this is a declaration, miles and yards are identifiers
 double kilometers;

 kilometers = 1.609 * (miles + yards / 1760.0);
 printf("\na marathon is %lf kilometers. \n", kilometers);
 return 0
}