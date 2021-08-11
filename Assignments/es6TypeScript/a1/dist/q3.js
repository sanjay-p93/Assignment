var OrderDetails = /** @class */ (function () {
    function OrderDetails(id, title, price) {
        this.id = id;
        this.title = title;
        this.price = price;
    }
    OrderDetails.prototype.printOrder = function () {
        return "#" + this.id + " " + this.title + " : " + this.price;
    };
    OrderDetails.prototype.getPrice = function () {
        return this.price;
    };
    return OrderDetails;
}());
var order = new OrderDetails(101, "coverse", 3000);
var order2 = Object.assign({}, order);
console.log(order.id);
console.log(order.getPrice());
console.log(order.printOrder());
console.log("copy object");
console.log(order2.id);
// console.log(order2.getPrice()); // Object.assign () does not copy mehtods and prototypes
//# sourceMappingURL=q3.js.map