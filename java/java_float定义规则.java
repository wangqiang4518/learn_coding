package test;
public class java_float定义规则{
    public static void main(String[] args) {
        float f=0.5f;//必须加f，否则会丢失精度（0.5默认为double类型）
        double d = 3.4;
        System.out.println(f);
        System.out.println(d);
    }
}