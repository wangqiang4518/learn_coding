/* -- 类式继承,对子类的原型用父类实例化；
可在控制台直接执行观察输出 -- */
// 声明父类
function SuperClass(){
	debugger;
	this.superValue = true;
	this.books = ["javascript","html","css"];
}
// 为父类添加共有方法
SuperClass.prototype.getSuperValue = function(){
	return this.superValue;
}
// 声明子类
function SubClass(){
	this.subValue = false;
}

// 继承父类
SubClass.prototype = new SuperClass();
// 为子类添加共有方法
SubClass.prototype.getSubValue = function(){
	return this.subValue;
}

var instance1 = new SubClass();
var instance2 = new SubClass();
console.log(instance1.getSuperValue());
console.log(instance1.getSubValue());

console.log(instance1 instanceof SuperClass);
console.log(instance1 instanceof SubClass);
console.log(SubClass instanceof SuperClass);	// 子类的原型为父类实例
console.log(SubClass.prototype instanceof SuperClass);

console.log(instance2.books);
instance1.books.push("aaaaaa");
console.log(instance2.books);