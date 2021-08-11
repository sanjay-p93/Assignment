
// adding the new fibbboci elemsts with symbol

class fibbanocci{
    private previousNo;
    private currentNo;
    constructor(){
        this.previousNo=0;
        this.currentNo=1;
        this[Symbol()]=0;
    }
    next(){
        this[Symbol()] = this.currentNo;
        this.currentNo=this.currentNo+this.previousNo;
        this.previousNo=this.currentNo-this.previousNo;
        return this.currentNo;
    }
}
let fib= new fibbanocci();
console.log(fib.next());
console.log(fib.next());
console.log(fib.next());
console.log(fib.next());
console.log(fib);



// making parameters symbol

class fibbanocci2{
    previousNo = Symbol();
    currentNo = Symbol();
    constructor(){
        this[this.previousNo]=0;
        this[this.currentNo]=1;
    }

    next(){
        let next=this[this.previousNo]+this[this.currentNo];
        this[this.previousNo] =this[this.currentNo];
        this[this.currentNo]=next;
        return this[this.currentNo];
    }
}
let fib2= new fibbanocci2();
console.log(fib2.next());
console.log(fib2.next());
console.log(fib2.next());
console.log(fib2.next());
console.log(fib2);
