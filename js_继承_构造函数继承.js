// 构造函数式继承
// 采用call改变执行环境,是的子类变量在父类执行一遍
// 没有涉及prototype，公共方法也不能共用
function SuperClass(id){
	debugger;
	this.books = ["javascript","html","css"];
	this.id = id;
}
SuperClass.prototype.showBooks = function(){
	console.log(this.books);
}
function SubClass(id){
	// 构造函数继承精华；继承父类，将子类中变量在父类中执行一遍；
	SuperClass.call(this,id);
}
var instance1 = new SubClass(10);
var instance2 = new SubClass(11);
debugger;
instance1.books.push("aaaa");
console.log(instance1.books);
console.log(instance1.id);
console.log(instance2.books);
console.log(instance2.id);

console.log(instance1.showBooks);