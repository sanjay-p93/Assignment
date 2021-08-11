const n : number =10;
if(n%2==0){
    var type="even in var";
    let typeOfN: string = "even in let";
    console.log(typeOfN);
    console.log(type);
}
console.log(type + " outside if");      //var type has hoisting

// console.log(typeOfN); //Cannot find name 'typeOfN'.ts(2304)