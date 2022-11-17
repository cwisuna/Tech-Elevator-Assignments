/***************************************************************** */
/***********************Spread Operator*****************************/
/***************************************************************** */

// clone//copy an array
const array1 = [0, 1, 2];
const array2 = [...array1];
console.table(array2);


// merge two arrays
const array3 = [3, 4, 5];
const array4 = [...array1, ...array3];
console.table(array4);

// exchange assignment
let a = 0;
let b = 1;
[a, b] = [b, a];

console.log(`a: ${a} b: ${b}`);

// truncate (shrink) an array
array4.length = 2;

console.table(array4);

/***************************************************************** */
/***************************************************************** */
/***************  Array Functions  ******************************* */
/***************************************************************** */
function arrayFunctions() {
  // Split a string into an array
  let phrase1 = "When in the course of human events it becomes necessary for one people to dissolve the political bands";
  // split here...

  let words = phrase1.split(" ");


  // call printArray here...
  printArray(words);

  // array.slice gets a "sub-array" but does not modify the original
  // array.slice(startElement, nonInclusiveEndElement)
  console.log('*** ***\r\narray.slice gets a "sub-array" but does not modify the original');
  // slice here...
  let arr = words.slice(3, 7);
  printArray(arr);
  printArray(words);


  // array.splice gets a "sub-array" and removes those elements.
  // array.splice(start, count, newelements…)
  console.log('*** ***\r\narray.splice gets a "sub-array" and removes those elements.');
  // splice here..

  words.splice(3, 4, "middle", "of", "the", "day")

  printArray(arr);
  printArray(words);


  // array.concat(arr2)
  // array.concat joins two arrays, and does not modify either.
  console.log('*** ***\r\narray.concat joins two arrays, and does not modify either.');
  // concat here...

  let bigArray = words.concat(arr);
  printArray(words);
  printArray(arr);
  printArray(bigArray);

}

/********************
 * 
 * 
 SCOPE
 */

/**
 * 
 * @param {boolean} testValue1 
 * @param {*} testValue2 
 * @returns 
 */

function scopeTest(testValue1, testValue2) {
  let inScopeTest = true;

  {
    let scopeToCodeBlock = inScopeTest;
  }
  if (inScopeTest && scopeToCodeBlock) {
    console.log('This will not print');
  }
  return 12;
}

/**
 * Joins an array of strings together with the - separator and prints to console.
 * @param {string[]} arr The array to be printed
 */
function printArray(arr) {
  console.log(arr);
  //console.log(arr.join("-"));
}



/***************************************************************** */
/************* Functions and Parameters ************************** */
/***************************************************************** */
/**
 * Write a function called multiplyTogether that multiplies two numbers together. But 
 * what happens if we don't pass a value in? What happens if the value is not a number?
 *
 * @param {number} firstParameter the first parameter to multiply
 * @param {number} secondParameter the second parameter to multiply
 */
function multiplyTogether(firstParameter, secondParameter) {
  return firstParameter * secondParameter;
}

/**
 * This version makes sure that no parameters are ever missing. If
 * someone calls this function without parameters, we default the
 * values to 0. However, it is impossible in JavaScript to prevent
 * someone from calling this function with data that is not a number.
 * Call this function multiplyNoUndefined
 *
 * @param {number} [firstParameter=0] the first parameter to multiply
 * @param {number} [secondParameter=1] the second parameter to multiply
 */
function multiplyNoUndefined(firstParameter = 0, secondParameter = 1) {
  return firstParameter * secondParameter;
}

/**
 * How can I write the multiply function so that it will multiply any number of parameters?
 */
function multiply() {
  if (arguments.length == 0) {
    return 0;
  }
  let product = 1;
  for (arg of arguments) {
    if (typeof (arg) === "number") {
      product = product * arg;
    }
  }
  return product;
}

// How can we change this so that it can add up zero to three numbers?

/**
 * 
 * @param {number} num1 A number to add
 * @param {number} num2 A number to add
 * @param {number} num3 A number to add
 * @returns {number} The sum of numbers passed in
 */
function Add(num1 = 0, num2 = 0, num3 = 0) {
  return num1 + num2 + num3;
}


/**
 * How can I write the add function so that it will add any number of parameters?
 */

function add() {

  if (arguments.length == 0) {
    return 0;
  }

  let sum = 0;

  for (let i = 0; i < arguments.length; i++) {
    if (typeof (arguments[i]) === "numbers") {
      sum += arguments[i];
    }
  }
  return sum;

}


/***************************************************************** */
/***************** Anonymous Functions  ************************** */
/***************************************************************** */

/*********************************************************
 * Anonymous Functions
 * 
 * Functions are a "first-class object" in JavaScript.  
 * There are numerous ways to define functions.  We have seen just one 
 * way so far... with the "function" keyword similar to how we define a method in C#.
 */
// Anonymous functions
function doubleIt(n) {
  return n * 2;
}

/***************************
 * There is actually a "variable" called doubleIt now
 */
// print it...

console.log(`doubleIt is a type of ${typeof (doubleIt)}`);
console.log(doubleIt.name);

/************************
 * Now that the function is defined, we can actually "assign" that function to 
 * another variable.
 */
let f = doubleIt;
console.log(`f is a type of ${typeof (f)}`);
console.log(f.name);

// Call the function doubleIt

console.log(doubleIt(12));

// Call the function f

console.log(f(23));

/*****************************
 * Another way to define a function - assign it to a variable directly
 * 
 */

let doubIt = function (n) {
  return n * 2;
}

let tripleIt = function (n) {
  return n * 3;
}

/*******************************
 * And finally, a shortcut for the above using lambda (fat arrow)
 * 
 */

let quadtrupleIt = (n) => { return n * 4; };

/************************************
 * You may even see a shorter-cut, called an expression-bodied function
 * but I won't use it normally
 */

let quintupleIt = n => n * 5;

/************************************
 * Now we can write a function, which takes another function as a parameter.
 * The passed-in function can be called (executed / invoked).
 */
function toAllElements(array, functionToApply) {
  let returningArray = [];
  for (let i = 0; i < array.length; i++) {
    returningArray.push(functionToApply(array[i]))
  }

  return returningArray;
}

/***********************************
 * Define an array of numbers
 */
let myArray = [1, 2, 3, 4, 5];

/**********************************
 * Now in the Console window, call toAllElements, passing in myArray, and a function
 * which will perform an operation on every element
 */
//toAllElements(myArray, doubleIt);






/*************************************************************************************
 * Using Anonymous functions
 * ***********************************************************************************
 */

/**
* Takes an array and returns a new array of only numbers that are
* multiples of 3
*
* @param {number[]} numbersToFilter numbers to filter through
* @returns {number[]} a new array with only those numbers that are
*   multiples of 3
*/
function allDivisibleByThree(numbersToFilter) {
  return numbersToFilter.filter((element) => {
    return element % 3 === 0;
  })
}

/***************************************************************** */
/********************* Array Functions  ************************** */
/***************************************************************** */
/**
 * Takes an array and, using the power of anonymous functions, generates
 * their sum.
 *
 * @param {number[]} numbersToSum numbers to add up
 * @returns {number} sum of all the numbers
 */
function sumAllNumbers(numbersToSum) {

  return numbersToSum.reduce((sum, element) => {
     
    return sum + element ;
    }
  );

//////////////////////////////////////////////////////////////////////////////////

  let people = [
    { name: "Greg", age: 21, height: 71 },
  ];

  // List all the people using forEach
  function listAllPeople(peopleArray) {
    peopleArray.forEach(p => {
      console.log(`${p.name}, age ${p.age}`)
    });
  }

  // Filter people by height or age
  function shortPeople(peopleArray) {

    return peopleArray.filter(x => {
      return x.height < 65;
    })
  }

  // Map Name to uppercase
  function upperName(peopleArray) {
    return peopleArray.map(p => {
      return p.name.toUpperCase();
    })
  }


  // Reduce to total height of all people
  function totalHeight(peopleArray) {
    return peopleArray.reduce((sum, p) => {
      return sum + p.height;
    }, 0);
  }

  // Sort the array

  function shortPeople(people) {

    people.sort((item1, item2) => {
      return (item1.height > item2.height ? 1 : (item1.height < item2.height) ? -1 : 0);
    })
    return people;
  }
}
