var a = ["tom", "jerry", "spike", "nibbles", "Tyke"];
var objectMaker = function (arry) {
    var arry2 = [];
    for (var _i = 0, arry_1 = arry; _i < arry_1.length; _i++) {
        var e = arry_1[_i];
        var objE = { name: e, length: e.length };
        arry2.push(objE);
    }
    return arry2;
};
console.log(a);
console.log(objectMaker(a));
//# sourceMappingURL=q4.js.map