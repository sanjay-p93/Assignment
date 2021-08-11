//q7 - a

let a7 = ["rambo","cochin","kerala","india"];
let [,,state="tn"] = a7;
console.log("third elemt is "+state);


//q7 - b
let organiazation ={
    orgName:"xyz",
    address:{city:"city",pin:"234567"}
}
const {address:{pin}}=organiazation;
console.log(pin);