class account {
    id: number;
    name:string;
    balance:number;

    constructor(id: number,name:string,balance:number) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
    getBanlance(){
        return this.balance;
    }
}

export default account