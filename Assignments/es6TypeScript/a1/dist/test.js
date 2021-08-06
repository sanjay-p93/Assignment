"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
console.log('hellow world');
function welcomPerson(person) {
    console.log("hey " + person.firstName + " " + person.lastName);
    return "hey " + person.firstName + " " + person.lastName;
}
var james = {
    firstName: "john",
    lastName: "rambo"
};
welcomPerson(james);
//# sourceMappingURL=test.js.map