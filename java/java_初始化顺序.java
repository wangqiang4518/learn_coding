/**
 * 静态代码块在jvm加载类模板的时候自动被执行
 * 类的成员变量和构造函数在实例化时初始化，成员变量先初始化
 */
package test;
public class java_初始化顺序{
    public static void main(String[] args) {
        final int a = Father.fint_stact;
        int a1 = Son.fint_stact;
        String s = Son.sstr_static;
        Son son = new Son();
    }
}
class Son extends Father{
    int sint = 1;
    String sstring = "sss";
    static int sint_stact = 1;
    static String sstr_static = "sstatic";
    public Son(){
        int sint_gz = 2;
    }
}
class Father{
    int fint = 10;
    String fstring = "sss0";
    static int fint_stact = 10;
    static String fstr_static = "sstatic";
    public Father(){
        int sint_gz = 20;
    }
}