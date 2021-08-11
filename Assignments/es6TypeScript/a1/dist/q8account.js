"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
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
exports.default = account;
//# sourceMappingURL=q8account.js.map