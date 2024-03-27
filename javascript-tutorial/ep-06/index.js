 
// Array(map, filter, reduce) map and filter are used mostly
const arr = [10, 20, 30, 40, 50];
// you can learn all the methods from mdn 
// console.log(arr);
// arr.push("orange"); // push at append
// console.log(arr);
// arr.unshift("start");//add from the start
// console.log(arr);
// console.log(arr.length);
// console.log(arr[0]);
// console.log(arr[1]);

// for (let i = 0; i < arr.length; i++) {
//     const element = arr[i];
//     console.log(element);
// }


// map : same as loop and used to traverse to the array and gives a modified array after returning some values
// const newArray = arr.map(function(element){
//      return element*2;
// })
// console.log(newArray);


// array of objects 
// const product = [
//     {
//         price:1200,
//         name:"IPhone"
//     },
//     {
//         price:1400,
//         name:"hp"
//     },
//     {
//         price:100,
//         name:"lenova"
//     },
// ];

// product.map((element)=>{
       console.log(element); 
//     console.log(element.name);
       console.log(element.name, element.price);
// })




// // filter : used to filter and return  a modified array
// const arr1 = [10,20,30,40,50]; // 30>=30

// const res = arr1.filter((element)=>{
//     return element >=30; // [30,40,50]
// });
// console.log(res);




// // reduce : mostly used for calculation 
// reduce an array to single value : ex : sum of the array 
// function sumOfElement(arr1){
//    let sum = 0;
//    for(let i = 0; i < arr1.length; i++){
//       sum  = sum + arr[i];
//    }
//    return sum;
// }
// console.log(sumOfElement(arr1));

// using reduce 
// accumulator is the initial value of the result as sum.
// const ans = arr1.reduce((accumulator,element)=>{
//     return accumulator + element;
// },0) here 0 is assigned to accumulator// 0+10, 10+20,30+30, 60+40, 100+50, 150
// console.log(ans);  
  