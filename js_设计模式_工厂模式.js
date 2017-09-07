//直接在控制台粘贴，查看运行过程
// 安全模式创建工厂类
var Factory = function(type,content){
	if (this instanceof Factory) {
		debugger;
		// this["Java"]==this.Java,访问属性，当type为变量时，采用this[type]
		var s = new this[type](content);
		return s;
	} else {
		debugger;
		return new Factory(type,content);
	}
}
// 工厂原型中设置创建所有类型数据对象的基类
Factory.prototype = {
	Java : function(content){
		debugger;
		this.content = content;
		(function(content){
			console.log("Java:"+content);
		})(content);
	},
	C : function(content){
		debugger;
		this.content = content;
		(function(content){
			console.log("C:"+content);
		})(content);
	},
	JavaScript : function(content){
		debugger;
		this.content = content;
		(function(content){
			console.log("JavaScript:"+content);
		})(content);
	}
}
Factory("C","ccccc");