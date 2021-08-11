import acc from './q8account'

class current extends acc {
    "cash credit" : number;
    
    constructor(id: number,name:string,balance:number,credit:number) {
        super(id,name,balance);
        this["cash credit"]= credit;
    }
    withDraw(amount:number){
        if((this.balance+this["cash credit"])>=amount){
            this.balance=this.balance-amount;
            console.log(`${amount} wihtdrawn the new balance is ${this.balance}`);
        }
        else{
            console.log("Transaction failed: not enough balance");
        }
    }
}

export default current