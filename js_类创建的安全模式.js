// 控制台执行，查看执行结果
// new的作用是对当前对象的this不停赋值，没有用new当前环境为全局变量
var Book = function(title,time,type){
	// 判断this是否为当前对象（如果是，说明是new创建的）
	if (this instanceof Book) {
		debugger;
		this.title = title;
		this.time = time;
		this.type = type;
	} else {
		debugger;
		return new Book(title,time,type);
	}
}

var book = Book("Javascript","2014","js");
console.log(book);
console.log(book.title);
console.log(window.title);