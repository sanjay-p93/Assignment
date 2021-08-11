import acc from './q8account'

class savings extends acc {
    isSalary : boolean;
    intrest :number;
    
    constructor(id: number,name:string,balance:number,isSalary:boolean,intrest:number) {
        super(id,name,balance);
        this.isSalary = isSalary;
        this.intrest = intrest;
    }
    withDraw(amount:number){
        if((this.balance-amount)>=0){
            this.balance-=amount;
            console.log(`${amount} wihtdrawn the new balance is ${this.balance}`);
        }
        else{
            console.log("Transaction failed: not enough balance");
        }
    }
}

export default savings