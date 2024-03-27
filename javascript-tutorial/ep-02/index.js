// Destructuring assignment
// we can destructuring in object and array
// used too many times in react 

const arr = [1,2,3,4,5];

console.log(arr[1]);
console.log(arr[2]);

const [a,b,c,d,e] = arr;
// now a = 1,b= 2,c = 3 ans so on 
console.log(e);

// object destructuring
// object : key value pair 
const person = {
    name:"Ankit",
    age:21,
    gender:"male",
    address:"Odisha",
};

// access value : 3 ways

// dot notation
console.log(person.gender); 

// bracket notation
console.log(person["age"]);



//object destructuring : used in react

const {name, age, gender, address} = person;
console.log(gender); 
console.log(name); 
console.log(age);
console.log(address); 


