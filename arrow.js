// (()=>{
//     console.log("hello")
// })(); // this function is an IIFE function

// Immediately Invoked Function Expression IIFE, also known as a Self-Executing Anonymous Function or simply SEAF.

// const hello =()=>{ // this is an ARROW FUNCTION
//     return `HELLO`;
// }
// console.log(hello())


// let sum = (a,b)=> a+b; console.log(sum(2,1));

const x = {
    name : 'Abhishek',
    role : 'Js Developer',
    exp  : 30,
    show : function(){
        // let that = this
        setTimeout(()=>{ // setTimeout ke andr arrow function use krne se hume jo this iske andr mila wo ek LEXICAL this hai jo usee apne surroundings se mila hai . Beacuse Arrow does not make its own this wo apne parent se leleta hai . parent yha par hai  object.
            console.log(`My name is ${this.name} and my Role is ${this.role} and i have ${this.exp} expereince`)
        },2000)
        // console.log(`My name is ${this.name} and my Role is ${this.role} and i have ${this.exp} expereince`)
        }
    }
    x.show()