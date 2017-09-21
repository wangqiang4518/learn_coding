package test;
public class java_for执行顺序{
    public static void main(String[] args) {
        int tol = 2;
        int i = 0;
        for (foo("A");i<tol ;foo("B")) {
            i++;
            foo("D");
        }
    }
    public static void foo(String ss) {
        System.out.println(ss);
    }
}