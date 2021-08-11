var n = 10;
if (n % 2 == 0) {
    var type = "even in var";
    var typeOfN = "even in let";
    console.log(typeOfN);
    console.log(type);
}
console.log(type + " outside if"); //var type has hoisting
// console.log(typeOfN); //Cannot find name 'typeOfN'.ts(2304)
//# sourceMappingURL=q2.js.map