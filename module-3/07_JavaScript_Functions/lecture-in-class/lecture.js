/*************************************** */
//  Spread  
/*************************************** */

//clone/copy an array
const arr1 = [0, 1, 2];
const arr2 = [...arr1];
//console.table(arr2);

//merge array
const arr3 = [3, 4, 5];
const arr4 = [...arr3, ...arr1];
//console.table(arr4);

//exchange assignment
let a = 0;
let b = 1;
let c = 2;
let d = 3;
[d, c, b, a] = [a, b, c, d];

//console.log(`a: ${a} b: ${b} ${c} ${d}`);


//truncate array
arr4.length = 2;
//console.table(arr4);

arr4.length = 10;
//console.table(arr4);

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
  // printArray(words);


  // array.splice gets a "sub-array" and removes those elements.
  // array.splice(start, count, newelements…)
  console.log('*** ***\r\narray.splice gets a "sub-array" and removes those elements.');
  // splice here...
  words.splice(3, 4, "middle", "of", "the", "day");
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

/**
 * Joins an array of strings together with the - separator and prints to console.
 * @param {string[]} arr The array to be printed
 */
function printArray(arr) {
  console.log(arr);
  // console.log(arr.join("-"));
}

/************************ */
//  Scope 
/************************ */

/**
 *  Testing scope and error catching
 * 
 * @param {boolean} testValue1 
 * @param {*} testValue2 
 */
function scopeTest(testValue1, testValue2) {

  let inScopeTest = true;

  {
    let scopeToCodeBlock = inScopeTest;
  }

  if (inScopeTest && scopeToCodeBlock) {
    console.log("This will not print");
  }

  return 12;
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

  if (arguments.length === 0) {
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
  if (arguments.length === 0) {
    return 0;
  }

  let sum = 0;

  for (let i = 0; i < arguments.length; i++) {
    if (typeof (arguments[i]) === "number") {
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
console.log(`doubleIt is a type  ${typeof (doubleIt)}`);
console.log(doubleIt.name);


/************************
 * Now that the function is defined, we can actually "assign" that function to 
 * another variable.
 */

let f = doubleIt;
console.log(`f is a type  ${typeof (f)}`);
console.log(f.name);

// Call the function doubleIt
console.log(f(12));


// Call the function f



/*****************************
 * Another way to define a function - assign it to a variable directly
 * 
 */
// 1
function doubleIt(n) {
  return n * 2;
}

// 2
let tripleIt = function (n) {
  return n * 3;
}


/*******************************
 * And finally, a shortcut for the above using lambda (fat arrow)
 * 
 */
// 3
let quadrupleIt = (n) => { return n * 4; };

/************************************
 * You may even see a shorter-cut, called an expression-bodied function
 * but I won't use it normally
 */

// 4
let quintupleIt = n => n * 5;


/************************************
 * Now we can write a function, which takes another function as a parameter.
 * The passed-in function can be called (executed / invoked).
 */
function toAllElements(array, functionToApply) {
  let returningArray = [];

  for (let i = 0; i < array.length; i++) {
    returningArray.push(functionToApply(array[i]));
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
  return numbersToSum.reduce(

    (total, currentElement) => {
      return total + currentElement;
    }
  );
}

let marxBros = [
  { name: "Groucho", age: 21, height: 71 },
  { name: "Harpo", age: 21, height: 42 },
  { name: "Chico", age: 21, height: 77 },
  { name: "Gummo", age: 21, height: 99 },
];



let people = [
  { name: "Greg", age: 21, height: 71 },
  { name: "Larry", age: 21, height: 51 },
  { name: "Curly", age: 21, height: 42 },
  { name: "Moe", age: 21, height: 88 },
];

// List all the people using forEach
function listAllPeople(peopleArray) {
  peopleArray.forEach(p => {
    console.log(`${p.name}, age ${p.age}`);
  })
}

// Filter people by height or age
function shortPeople(peopleArray) {

  return peopleArray.filter(p => {
    return p.height < 65;
  })
}

// Map Name to uppercase
function upperName(peopleArray) {
  return peopleArray.map(p => {
    return { name: p.name.toUpperCase(), age: p.age + 1, height: p.height };
  })
}


function upperName2(peopleArray) {
  peopleArray.forEach(p => {
    p.name = p.name.toUpperCase();
    p.age++
  })
  return peopleArray;
}

// Reduce to total height of all people
function totalHeight(people) {
  return people.reduce((sum, p) => {
    return sum + p.height;
  }, 0);
}

// Sort the array

function sortPeople(peopleArray) {

  peopleArray.sort((item1, item2) => {
    if (item1.height > item2.height) {
      return 1;
    } else if (item1.height < item2.height) {
      return -1;
    } else {
      return 0;
    }
  })
  return peopleArray;
}

function sortPeople2(peopleArray) {

  peopleArray.sort((item1, item2) => {
    return (item1.height > item2.height ? 1 : (item1.height < item2.height) ? -1 : 0);
  })
  return peopleArray;
}

function sortPeople3(peopleArray, sortBy = "n") {

  if (sortBy === "h") {
    peopleArray.sort((item1, item2) => {
      return (item1.height > item2.height ? 1 : (item1.height < item2.height) ? -1 : 0);
    })
  }
  if (sortBy === "n") {
    peopleArray.sort((item1, item2) => {
      return (item1.name > item2.name ? 1 : (item1.name < item2.name) ? -1 : 0);
    })
  }
  return peopleArray;
}

function sortPeople4(peopleArray, sortBy = "n") {

  switch(sortBy.toLowerCase()){

      case 'n' : return  peopleArray.sort((item1, item2) => {
                            return (item1.name > item2.name ? 1 : (item1.name < item2.name) ? -1 : 0);
                          });
                break;
      case 'h' : return peopleArray.sort((item1, item2) => {
                            return (item1.height > item2.height ? 1 : (item1.height < item2.height) ? -1 : 0);
                          });
              break;
      default : return peopleArray;
  }
 

}