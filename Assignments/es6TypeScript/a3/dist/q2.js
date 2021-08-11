var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        if (typeof b !== "function" && b !== null)
            throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var account = /** @class */ (function () {
    function account(id, name, balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
    account.prototype.getBanlance = function () {
        return this.balance;
    };
    return account;
}());
var current = /** @class */ (function (_super) {
    __extends(current, _super);
    function current(id, name, balance, cashCredit) {
        var _this = _super.call(this, id, name, balance) || this;
        _this.id = id;
        _this.name = name;
        _this.balance = balance;
        _this.cashCredit = cashCredit;
        return _this;
    }
    return current;
}(account));
var savings = /** @class */ (function (_super) {
    __extends(savings, _super);
    function savings(id, name, balance, isSalary, intrest) {
        var _this = _super.call(this, id, name, balance) || this;
        _this.name = name;
        _this.isSalary = isSalary;
        _this.intrest = intrest;
        return _this;
    }
    return savings;
}(account));
var acc1 = new current(10001, "john", 35000, 1000);
var acc2 = new current(10002, "james", 20000, 3000);
var acc3 = new savings(10003, "jane", 25000, true, 5);
var acc4 = new savings(10004, "sarah", 20000, false, 6);
var accList = [acc1, acc2, acc3, acc4];
var totalBalance = 0;
for (var _i = 0, accList_1 = accList; _i < accList_1.length; _i++) {
    var acc = accList_1[_i];
    totalBalance += acc.getBanlance();
}
console.log(totalBalance);
//# sourceMappingURL=q2.js.map