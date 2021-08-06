//q1
function square(n) {
    return n*n;
}
function double(n) {
    return(n*2);
}
function composedValue(f1,f2,n){
    return f1(f2(n));
}
console.log(composedValue(square,double,5));


//q2
function compose(f1,f2){
    return function f(x) { return f1(f2(x)); };
}
var f= compose(square,double);
console.log(f(5));


//q3
var a=[1,3,5,8,4,6];
function isNumEven(num){
    if(num%2==0)
        return true;
    return false;
}
function find(arry,isEven){
    for(e of arry){
        if(isEven(e))
            return e;
    }
}
var r3=find(a,isNumEven);
console.log(r3);


//q4
function map(arry,fn) {
    var arrTemp = [];
    for(e of arry){
        arrTemp.push(fn(e));
    }
    return arrTemp;
}
var r4=map(a,square);
console.log(a);
console.log(r4);
