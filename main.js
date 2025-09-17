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
let today="Wednesday"
switch(today){
    case "Monday":
        console.log("Today is Monday");
        break
    case "Tuesday":
        console.log("Today is Tuesday");
        break
    case "Wednesday":
        console.log("Today is Wednesday");
        break
    case "Thursday":
        console.log("Today is Thursday");
        break
    case "Friday":
        console.log("Today is Friday");
        break
    case "Saturday":
        console.log("Today is Saturday");
        break
    default:
        console.log("Today is Sunday");
        
}
// loops
    //while
    let num1 = 20
    while(num1<25){
        console.log("While is working");
        num1++        
    }

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
        
    // }
     let arr = [10,20,55,44,88]
    let total = 0
    for(let x=0;x<arr.length;x++){
        total+=arr[x]        
    }
    console.log(total);
    
