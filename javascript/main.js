////// UNIVERSITY OF CALIFORNIA - DAVIS /////////////////////

////////////////////////// Arrays ////////////////////////////
/////// two ways of creating arrays
var colors = ['red', 'blue', 'green', 'black']
console.log(colors)
colors = new Array('blue', 'green', 'red')
console.log(colors)

/////////////////////// booleans //////////////////////////////////////
var red = true
// we can use booleaans for if statements
if (red) {
  console.log('this is red')
} else {
  console.log('this is not red')
}

// javascript treats undefined , null , NAN , zero variables as FALSE
var green //green here is undefined because it is not assign to any variable
if (green) {
  console.log('this is green')
} else {
  console.log('this is not green')
}

// or still run using the Ternary operator
// condition ? expressionIfTrue : expressionIfFalse

var blue = false ? console.log('this is blue') : console.log('this is not blue')

// numbers, negative (-1) or positive (3), are true... only ZERO(0) is false.

/////////////////////// else if statements /////////////////////////////
// using the colors array in line 3,
var selectedColor = colors[3]

if (selectedColor === 'red') {
  console.log('the color is red')
} else if (selectedColor === 'blue') {
  console.log('the color is blue')
} else if (selectedColor === 'green') {
  console.log('the color is green')
} else {
  console.log('the color is not red')
}

// you can have as many if else statement as you can

////////////////////// switch statements ///////////////////////////////////////
// this is a great alternative for the if else statments
// using the colors array in line 3,
var mainColor = colors[2]
switch (mainColor) {
  case 'red':
    console.log('the color is red')
    break
  case 'blue':
    console.log('the color is blue')
    break
  case 'black':
    console.log('the color is black')
    break
  case 'green':
    console.log('the color is green')
    break
  // try as much as you can to aviod putting any code in the default because it activates when none of the switch matches
  default:
    break
}

////////////////////// using && (AND) operator ////////////////////////////////////
// this checks if all the statements are true
var goodMood = true
var gotSleep = true

if (goodMood && gotSleep) {
  // it both are of the same values, it will pass true
  console.log('it is a goodday')
} else {
  console.log('go back to sleep')
}

////////////////////// using || (or) operator ////////////////////////////////////
// tthis checks if any of the statements are true
var gotBreakfast = true
var gotLunch = true
var gotLDinner = false

if (gotBreakfast || gotLunch || gotLDinner) {
  // it both are of the same values, it will pass true
  console.log("i'm not starving")
} else {
  console.log('STARVING')
}

////////////////////// For loop ////////////////////////////////////
// for loops are used to repeat a step of steps, a step of times
for (var i = 0; i < 10; i++) {
  console.log(i)
}
/**
 * var i = 0 is initialize counter.
 * i < 10 is the condition on which the loop is run. here, i equals 0 and as long as 0 is less than 10 the loop runs
 * i++ is the incrementor. we can also use i--
 * when looping through items, i is always the index
 */

//////// working with Arrays
// since arrays are 0 indexed, looping through the arrays will start from zero
// using the colors array in line 3,
for (let i = 0; i < 4; i++) {
  console.log(colors[i])
}
// this is most adviceable
for (let i = 0; i < colors.length; i++) {
  console.log(colors[i])
}
/**
 * let i =0 starts from the first item in the array
 * as long as i (which is 0) is less than the lenght of the array,
 * let it loop through and list out all the items in the array.
 */

////////////////////// the For.. Of Loop ////////////////////////////////////
// this is a great tool to use with arrays and its works the for loop

// using the colors array in line 3,
for (let eachColor of colors) {
  console.log(eachColor)
}
// eachColor can be any word

////////////////////// while loops ////////////////////////////////////
// using the colors array in line 3,
let incrementor = 0
let text = ''
while (incrementor < 10) {
  text += `the incrementor has gone up to ${incrementor} \n`
  incrementor++
}
console.log(text)

////////////////////// sequence (javascript methods) //////////////////////////////
var myString = 'I am really hungry for some'
console.log(myString.toUpperCase())

var searchWord = myString.search('really')
console.log(searchWord)

console.log(myString.substring(searchWord, 6))

console.log(myString.search('really'))

////////////////////// Loop Assignment
/*
make an array called foods and put four foods in the array.
 then use the string literal syntax to print out a sentence that prints to the console
 the variable myString that's above, folowed by a space and then the element of the food array
*/

let foods = ['rice', 'beans', 'yam', 'steak']

console.log(`${myString} ${foods[0]}`)

// loops through the foods array
for (let i = 0; i < foods.length; i++) {
  console.log(`${myString} ${foods[i]}`)
}
// using the for .. in loop;
for (let food of foods) {
  console.log(`${myString} ${food}`)
}

/*
modify the script so that this time,
if the index of food is an even Number,
convert it to uppercase. otherwise dont convert it.
*/

for (let i = 0; i < foods.length; i++) {
  var remainder = i % 2
  console.log(remainder)

  if (remainder === 0) {
    let foodUpper = foods[i].toUpperCase()
    console.log(`${myString} ${foodUpper}`)
  } else {
    console.log(`${myString} ${foods[i]}`)
  }
}

/////lets refacture the code above to make it simplier

for (let i = 0; i < foods.length; i++) {
  // checks if the incrementor is even
  if (i % 2 === 0) {
    // if it's even, make the array element uppercase
    console.log(`${myString} ${foods[i].toUpperCase()}`)
  } else {
    // if it's odd, keep it lowercase
    console.log(`${myString} ${foods[i]}`)
  }
}

////////////////////// functions ///////////////////////////////////
// this function converts all lowercase to uppercase
function upperMessage(message) {
  let upper = message.toUpperCase()
  return upper
}

console.log(upperMessage('hello everyone'))

// converting to arrow function
const upperMsg = (message) => message.toUpperCase()

console.log(upperMsg('hello everyone'))

// this function sums up two numbers
function addNums(num1, num2) {
  let sums = num1 + num2
  return sums
}

console.log(addNums(4, 5))

// converting to arrow function
const addNumbers = (num1, num2) => num1 + num2

console.log(addNumbers(5, 8))

// the below function generates random numbers between two numbers \\
const randomInt = (min, max) => {
  // step 1: get the number of values
  numOfValues = max - min + 1
  console.log(numOfValues)
  // step 2: generate anumber between 0 and 1, then multiply the number with the number of values
  randomVal = Math.random() * numOfValues
  console.log(randomVal)
  //  step 3: random down the random number so it becomesa wholenumber with Math.floor()
  roundedRandomVal = Math.floor(randomVal)
  console.log(Math.floor(randomVal))
  // step 4: using the random number we generated, add the min num from our function's parameter. this will give usour random num from our min to max.
  finalNum = min + roundedRandomVal
  return finalNum
}

//step 5: putting the function to use;
// step 5a: say we have an array of foods and we wanted to randomly select a food from the array, we use the index number of the items in the array. ie; using the food array in line 161, there are four items , indexed 0 - 3 so we input the min as 0 and the max as 3;

console.log(foods[randomInt(0, 3)])

// lets refacture the randomInt function;
const randInt = (min, max) => Math.floor((max - min + 1) * Math.random()) + min

console.log(foods[randInt(0, 3)])

////////////////////// challenges ///////////////////////////////////
////////////////////// challenges ///////////////////////////////////
////////////////////// challenges ///////////////////////////////////
////////////////////// challenges ///////////////////////////////////
////////////////////// challenges ///////////////////////////////////
////////////////////// challenges ///////////////////////////////////
////////////////////// challenges ///////////////////////////////////
////////////////////// challenges ///////////////////////////////////
//////////////\\\\\\\\\\\\\\ javascript methods ///////////////////////////

//////// Arrays

//////// integars and floats
randMath = Math.random()
// this by default generates a number beteween 0 and almost 1
// this is not truly random, its using an algorithm.
console.log(randMath)
deci = 8.74857
randMath = Math.round()
// this  rounds to the nearest integar and this is more acurate than Math.floor()
console.log(Math.round(deci))

Math.floor()
// this gives the numbers with the numbers after the decimal point.
// rounds a number DOWN to the nearest integer.
console.log(Math.floor(deci))

Math.ceil()
// rounds a number UP to the nearest integer.
console.log(Math.ceil(deci))

//// by default, javascript sees every data inputed as a string. so the only way to pass in a number is by using the
parseInt()
// this convverts numbers that are strings to only integars,
console.log(parseInt(deci))
parseFloat()
//   this convverts numbers that are strings to integars and floats (decimal numbers)
console.log(parseFloat(deci))
////
deci.toFixed(3)
// toFixed(number of numbers after the decimal dot) this gets a specific number of numbers after the decimal dot.
console.log(deci.toFixed(3))

//////// strings
