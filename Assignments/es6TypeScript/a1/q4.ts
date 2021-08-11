const a=["tom","jerry","spike","nibbles","Tyke"];
const objectMaker =(arry)=>{
    let arry2=[];
    for (const e of arry) {
        let objE = {name:e,length:e.length};
        arry2.push(objE);
    }
    return arry2;
}
console.log(a);
console.log(objectMaker(a));