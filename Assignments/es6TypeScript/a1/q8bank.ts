import c from './q8current'
import s from './q8savings'

let acc1= new c(10001,"john",35000,1000);
let acc2= new c(10002,"james",20000,3000);
let acc3= new s(10003,"jane",25000,true,5);
let acc4= new s(10004,"sarah",20000,false,6);

acc1.withDraw(10000);
acc3.withDraw(5000);

let accList=[acc1,acc2,acc3,acc4];
let totalBalance=0;
for (let acc of accList) {
    totalBalance+=acc.getBanlance();
}
console.log(totalBalance);