"use strict";
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
Object.defineProperty(exports, "__esModule", { value: true });
var q8account_1 = require("./q8account");
var savings = /** @class */ (function (_super) {
    __extends(savings, _super);
    function savings(id, name, balance, isSalary, intrest) {
        var _this = _super.call(this, id, name, balance) || this;
        _this.isSalary = isSalary;
        _this.intrest = intrest;
        return _this;
    }
    savings.prototype.withDraw = function (amount) {
        if ((this.balance - amount) >= 0) {
            this.balance -= amount;
            console.log(amount + " wihtdrawn the new balance is " + this.balance);
        }
        else {
            console.log("Transaction failed: not enough balance");
        }
    };
    return savings;
}(q8account_1.default));
exports.default = savings;
//# sourceMappingURL=q8savings.js.map