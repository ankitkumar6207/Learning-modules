// // function declaration
// function sum(num1, num2){  here num1 and num2 is called parameters
//    console.log(num1+num2);
// }
// sum(100,200); // function call here 100 and 200 are called arguments

// // function expression
//  assigning a function to a variable is called funcion expression (include ; at the last)
// when you give name to the function then that is called named function expression
// and if you don't give name to the function then that is called anonymous function 

// const sumOfTwoNumber = function (num1, num2){ // anonymous function expression(Important what is anonymous func : a function without name is called anonymous func)
//     console.log(num1+num2);
// };

// sumOfTwoNumber(1,2);




// callback function : a function that is dependent on another function or 
//  when we pass a function as an argument and receive as a parameter then that is called 
//  that is called call back function 


// const doSomething = function(callback){
//     console.log("samose ban rhe hai...");
//      setTimeout(function(){           // two parameter in setTimout (function,time)
//         callback();
//      }, 3000);
// }

// const callback = function(){
//     console.log("samose ready hai");
// }

// doSomething(callback);



// Higher order functions : most used in react 
const radius = [1,2,3,4];

const area = function(radiusArray){ //anonymous function
    const result = [];
    for(let i = 0; i < radiusArray.length; i++){
        const a = Math.PI * radiusArray[i] * radiusArray[i];
        result.push(a);
    }
    return result;
}

const ans = area(radius);
console.log(ans);

const circumference = function(radiusArray){
    const result = [];
    for(let i = 0; i < radiusArray.length; i++){
        const a = 2 * Math.PI * radiusArray[i];
        result.push(a);
    }
    return result;
}

const ans2 = circumference(radius);
console.log(ans2);


// 

const formulaOfArea = function(r){
    return Math.PI * r * r;
}

const formulaOfCircumference = function(r){
    return 2 * Math.PI * r;
}


const calculate = function(radiusArray, formula){ // here calculate is a higher order function
    // here formula is a function taken as parameter 
    const result = [];
    for(let i = 0; i < radiusArray.length; i++){
        const a = formula(radiusArray[i]);
        result.push(a);
    }
    return result;
}

// here both result is coming from the higher order function 
const ans3 = calculate(radius, formulaOfArea);
const ans4 = calculate(radius, formulaOfCircumference);
console.log(ans3);
console.log(ans4);




// Arrow function  : same as above but arrow function is mostly used to make the code shorter
// const multiply = (num1, num2) => {
//    return num1*num2;
// }
// console.log(multiply(2,3));

// we can write a above function into a single line but only when there is only one line of 
// code inside the function :
const multiply = (num1, num2)=>num1*num2;
 console.log(multiply(2,3));


import  {name}  from "../ep-07"; // .. means jha ye file hai us folder se bahar
// console.log(name);

 