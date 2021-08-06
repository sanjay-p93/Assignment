//q1
function rectangle(width,height) {
    this.width = width;
    this.height = height;
    this.getDimension = function(){
        return "the width is "+this.width+" and hight is "+this.height;
    };
}
var rect1 = new rectangle(2,3);
var rect2 = new rectangle(8,13);
var p1 = document.getElementById("p1-1");
var p2 = document.getElementById("p2-1");
p1.innerHTML=rect1.getDimension();
p2.innerHTML=rect2.getDimension();
rect1.height=6;
rect1.width=9;
var p3 = document.getElementById("p3-1");
p3.innerHTML=rect1.getDimension();


//q2
rectangle.prototype.getArea = function() {
    var area=this.height*this.width;
    return "Area of this rectangle is " + area;
};
var p2 = document.getElementById("p2");
p2.innerHTML = rect1.getArea();


//Q3
var r = new rectangle(4,5);
r.hieght=50; // spelling error
var p3 = document.getElementById("p3");
p3.innerHTML = r.getArea() +" due to spelling error";


//Q4
var person ={firstName:"john",lastName:"rambo"};
var p1_4 = document.getElementById("p1-4");
p1_4.innerHTML=person.firstName+" "+person.lastName;
person.firstName="rocky";
var p2_4 = document.getElementById("p2-4");
p2_4.innerHTML=person.firstName+" "+person.lastName;


//Q5
var p1_5 = document.getElementById("p1-5");
p1_5.innerHTML=person.middlename;
person.middlename="john";
var p2_5 = document.getElementById("p2-5");
p2_5.innerHTML=person.middlename;


//Q6
var str6="{firstName:john,lastName:rambo}";
str6=str6.slice(1,str6.length-1)
var obj={};
for (poperty of str6.split(",")) {
    field=poperty.split(":")[0];
    value=poperty.split(":")[1];
    eval('obj.' + field + ' = "'+ value +'"');
}
var p6 = document.getElementById("p6");
p6.innerHTML=obj.firstName+" "+obj.lastName;

//Q7
obj = JSON.parse('{"firstName":"rocky", "lastName":"balboa"}');
var p7 = document.getElementById("p7");
p7.innerHTML=obj.firstName+" "+obj.lastName;