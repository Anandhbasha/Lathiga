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
    // d=66
    // console.log(d);

    // localscope
    // globalscope
    // {
        // const num1 = 55
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
//         let x = undefined
//         console.log(typeof(x));
        
//         // null
//         let y = null
//         console.log(typeof(y));
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
    function add(a,b){
        return a+b;        
    }
    // add(50,60)
    // add(66,77)
    // add(66,75)
    // add(66,66)

    console.log(add(97,68));
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

            let age =19

            // else if
            if(age>19){
                console.log("He is Adult");                
            }
            else if(age>=13 && age<=19){
                console.log("He is Teenager");
                
            }
            else{
                console.log("He is Child");
                
            }
            nationality = "India"
            state = "TN"
            // nested if
            if(age>=18){
                if(nationality=="India"){
                    if(state=="TN"){
                        console.log("He is eligible to vote in TN");                        
                    }
                }
            }