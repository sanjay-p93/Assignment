var generateX = new Promise(function (resolve, reject) {
    resolve(Math.floor((Math.random() * 100) + 1));
});
var generateY = new Promise(function (resolve, reject) {
    resolve(Math.floor((Math.random() * 100) + 1));
});
Promise.all([generateX, generateY])
    .then(function (generated) { return console.log(generated[0] + generated[1]); });
//# sourceMappingURL=q1.js.map