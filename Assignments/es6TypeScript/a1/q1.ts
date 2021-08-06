interface Item {
    name: string;
    id: number;
}

class ItemDetails {
    name: string;
    id: number;

    constructor(name: string, id: number) {
        this.name = name;
        this.id = id;
    }
}
const x: number =100;
//x=1000;  //Cannot assign to 'x' because it is a constant.ts(2588)
const item: Item = new ItemDetails("table", 1);
//item=new ItemDetails("chair",100); //Cannot assign to 'item' because it is a constant.ts(2588)

console.log(`vaue of x is ${x}`);
console.log(`the item is ${item.id} : ${item.name}`);