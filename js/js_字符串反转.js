// 可在控制台直接复制代码并查看
// 字符串反转
//1.通过for循环实现,劣势：定义了一些新的无需关心的变量
function reverse1(str) {
  var len = str.length;
  var newStr = "";
  for (i = 0; i < len; i+=1) {
    newStr = str.charAt(i) + newStr;
  }
  return newStr
};
//2.通过递归实现
function reverse2(str) {
  if (str.length === 1) {
    return str
  }
  return str.slice(-1) + reverse2(str.slice(0, -1))
}
//3.通过reduce实现
function reverse3(str) {
  return str.split('').reduce((prev, next) => next + prev)
}
//4.通过原生的split、reverse、join实现
function reverse4(str) {
  return str.split('').reverse().join('')
}