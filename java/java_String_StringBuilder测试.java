package test;
public class java_String_StringBuilder测试 {
	public static void main(String[] args) {
	    //直接用拼接，可以理解成常量，每次修改重新构建对象
	    long begin = System.currentTimeMillis();
	    String str = "";
	    for(int i=0;i<30000;i++){
             str = str+i;
         }
        long end = System.currentTimeMillis();
        long time = end - begin;
        System.out.println("sting直接拼接："+time+"");
        
        //用string的concat拼接
        long begin1 = System.currentTimeMillis();
        String str1 = "";
        for(int i=0;i<30000;i++){
             str1 = str1.concat(Integer.toString(i));
         }
        long end1 = System.currentTimeMillis();
        long time1 = end1 - begin1;
        System.out.println("sting concat拼接："+time1+"");
        
        //用stringbuilder
        long begin2 = System.currentTimeMillis();
        StringBuilder sb2 = new StringBuilder();
        for(int i=0;i<30000;i++){
             sb2.append(i);
        }
        long end2 = System.currentTimeMillis();
        long time2 = end2 - begin2;
        System.out.println("stingbuilder："+time2+"");
        
        //用stringbuffer，线程安全的
        long begin3 = System.currentTimeMillis();
        StringBuffer sb3 = new StringBuffer();
        for(int i=0;i<30000;i++){
             sb3.append(i);
        }
        long end3 = System.currentTimeMillis();
        long time3 = end3 - begin3;
        System.out.println("stingbuffer："+time3+"");
	}
}
