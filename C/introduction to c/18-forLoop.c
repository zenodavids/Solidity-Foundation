// the for loop acts as the while loop but is very much compact

/* snytax;

for(expression 1; expression 2; expression 3 )
 statement

 typical use;
 -- expression 1 is the initailzer,
 -- expression 2 is the terminating condition - if its going to work, find out the number of times,
 -- expression 3 is the increment / decrement values

*/

// example;

#include <stdio.h>
int main(void)
{

    int blanks = 0, digits = 0, total_chars = 0;
    int c; // use to indicate int value of character from the ASCII TABLE

    for (; (c = getchar()) != EOF; total_chars++)
    {
        // when expresion 1 is empty, we leave a semi colon(;)
        // the getchar() with no argument obtains from standard input
        // then we test to see if we are at the EOF (end of file) which is tyoically -1
        if (c == "")
            ++blanks;
        // checks if c equals banks, increment blanks
        else
            (c >= "0" && c <= "9");
        ++digits;
    }
    printf("blanks = %d, digits = %d, total_chars = %d,", blanks, digits, total_chars);

    return 0;
}

////////////////////////////////////////
// week 3
// project print sine table

#include <stdio.h>
#include <math.h> /* has  sin(), abs(), and fabs() */
int main(void)
{
    double interval;
    // define variable

    int i;
    // define iterator

    for (i = 0; i < 30; i++)
    {
        interval = i / 10.0;
        printf("sin( %lf ) = %lf \t", interval, fabs(sin(interval)));
    }

    printf("\n+++++++\n");
    return 0;
}

// project print cos and sine table

#include <math.h>
#include <stdio.h>

int main()
{
    double interval;
    int i = 0;

    // printing the values of sine table
    printf("SINE TABLE:\n\n");
    for (i = 0; i < 90; i++)
    {
        interval = i / 10.0;
        printf("sin( %lf ) = %lf \t", interval, fabs(sin(interval)));
    }

    // printing the values of cosine table
    printf("COSINE TABLE:\n\n");
    for (i = 90; i < 180; i++)
    {
        interval = i / 10.0;
        printf("cos( %lf ) = %lf \t", interval, fabs(cos(interval)));
    }

    return 0;
}

// or

#include <stdio.h>
// to enable the print function

#include <math.h>
// to enable the maths function

int main(void)
{
    double value = 0.0;
    // define variable

    printf("  Value    Sine()     Cosine()\n");
    printf("____________________________\n");
    // loop through the values to print the results
    while (value <= 1.0)
    {
        printf("   %.1lf    %.5lf   %.5lf\n", value, sin(value), cos(value));
        value += 0.1;
    }
    return 0;
}