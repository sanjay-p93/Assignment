//q10
function fibonacci100() {
    var a =0;
    var b=1;
    var r=b+a;
    for(i=0;i<100;i++)
    {
        console.log(r);
        r = a + b;
        a = b;
        b = r;
    }
}
fibonacci100();

//q11
function reverseArry(arry1) {
    var arry2 = [];
    for(var i=arry1.length-1; i>=0; i--){
        arry2.push(arry1[i]);
    }
    return arry2;
}
a11=[1,2,3,4,5]
console.log(a11);
console.log(reverseArry(a11));
