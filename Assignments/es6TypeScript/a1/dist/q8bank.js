"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var q8current_1 = require("./q8current");
var q8savings_1 = require("./q8savings");
var acc1 = new q8current_1.default(10001, "john", 35000, 1000);
var acc2 = new q8current_1.default(10002, "james", 20000, 3000);
var acc3 = new q8savings_1.default(10003, "jane", 25000, true, 5);
var acc4 = new q8savings_1.default(10004, "sarah", 20000, false, 6);
acc1.withDraw(10000);
acc3.withDraw(5000);
var accList = [acc1, acc2, acc3, acc4];
var totalBalance = 0;
console.log(accList);
for (var _i = 0, accList_1 = accList; _i < accList_1.length; _i++) {
    var acc = accList_1[_i];
    totalBalance += acc.getBanlance();
}
console.log(totalBalance);
//# sourceMappingURL=q8bank.js.map