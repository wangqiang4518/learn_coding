// 组合式继承 融合类式继承和构造函数继承优势
// 类式继承：可以共用属性和方法；构造函数继承：执行一遍父类构造函数；
// 缺点：父类构造函数执行两次
function SuperClass(name){
	debugger;
	this.name = name;
	this.books = ["javascript","html","css"];
}
SuperClass.prototype.getName = function(){
	console.log(this.name);
}
function SubClass(name,time){
	// 在子类上执行父类构造函数
	SuperClass.call(this,name);
	this.time = time;
}
// 类式继承，子类原型为父类实例
SubClass.prototype = new SuperClass();

var instance1 = new SubClass("js book","2014");
instance1.books.push("aaa");
console.log(instance1.books);
instance1.getName();
debugger;
var instance2 = new SubClass("css book","2013");
console.log(instance2.books);
instance2.getName();
