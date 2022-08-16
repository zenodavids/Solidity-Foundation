// OPERATOR PREDENCE describes the other in which expressions are read.

/////////////////////////////////////

/* TYPES OF OPERATORS IN ORDER OF THEIR PRECEDENCE */

// PRIMARY EXPRESSION OPERATOR - from left to right
(indexing), (functionCalls), ->, expr++, expr--


// UNARY OPERATORS - from right to left
unary*, unary&, unary+, unary-, ~, ++expr, --expr, (typecast), sizeof // this gives the size (bytes) any expresion


// BNARY OPERATORS - left to right
*, /, %, +, -, >>, <<, <, >, <=, >=, ==, !=, &, ^, |, &&, ||


// TENARY OPERATORS - from right to left
?, :


// ASSIGNMENT OPERATORS - right to left
=, +=, -=, *=, /=, %=, >>=, <<=, &=, ^=, |=

// COMMA - left to right
,

////////////////////////////////////////

/* differnce between UNARY and BINARY OPERATORS are;
unary takes one argument, ie; -4
binary takes two arguments ie; 2 + 5
*/
