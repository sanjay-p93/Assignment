// adding the new fibbboci elemsts with symbol
var fibbanocci = /** @class */ (function () {
    function fibbanocci() {
        this.previousNo = 0;
        this.currentNo = 1;
        this[Symbol()] = 0;
    }
    fibbanocci.prototype.next = function () {
        this[Symbol()] = this.currentNo;
        this.currentNo = this.currentNo + this.previousNo;
        this.previousNo = this.currentNo - this.previousNo;
        return this.currentNo;
    };
    return fibbanocci;
}());
var fib = new fibbanocci();
console.log(fib.next());
console.log(fib.next());
console.log(fib.next());
console.log(fib.next());
console.log(fib);
// making parameters symbol
var fibbanocci2 = /** @class */ (function () {
    function fibbanocci2() {
        this.previousNo = Symbol();
        this.currentNo = Symbol();
        this[this.previousNo] = 0;
        this[this.currentNo] = 1;
    }
    fibbanocci2.prototype.next = function () {
        var next = this[this.previousNo] + this[this.currentNo];
        this[this.previousNo] = this[this.currentNo];
        this[this.currentNo] = next;
        return this[this.currentNo];
    };
    return fibbanocci2;
}());
var fib2 = new fibbanocci2();
console.log(fib2.next());
console.log(fib2.next());
console.log(fib2.next());
console.log(fib2.next());
console.log(fib2);
//# sourceMappingURL=q1.js.map