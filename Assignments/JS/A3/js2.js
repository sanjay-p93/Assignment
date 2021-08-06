//1
function person(firstName,lastName,age,skills,address,dob,married,proffession) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.age =age;
    this.skills=skills;
    this.address=address;
    this.dob=dob;
    this.married=married;
    this.proffession=proffession;
}
var p1= new person("john","rambo",30,["css","HTML"],{city:"newyork",pincode:123456},"18/11/1991",false,"ui developer");
var p2= new person("rocky","balaboa",30,["php","sql","angular"],{city:"delhi",pincode:234567},"23/07/1991",true,"web developer");

function print(){
    console.log(p1);
    console.log(p2);
};
print();


//2
var amithab= new person("amithab","bachan",22,["c"],{city:"hydrabad",pincode:521185},"08/06/1996",'false',"sr analyst");
var abhisheik= new person("abhisheik",21,["html"],"23/07/1998",'true',"jr analyst");
var abhisheik=Object.create(amithab);
function print2(){
    console.log(amithab);
    console.log(abhisheik.lastName);
    console.log(abhisheik.address);
};
print2();

//3
var aradhya= new person("aradhya",17,["css"],"23/07/2000",'false',"intern");
var aradhya=Object.create(abhisheik);

function print3(){
    console.log(abhisheik);
    console.log(aradhya.lastName);
    console.log(aradhya.address);
};

print3();

//4
function bank(accno,accname,balance) {
    this.accno = accno;
    this.accname = accname;
    this.balance =balance;
}
bank.prototype.getBalance= function(){
    console.log(this.balance);
}

function savings(...args) {
    bank.apply(this,[args[0],args[1],args[2]]);
    this.isSalary=args[3];
}

savings.prototype = Object.create(bank.prototype);
savings.prototype.withdraw= function(amount){
    if(this.balance>=amount){
        this.balance=this.balance-amount;
        console.log("Amount "+amount+" withdrawn new balance is "+ this.balance);
    }
    else{
        console.log("account balance inssufficient");
    }
}


function current(...args) {
    bank.apply(this,[args[0],args[1],args[2]]);
    this.odLimit=args[3];
}

current.prototype = Object.create(bank.prototype);
current.prototype.withdraw= function(amount){
    if((this.balance+this.odLimit)>=amount){
        this.balance=this.balance-amount;
        console.log("Amount "+amount+" withdrawn new balance is "+ this.balance);
    }
    else{
        console.log("account balance inssufficient");
    }
}

var sav= new savings(1234,"rambo",10000,true);
var cur= new current(2234,"dude",10000,5000);
sav.withdraw(1000);
cur.withdraw(12000);
sav.getBalance();
cur.getBalance();