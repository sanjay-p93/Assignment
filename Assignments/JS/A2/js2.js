//q1
var a=[1,3,5,4,6];
function isNumEven(num){
    if(num%2==0)
        return true;
    return false;
}
function find(arry,isEven){
    if(isEven(arry[0])){
        return arry[0];
    }
    else if(arry.length>1){
        return find(arry.slice(1),isEven);
    }
}
var a1=find(a,isNumEven);
console.log(a1);


//q2
var b=[1,4,9,16,25];
function map(arry,fn){
    var x=[];
    if(arry.length>1){
        x.push(fn(arry[0]))
        x = x.concat(map(arry.slice(1),fn));
    }
    else{
        x.push(fn(arry[0]));
    }   
    return x;
}
var c =map(b,Math.sqrt);
console.log(b);
console.log(c);

//q3
// console.log((function(x){return x*x;})(5));
// console.log("the string is "+map); 

let z =function (fn){console.log( " "+fn);};
z(z);