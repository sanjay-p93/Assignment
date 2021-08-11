interface Printable{
    print();
}

let  circle : Printable = {
    print(){
        console.log("this is a circle");
    }
}


let  employee : Printable = {
    print(){
        console.log("this is an employee");
    }
}

let printAll=(...args : Printable[])=>{
    for (const iterator of args) {
        iterator.print();
    }
}

printAll(circle,employee);