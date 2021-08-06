
//q1
var b1 = document.getElementById("q1-btn");
b1.onclick= function(){
    var input1 = document.getElementById("q1-input").valueAsNumber;
    var r1 = document.getElementById("q1-result");
    if(!isNaN(input1) && input1>0){
        var s = (input1 * (input1+1))/2;
        r1.innerHTML = "sum ="+s;
    }
    else{
        r1.innerHTML = "plese enter a valid number greater than 0";
    }
}


//q2
var b2 = document.getElementById("q2-btn");
b2.onclick= function(){
    var n2 = document.getElementById("q2-input").valueAsNumber;
    var r2 = document.getElementById("q2-result");
    if(!isNaN(n2) && n2>0){ 
        var s=0;
        for(var i=1;i<=n2;i++){
            if(i%3==0 ||i%5==0){
                s=s+i;
            }
        }
        r2.innerHTML = "sum ="+s;
    }
    else{
        r2.innerHTML = "plese enter a valid number greater than 0";
    }
}


//q3
var b3 = document.getElementById("q3-btn");
b3.onclick= function(){
    var n3 = document.getElementById("q3-input").valueAsNumber;
    var r3 = document.getElementById("q3-result");
    if(!isNaN(n3) && n3>0){ 
        if(n3%2==0)
            r3.innerHTML = n3+" is even";
        else
            r3.innerHTML = n3+" is odd";
    }
    else{
        r3.innerHTML = "plese enter a valid number greater than 0";
    }
}


//q5
var n5=0;
var years5="";
var d5 = new Date();
var thisYear = d5.getFullYear();
do{
    if(thisYear%4==0){
        years5= years5+thisYear+" ";
        n5++;
    }
    thisYear++;
}while(n5<20);
var r5 = document.getElementById("q5-result");
r5.innerHTML = years5;


//q6
var ul6 = document.getElementById("q6-ul");
var a6 = ["hello","world","in","a","frame"]
ul6.style.borderStyle ="dotted";
ul6.style.maxWidth="200px";
ul6.style.listStyleType="none";
for(i=0;i<a6.length;i++){
    var newLi = document.createElement("li");
    newLi.innerHTML=a6[i];
    ul6.appendChild(newLi);
}


//q7
var b7 = document.getElementById("q7-btn");
var r7 = document.getElementById("q7-result");
b7.onclick= function(){
    var input7 = document.getElementById("q7-input").valueAsNumber;
    var x = (input7*74.28).toFixed(2)+" : INR <br>"+(input7*109.14).toFixed(2)
            +" : YEN <br>"+(input7*0.84).toFixed(2)+" : EURO <br>"+(input7*0.72).toFixed(2)+" : POUND <br>";
    r7.innerHTML=x;
}


//q8
function concat(arry1,arry2) {
    return arry1.concat(arry2);
}
a8=["a","b","c"];
b8=[1,2,3];
var p1_8 = document.getElementById("p1-8");
var p2_8 = document.getElementById("p2-8");
var p3_8 = document.getElementById("p3-8");
p1_8.innerHTML = a8;
p2_8.innerHTML = b8;
var r8=concat(a8,b8);
p3_8.innerHTML = r8;


//q9
function alterConcat(arry1,arry2) {
    var size = Math.min(arry1.length,arry2.length);
    var concatArry=[];
    for(var i=0;i<size;i++){
        if(i<arry1.length)
            concatArry.push(arry1[i]);
            
        if(i<arry2.length)
            concatArry.push(arry2[i]);
    }
    return concatArry;
}
a9=["a","b","c"];
b9=[1,2,3];
var p1_9 = document.getElementById("p1-9");
var p2_9 = document.getElementById("p2-9");
var p3_9 = document.getElementById("p3-9");
p1_9.innerHTML = a9;
p2_9.innerHTML = b9;
var r9=alterConcat(a9,b9);
p3_9.innerHTML = r9;
