var employeeId = 1234;
var nameKey = "Employee Name";
var userName = "John Rambo";
var model = "HP Elitebook";
var deskNo = "2F64";
var issue = "Some random issue is happening";
function createToken(employeeId, userName, model, desk, issue) {
    var _a;
    return _a = { employeeId: employeeId }, _a[nameKey] = userName, _a["Laptop Model"] = model, _a["Desk No"] = desk, _a.issue = issue, _a.isClosed = function () { return false; }, _a;
}
var token = createToken(employeeId, userName, model, deskNo, issue);
console.log(token);
console.log(token.employeeId);
console.log(token["Employee Name"]);
console.log(token["Laptop Model"]);
console.log(token.issue);
console.log(token.isClosed());
//# sourceMappingURL=q6.js.map