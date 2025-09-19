// Hositing
    // var 
    // console.log(a)
    // var a =10  
    // var a=20
    // a=60
    // console.log(a);    
        // = assignment operator
    //let
    // console.log(b);    
    // let b=55
    // b=70
    // console.log(b);
    //const
    // console.log(d);
    
    // const d=22
    // // d=66
    // console.log(d);

    // localscope
    // globalscope
    // {
    //     const num1 = 55
    // }
    // console.log(num1);

    // starts with letter
    // - dont use
    // space don't use
    //keyword don't use
// data types
    //premitive
        // number
//         let num2 = 50
//         console.log(typeof(num2));
        
//         // string
//         let user = 'xyz'
//         console.log(typeof(user));
        
//         // boolean
//         let isComing = true
//         console.log(typeof(isComing));
        
//         // undefined
        // let x =undefined
        // console.log(typeof(x));
        
//         // null
        // let y = null
        // console.log(typeof(y));
// // non premitive
//     // array
//         let arr = [50,'xyz',true,undefined,null] //0,1,2,3,4
//         console.log(arr);
//         console.log(arr[0]);
//         console.log(arr[3]);       
        
//     // object
//     let person = {
//         personName:"abc",
//         personAge:22,
//         personCity:"CBE",
//         family:{
//             dad:"ghjgghj",
//             mom:"hggjkjhkjh",
//             siblings:{
//                 brother:"bhghhjk",
//                 sister:"jhghkjnnh"
//             }
//         }
//     }
//     console.log(person.family.siblings.brother);
    
    // operators
    //     // ++,--
    //     let num1 = 55
    //     let num2 = 12
    //     console.log(num1+num2);
    //     console.log(num1-num2);
    //     console.log(num1*num2);
    //     console.log(num1/num2);
    //     console.log(num1%num2);
    //     console.log(num1++);
    //     console.log(++num1);
    //     console.log(--num1);
    //     console.log(num1--);
    // // comparision
    //     // <,>,<=,>=,==,===
    //     console.log(num1>num2);
    //     console.log(num1<num2);
    //     console.log(num1<=55);
    //     console.log(num1>=50);
    //     let num3 ="10"
    //     console.log(10==num3);
    //     console.log(10===num3);
        
    // // logical
    //     // &&,||,!
    //     console.log(num1>num2 && num1==55 && 10===num3);
    //     console.log(num1>num2 || num1==55 || 10===num3);
    //     console.log(num1!=55);
    // // ternary opeator
    //     let age = 19
    //     console.log(age>19?"adult":"teenager");
        
    // functions
    // function add(a,b){
    //     return a+b;        
    // }
    // // add(50,60)
    // // add(66,77)
    // // add(66,75)
    // // add(66,66)

    // console.log(add(97,68));
    // let age =19
    // statements
        // conditional Statements
            // if
            // if(age>19){
            //     console.log("He is Teenager");                
            // }
            // // ifesle
            // if(age>19){
            //     console.log("He is adult");                
            // }else{
            //     console.log("He is Teenager");
                
            // }

            // let age =19

            // // else if
            // if(age>19){
            //     console.log("He is Adult");                
            // }
            // else if(age>=13 && age<=19){
            //     console.log("He is Teenager");
                
            // }
            // else{
            //     console.log("He is Child");
                
            // }
            // nationality = "India"
            // state = "TN"
            // // nested if
            // if(age>=18){
            //     if(nationality=="India"){
            //         if(state=="TN"){
            //             console.log("He is eligible to vote in TN");                        
            //         }
            //     }
            // }

// switch
// let today="Wednesday"
// switch(today){
//     case "Monday":
//         console.log("Today is Monday");
//         break
//     case "Tuesday":
//         console.log("Today is Tuesday");
//         break
//     case "Wednesday":
//         console.log("Today is Wednesday");
//         break
//     case "Thursday":
//         console.log("Today is Thursday");
//         break
//     case "Friday":
//         console.log("Today is Friday");
//         break
//     case "Saturday":
//         console.log("Today is Saturday");
//         break
//     default:
//         console.log("Today is Sunday");
        
// }
// loops
    //while
    // let num1 = 20
    // while(num1<25){
    //     console.log("While is working");
    //     num1++        
    // }

    // let arr = [10,20,55,44,88]
    // console.log(arr[0]);
    // console.log(arr[1]);
    // console.log(arr[2]);
    // console.log(arr[3]);
    // console.log(arr[4]);
    // let x=0
    // while(x<arr.length){
    //     console.log(arr[x]); //arr[0] ,x=0
    //     x++
    // }
    
    // //do while
    // do{
    //     console.log("Do while is working");        
    // }while(10>15)
    // // for
    // for(let x=0;x<arr.length;x++){
    //     console.log(arr[x]);
    // }
    // for(let x=arr.length-1;x>=0;x--){
    //     console.log(arr[x]);
    // }

    // let names = "Giri"
    // let temp=""
    // for(let x =0;x<names.length;x++){
    //     temp = temp+names[x] //G
    //     console.log(temp);
        
    // }
    // for(let x =names.length-1;x>=0;x--){
    //     temp = temp+names[x] //G
    //     console.log(temp);
        
    // // }
    //  let arr = [10,20,55,44,88]
    // let total = 0
    // for(let x=0;x<arr.length;x++){
    //     total+=arr[x]        
    // }
    // console.log(total);


// // for of
// for (let x of arr){
//     console.log(x);    
// }
// // for in
// for (let x in arr){
//     console.log(arr[x]);    
// }
// //foreach
// arr.forEach((x)=>console.log(x))

// map
// arr.map((x)=>console.log(x))
// // filter
// even = arr.filter((x)=>x%2==0)
// console.log(even);

// // reduce
// let total =0
// total = arr.reduce((acc,sum)=>acc+sum) //0 ,sum = 10 0+10
// console.log(total);

// // indexOf
// console.log(arr.indexOf(20));

// // find
// let value = arr.find((x)=>x==11)
// console.log(value);

// // push
// arr.push(150)
// console.log(arr);

// // pop
// arr.pop()
// console.log(arr);

// //shift
// arr.shift()
// console.log(arr);

// //unshift
// arr.unshift(250)
// console.log(arr);

// arr[4] = 225
// console.log(arr);

// // slice
// console.log(arr.slice(0,3));

// // split

// let userName = "Hello world"

// sp= userName.split(' ')
// console.log(sp);



// const fruits = ["Banana", "Orange", "Apple", "Mango"];
// fruits.splice(2, 2, "Lemon", "Kiwi");
// console.log(fruits);


// console.log(fruits.sort());

// let arr1 = [10,20,40,80,6,9,5]

// console.log(arr1.sort());


// // setTimeout
// setTimeout(()=>{
//     console.log("Settimeout is working");
    
// },2000)
// // setinterval
// setInterval(()=>{
//     console.log("setInterval is working");    
// },2000)


// types of function

// arrow function
// const arrow = (a,b)=>{
//     console.log("Arrow is working")
//     return a*b
// }
// console.log(arrow(20,10));

// // IFFI
// const IIFI = (function(){

// })
// IFFI()
// // ananoums
// const ananoums = function(){

// }

// ananoums()

// async
    // promise
    // let newPromise = new Promise((resolved,reject)=>{
    //     let coming = true
    //     if(coming){
    //         resolved("He is Here")
    //     }
    //     else{
    //         reject("He is Not Here")
    //     }
    // })

    // newPromise.then((res)=>{console.log(res)}).catch((err)=>{console.log(err)})

//     let student1 = new Promise((resolved,reject)=>{
//         let reached1 = true
//         if(reached1){
//             resolved("Present1")
//         }
//         else{
//             reject("Absent1")
//         }
//     })
//     let student2 = new Promise((resolved,reject)=>{
//         let reached2 = false
//         if(reached2){
//             resolved("Present2")
//         }
//         else{
//             reject("Absent2")
//         }
//     })
//     let student3 = new Promise((resolved,reject)=>{
//         setTimeout(()=>{
//             let reached3 = false
//             if(reached3){
//                 resolved("Present3")
//             }
//             else{
//                 reject("Absent3")
//             }
//         },5000)
//     })
//     let student4 = new Promise((resolved,reject)=>{
//         let reached4 = true
//         if(reached4){
//             resolved("Present4")
//         }
//         else{
//             reject("Absent4")
//         }
//     })
// Promise.allSettled([student1,student2,student3,student4]).then((res)=>{
//     console.log(res)
// }).catch((err)=>console.log(err))



// let fetchData = new Promise((resolved,reject)=>{
//     fetch('https://fakestoreapi.com/products').then((respose)=>{
//         if(!respose.ok){
//             reject("Unable to connect API")
//         }
//         else{
//             resolved(respose.json())
//         }
//     })
// })

// fetchData.then((result)=>{console.log(result)}).catch((err)=>{console.log(err)})


// async function

const prodDetails = async()=>{
    try {
        let res = await fetch("https://fakestoreapi.com/products")
        if(!res.ok){
            throw Error("Unable to connect API")
        }else{
            let details = await res.json()
            console.log(details);            
        }
    } catch (error) {
        console.log(error);        
    }
}

prodDetails()