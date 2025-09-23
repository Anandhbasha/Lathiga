// let btn = document.createElement('button')
// // innerHTML
// // innerText
// // textContent
// btn.innerHTML="Click"
// document.body.append(btn)

// btn.addEventListener("click",()=>{
//     btn.innerHTML==="Clicked"?btn.innerHTML="Click":btn.innerHTML="Clicked"
// })

// let input = document.createElement("input") 
// input.setAttribute("id","userName")
// input.setAttribute("type","text")
// input.setAttribute("placeholder","Enter the userName")
// document.body.append(input)

// input.addEventListener("change",(e)=>{
//     console.log(e.target.value)    
// })

// const getValue= (e)=>{
//     console.log(e.target.value);
    
// }

let newButton = document.getElementById('edit')
const changeValue = ()=>{   
    newButton.textContent="Edited" 
    console.log(newButton);    
}