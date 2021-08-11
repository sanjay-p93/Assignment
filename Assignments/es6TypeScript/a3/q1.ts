const generateX = new Promise<number>((resolve, reject) => {
    resolve(Math.floor((Math.random() * 100) + 1));
});
const generateY = new Promise<number>((resolve, reject) => {
    resolve(Math.floor((Math.random() * 100) + 1));
});

Promise.all([generateX,generateY])
    .then((generated:number[])=>console.log(generated[0]+generated[1]));