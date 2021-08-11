//q5 - a 
var add = function (x, y) {
    if (x === void 0) { x = 10; }
    if (y === void 0) { y = 20; }
    console.log("arguments count " + arguments.length);
    console.log(x + " " + y);
    return x + y;
};
console.log(add());
console.log(add(50));
console.log(add(50, 100));
console.log(add(undefined, 100));
console.log(add(50, undefined));
//taking veriables
var z = 0.5;
var add2 = function (x, y) {
    if (x === void 0) { x = 10; }
    if (y === void 0) { y = x * z; }
    console.log(x + " " + y);
    return x + y;
};
console.log(add2());
//taking funciton
var fn = function () { return 30; };
var add3 = function (x, y) {
    if (x === void 0) { x = 10; }
    if (y === void 0) { y = x * fn(); }
    console.log(x + " " + y);
    return x + y;
};
console.log(add3());
// q5 - c
var userFriends = function (user) {
    var friends = [];
    for (var _i = 1; _i < arguments.length; _i++) {
        friends[_i - 1] = arguments[_i];
    }
    console.log(user);
    console.log(friends);
};
userFriends("john");
userFriends("john", "rambo");
userFriends("john", "rambo", "rocky");
userFriends("john", "rambo", "rocky", "balboa");
// q5 - c
var names = ["james", "sarah", "jane", "Winny"];
var printCapitalNames = function () {
    var n = [];
    for (var _i = 0; _i < arguments.length; _i++) {
        n[_i] = arguments[_i];
    }
    for (var _a = 0, n_1 = n; _a < n_1.length; _a++) {
        var e = n_1[_a];
        console.log(e.toUpperCase());
    }
};
printCapitalNames.apply(void 0, names);
//# sourceMappingURL=q5.js.map