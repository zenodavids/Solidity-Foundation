// VARIABLES

var x = 3

/**
 * * SYNTAX
 * above;
 * we declared a variable called 'x',
 * then we initialized it to '3' using the assignment operator(=)
 * name your variable with names that matches the code
 * semantics is the meaning of something - telling the computer what to do.
 */

var y = 4
var z = x + 2 * y

//updating variables

x = z - 1
y = y * 2
/**
 * above
 * update the value of a variable that already exist
 * don't use the keyword 'var'
 */

// Variables holding images - objects and construction

var fgImage = new SimpleImage('drewRobert.png')

/**
 * * SEMANTICS
 * the 'new' keyword tells javascript to create a new object.
 * an object is a piece of data that also has methods it can operate on.
 * 'simpleImage' represent the type of new object to create.
 * the parameters specify more information about how we want the object created.
 */

///////////////////////////////////////////////////////

// METHODS

var bgImage = new SimpleImage('dinos.png')
var w = bgImage.getWidth()
var h = bgImage.getHeight()

/**
 * * SYNTAX
 * bgImage.getWidth() where;
 * bgImage is the object to invoke the method (getWidth()) on.
 * dot(.) means 'inside of'. we want to get width inside of the bgImage.
 * getWidth is the name of the method.
 * the parenthesis () after getWidth indicates that it is a method.
 */

/**
 * * SEMANTICS
 * first, execution goes into the method
 * next do whatever code is there.
 * method returns an answer back.
 * method call evaluate to that value
 * execution of the code resumes after the method call.
 */

///////////////////////////////////////////////////////////////////

// FUNCTIONS

// Defining / declaring the function
function squared(i) {
  var ans = i * i
  return ans
}
// a simple function that squares any number

// Calling the Function / function call
var y = squared()

const square = (x) => (ans = x * x) // arrow function
// replica of the above function

/**
 * * SYNTAX- for defining the first function
 * the keyword 'function' defines the function
 * name of the function (square, or squared.. name it as you like!). should be descriptive.
 * the parameters names, in parenthesis (separate multiple parameters in the parenthesis with comas(,)). here, our parameter is 'i'.
 * the curly braces{} this is the code block of the function and this states what it does.
 * return statement simply returns an expression from the function.
 *
 * unlike methods, functions cannot be invoked on an object.
 */

/**
 * * SEMANTICS
 * calling a function you defined
 *
 */

////////////////////////////////////////////////////////////////

// TYPES

/**
 * * JAVASCRIPT is called a dynamically typed language
 * because it keeps track of the data with its value and stores it in the computer's memory and when ever it needs to work with the value, it brings them out.
 *
 * * JAVA is called a statically typed language
 * because every variable and expression has exactly one type which must be known BEFORE the program can even run
 * JAVA checks codes before it is run.
 */

///////////////////////////////////////////////////////////////////

// FOR LOOP

for (let index = 0; index < array.length; index++) {
  /**code */
}

/**
 * * SYNTAX
 * the 'for' keyword indicates that is a for loop.
 * doing the repetition inside of the parenthesis
 * -- the first part in the parenthesis is the variable declaration (let index = 0;). the loop will automatically update this variable each  time it repeats, setting it's value to the next piece of data.
 * next in the parenthesis (index < array.length;) tells us what piece of data to iterate over. as long as this is still valid, the loop runs
 * the last item (index++) increment or decrement each time the loop runs.
 * this is used for repetition in code
 * the body of the loop  is a set of statement that should be repeated for each piece of data
 */

/**
 * * SEMANTICS
 */

///////////////////////////////////////////////////////////

// IF / ELSE STATEMENT

// assume x, y, z, a were declared previously
if (x < y) {
  z = 2
} else {
  a = y + 1
  y = x - 3
}

/**
 * * SYNTAX
 * starts with 'if' keyword
 * then a set of parenthesis with the conditions to make a decision (x < y)
 * next is the curly braces{} that acts as a 'then' clause with an expression in it that runs if the condition of the if statement is met.
 * the else keyword is followed by an expression in curly braces that runs only when the set of conditions in the if statement is false.
 */

if (x < y) {
  // having if statement works too.
  z = 2
}

/**
 * * SEMANTICS
 * first, check if the if statement (x < y) conditions are met, if the condition is met, it runs the code in the first curly braces and discard the else statement.
 * if the condition expression of the if statement is false, it runs the code of the else statement.
 *
 */
