// user defined types

/*
* USER DEFINED TYPES
- c is a weakly typed language
- c does not have a boolean type here , true is 1, and false is 0

*enumeration type is form of int type
* typedef is a keyword that associates user defined types with other types (read more)


///////////////////////////////////////////////////////////////////////////


* THE PREPROCESSOR
 -- '#' this is used i column 1 and announces the preprocessor command
 -- #include 'filename' - might be header file in your local directory. ie. 'myCode.h'
 -- #define 'VARIABLE NAME' = variable name must be in uppercase
 -- you can define '=='' ie;
  #define EQ ==
  if (a EQ b)
  or
  #define SQ(x)((x)*(x))
  substitute for SQ(4)
  x = SQ(y + 3) becomes x = ((y + 3) * (y + 3))



///////////////////////////////////////////////////////////////////////////////


* MACROS in C
* stdio - means standard i.o (input/output)
* #define is called an ASSERT

USEFUL MACROS FOR PREPROCESSING
* ''   ''  char*

* #define getc(filename)
* ''   ''  getchar()
* ''   ''  getc(stdin)
get character input from keyboard

////////////////////////////////
* ''   ''  putchar(c)
* ''   ''  putc((c), stdout)
place character in output

///////////////////
works with ctype.h
returns boolean value
* ''   ''  isalpha(c)
checks for alphabets
* ''   ''  isspace(c)
checks for white space
* ''   ''  isdigit(c)
checks for digits
* ''   ''  islower(c)
checks for lowercase alphabets
* ''   ''  isupper(c)
checks for uppercase alphabets

/////////////////////
* # include <assert.h>
this is used to test runtime code and prove 'correctness'

* NDEBUG
turn assert on
must use with assert

* -DNDEBUG
turn assert off

syntax
* assert(expression)
if true, keep running
if false, abort

///////////////////////////////////////////////////////////////////////

* STRUCT (STRUCTURES)

* typedef struct
typedef simplifies declarations

* syntax declaration example
typedef struct{
  float re;
  float im;
} complex

* syntax call example
complex a, b, c[10]
/////////////////////

* access members of a struct in 2 ways;
.(dot) operator
-> pointers

* ==>example
struct card{
  int pips;
  char suit;
}c1, c2, c3;

* ==> usage with .(dot) operator
variableName.memberName
c1.pips = 3
c1.suit = 'h'

* ==>usage with pointers

struct card * ptr-to-card;
- means struct card equals ptr-to-card;
ptr-to-card = &c1;

variableName -> memberName
ptr-to-card -> pips = 3;
ptr-to-card -> suit = 'h';

an empty [] is also a pointer


//////////////////////////////////////////////////////////////////////////
* The ADT (Abstract Data Type) stack
this can also be called an array

*LIFO - last in, first out

* operators
push, pop, top, empty, full, reset
*
/////////////////////////
* ADT List
its self referential and it has a head and a tail. the tail is usually 0 or null

* ADT List syntax
struct list {
  int data;
  struct list *next;
};

typedef struct list list;

list *head;
list *tail = 0;

* creating the first element will use malloc(size) in stdlib.h
head = malloc(sizeof(list));

//////////////////////////////////////////////////////////////


* STORING DATA WITH THE BINARY TREE
binary tree is made up of root (starting node), branches(two parent nodes),and leaves(children nodes)

a complete tree is when both parent nodes have the same number of children

//////////////////////////////////////////////////////////////

* ADVANCE IO (INPUT, OUTPUT)

*printf
prints out results. uses -> stdout

*scanf
asks for input. uses -> stdin

*code.exe > file
printf - print is redirected to file
*code.exe < file
scanf - input comes from file
redirection

////////////////////////////////////////////////////////////////

* BASICS OF FILE IO

* fscanf(file *ptr, ...)
get input from a file - assumes stdin

* ptr = fopen("file", "r");
read a file
* ptr = fopen("file", "r+");
read and write a file
* ptr = fopen("file", "w+");
write and read a file

* fclose(file)
*
*
*
*
*
*/