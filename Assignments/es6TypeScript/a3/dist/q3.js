var circle = {
    print: function () {
        console.log("this is a circle");
    }
};
var employee = {
    print: function () {
        console.log("this is an employee");
    }
};
var printAll = function () {
    var args = [];
    for (var _i = 0; _i < arguments.length; _i++) {
        args[_i] = arguments[_i];
    }
    for (var _a = 0, args_1 = args; _a < args_1.length; _a++) {
        var iterator = args_1[_a];
        iterator.print();
    }
};
printAll(circle, employee);
//# sourceMappingURL=q3.js.map