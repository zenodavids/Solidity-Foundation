// ARRAY SYNTAX
int[] a = new int[256];

/*
 * first 'int' is the type
 * [] indicate its an array
 * 'a' is the variable name assigned to the array
 * 'new' keyword creates a new array
 * second 'int' is type of items to store in the array
 * [256] is the number of items to store in the array, - THIS MUST BE SPECIFIED
 */

//default value for integers in an array is 0

int[] x; // no storage, just type. can be used as a parameter in a method
int[] x = new int[12]; // empty array initialized to 0 but can hold up to 12 values
String[] s = new String[12] //  empty array initialized to null but can hold up to 12 values
s[5] = 'Zeus'; // assign 'Zeus' to index 5
x[12] = x[12] + 1; // add to the number of items in an array




/////////////////////////////////////////////////////////////////////////////////
// using arrays in loop

// build methods to solve problems
//typically, use for-loop with array indexes
for(int i = 0; i < a.length; i ++){
 int val = a[i];
 // a[k] access the index of values in an array
}

a.length //instead of a.length()
//.length is not a method for arrays

/////////
