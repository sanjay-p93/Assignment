class account {

    constructor(public id: number,public name:string, public balance:number) {
    }
    getBanlance(){
        return this.balance; 
    }
}

class current extends account {
    
    constructor(public id: number,public name:string,public balance:number,public cashCredit:number) {
        super(id,name,balance);
    }
}


class savings extends account {
    
    constructor(id: number,public name:string,balance:number,public isSalary:boolean,public intrest:number) {
        super(id,name,balance);
    }
}


let acc1= new current(10001,"john",35000,1000);
let acc2= new current(10002,"james",20000,3000);
let acc3= new savings(10003,"jane",25000,true,5);
let acc4= new savings(10004,"sarah",20000,false,6);


let accList=[acc1,acc2,acc3,acc4];
let totalBalance=0;
for (let acc of accList) {
    totalBalance+=acc.getBanlance();
}
console.log(totalBalance);