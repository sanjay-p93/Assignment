interface Order {
    id: number;
    title:string;
    price:number;
    printOrder(): string;
    getPrice() : number;
}

class OrderDetails {
    id: number;
    title:string;
    price:number;

    constructor(id: number,title:string,price:number) {
        this.id = id;
        this.title = title;
        this.price = price;
    }
    printOrder(): string {
        return  `#${this.id} ${this.title} : ${this.price}`;
    }
    getPrice() : number{
        return this.price;
    }
}

  
const order: Order = new OrderDetails(101,"coverse",3000);
const order2: Order = Object.assign({},order);

console.log(order.id);
console.log(order.getPrice());
console.log(order.printOrder());
console.log("copy object");
console.log(order2.id);
// console.log(order2.getPrice()); // Object.assign () does not copy mehtods and prototypes