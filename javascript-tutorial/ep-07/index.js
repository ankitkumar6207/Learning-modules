// important note 
// js is a synchronous and single threaded programming language
// synchronous : synchronous means js execute line by line , js does not wait for anyone.
// single threaded : js can do one task at a time it is not multitasking.
// but sometime we have to write code to fetch data from database and display into Ui 
// but it take time to serach and then fetch the data and synchronous js does not wait for anyone
// so we make js as asynchronous 
// two ways :
// 1.using promises
// 2.using async/await(mostly used) according to react 


// API : application programming interface
// works as a medium.
// ex : weather data (wind , humadity  , temp etc) we can usi api to fetch these datas 


// github
// fetch/axios
const githubAPI = "https://api.github.com/users/ankitkumar62";

// if the api is wrong then error will come and if we don't use try and catch then we can't know that 
// where is this error coming from 
const fetchData = async () => {
    try {
        const res = await fetch(githubAPI);
        const jsonData = await res.json();
        console.log(jsonData.bio);
    } catch (error) {
        console.log(error);
    } finally{
        console.log("ye hmesha chlega...");  
    }

}

fetchData();

// // named export
export const name = "developers";

// // default export
// export default name;   just remove curly braces from the variable where you are importing this