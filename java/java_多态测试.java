/**
 * 使用父类类型的引用指向子类的对象
 * 该引用调用的是父类中定义的方法和变量（如果方法和变量没有重写）
 * 如果子类中重写了父类中的一个方法，将会调用子类中的这个方法；
 * 注意特殊情况，如果该父类引用所调用的方法参数列表未定义，就调用该父类的父类中查找，如果还没找到就强制向上类型转换参数列表中的参数类型，
 * 具体优先级高到低依次如下：（确定this，再按照顺序查找）
 * this.show(O)、super.show(O)、this.show((super)O)、super.show((super)O)
 */
package test;
public class java_多态测试{
    public static void main(String[] args) {
        A a1 = new A();//this为a1，类型为A
        // 父类类型的引用指向子类的对象
        A a2 = new B();//this为a2，类型为A
        B b = new B(); //this为b，类型为B
        C c = new C(); //this为c，类型为C
        D d = new D(); //this为d，类型为D
        
        System.out.println(a1.show(b));// A and A
        System.out.println(a1.show(c));// A and A
        System.out.println(a1.show(d));// A and D
        System.out.println("-------------------");
        System.out.println(a2.show(b));// B and A
        System.out.println(a2.show(c));// B and A
        System.out.println(a2.show(d));// A and D
        System.out.println("-------------------");
        System.out.println(b.show(b));// B and B
        System.out.println(b.show(c));// B and B
        System.out.println(b.show(d));// A and D
    }
}
class A {
    public String show(D obj){
        return ("A and D");
    } 
    public String show(A obj){
        return ("A and A");
    } 
} 
class B extends A{
    public String show(B obj){
        return ("B and B");
    }
    public String show(A obj){
        return ("B and A");
    } 
}
class C extends B{} 
class D extends B{} 

