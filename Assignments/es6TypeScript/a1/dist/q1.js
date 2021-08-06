var ItemDetails = /** @class */ (function () {
    function ItemDetails(name, id) {
        this.name = name;
        this.id = id;
    }
    return ItemDetails;
}());
var x = 100;
//x=1000;  //Cannot assign to 'x' because it is a constant.ts(2588)
var item = new ItemDetails("table", 1);
//item=new ItemDetails("chair",100); //Cannot assign to 'item' because it is a constant.ts(2588)
console.log("vaue of x is " + x);
console.log("the item is " + item.id + " : " + item.name);
//# sourceMappingURL=q1.js.map