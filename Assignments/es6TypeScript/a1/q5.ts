//q5 - a 
let add = function(x:number=10,y:number=20){
    console.log("arguments count "+arguments.length);
    console.log(x+" "+y);
    return x+y;
}
console.log(add());
console.log(add(50));
console.log(add(50,100));
console.log(add(undefined,100));
console.log(add(50,undefined));

//taking veriables
const z:number=0.5;
let add2 = function(x:number=10,y:number=x*z){
    console.log(x+" "+y);
    return x+y;
}
console.log(add2());


//taking funciton
const fn = () => 30;
let add3 = function(x:number=10,y:number=x*fn()){
    console.log(x+" "+y);
    return x+y;
}
console.log(add3());



// q5 - c
 const userFriends= (user:string,...friends:string[])=>{
    console.log(user);
    console.log(friends);
 }
 userFriends("john");
 userFriends("john","rambo");
 userFriends("john","rambo","rocky");
 userFriends("john","rambo","rocky","balboa");



 // q5 - c
 let names = ["james","sarah","jane","Winny"];
 const printCapitalNames= (...n:string[])=>{
    for (const e of n) {
        console.log(e.toUpperCase());
    }
 }
 printCapitalNames(...names);
