// POPULAR TYPES OF VARIABLES

int // stores integars (whole numbers). ie; 123
float // stores float (decimal numbers),. ie; 3.14
char // stores single characters (alphabetical letters). ie; a, b, z

// DECLARING A VARIABLE
// this is the syntax - variableType variableName = value

int myNum = 15;
// for integars
float myFloatNum = 5.99;
// for floats
char myLetters = 'D';
//  for characters

/*
NOTE:
if we do print(myNum), we will get an error.
the way it is done in c is we use something called FORMAT SPECIFIERS.

instead of print(myNum),
we use printf('%d', myNum) for integars
'' ''  ''   ('%c', myLeters) for letters
'' ''  ''   ('%f', myFloatNum) for floats
*/

// FORMAT SPECIFIERS FOR INPUT / OUTPUT

/* DATATYPE               FORMAT SPECIFIER */
int                           '%d or %i'
char                          '%c'
float                         '%f'
double                        '%lf'
short int                     '%hd'
unsigned int                  '%u'
long int                      '%li'
long long int                 '%lli'
unsigned long int             '%lu'
unsigned long long int        '%llu'
signed char                   '%c'
unsigned char                 '%c'
long double                   '%Lf'


///////////////////////////////////////////

// ADDING VARIABLES. ie;
int x = 5;
int y = 6;
int sum = x + y
printf('%d', sum);

// DECLARING MULTIPLE VARIABLES
int a = 5, b = 6, c = 50;
printf('%d', x + y + z);

////////////////////////////////////////////

// CONSTANTS
// like javascripts, using the keyword 'const' aviods overiding variable values. and its good practice to save them in uppercase. ie;

const int BIRTHYEAR = 1982


