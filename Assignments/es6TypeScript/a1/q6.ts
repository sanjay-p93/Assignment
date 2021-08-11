let employeeId:number = 1234;
let nameKey:string = "Employee Name";
let userName:string = "John Rambo";
let model:string = "HP Elitebook";
let deskNo:string ="2F64";
let issue:string ="Some random issue is happening";

function createToken(employeeId,userName,model,desk,issue){
    return {employeeId,[nameKey]:userName,"Laptop Model":model,"Desk No":desk,issue,isClosed(){return false;}}

}

let token = createToken(employeeId,userName,model,deskNo,issue);
console.log(token);
console.log(token.employeeId);
console.log(token["Employee Name"]);
console.log(token["Laptop Model"]);
console.log(token.issue);
console.log(token.isClosed());