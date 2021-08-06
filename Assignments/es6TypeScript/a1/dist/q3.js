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
console.log(order.printOrder());
console.log(order.getPrice());
//# sourceMappingURL=q3.js.map