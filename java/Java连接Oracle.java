/**
 * java连接oracle标准写法
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Java连接Oracle {
    public static void main(String[] args) {
        // TODO Auto-generated method stub       
        Connection conn = null;
        PreparedStatement prestmt = null;
        ResultSet result = null;// 创建一个结果集对象
        try {
            //第一步：加载数据库驱动，不同数据库驱动程序不同；
            Class.forName("oracle.jdbc.driver.OracleDriver");//字符串为oracledriver路径
            //第二步，得到数据库连接；
            String url = "jdbc:oracle:thin:@127.0.0.1:1521:ORCL";   //ip、计算机名或者localhost(127.0.0.1)
            conn = DriverManager.getConnection(url, "wang01", "css");//url、用户名、密码
            System.out.println(conn.hashCode());
            
         /*   //插入数据,sql可以现在数据库执行，看是否合理可用
            prestmt = conn.prepareStatement("insert into emp (empno,ename,age) values (?,?,?)");
            prestmt.setString(1, "006");
            prestmt.setString(2, "零六");
            prestmt.setInt(3, 16);
            prestmt.executeUpdate();*/
            
        /*  //删除数据,sql可以现在数据库执行，看是否合理可用
            prestmt = conn.prepareStatement("delete from emp where empno='006'");
            prestmt.executeUpdate();*/
            
            
            //第三步，创建prestmt，执行sql语句
            //statement每次都编译sql，效率低下；
            //用preparement用占位符方式传递参数，不用每次编译sql，性能提高
            prestmt = conn.prepareStatement("select * from emp");
//            prestmt = conn.prepareStatement("select * from emp where empno=?");
            
            //第四步，取得结果集
//            prestmt.setString(1, "001");
            result = prestmt.executeQuery();
            while (result.next()){//如果有，返回true，指向下一个；没有返回true
             // 当结果集不为空时
                String empno = result.getString("empno");
                String ename = result.getString("ename");
                String age = result.getString("age");
                System.out.println(empno + "," + ename + "," + age);
            }      
        
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally{ //建立连接的connection必须关掉
            try {
                // 逐一将上面的几个对象关闭，因为不关闭的话会影响性能、并且占用资源
                // 注意关闭的顺序，最后使用的最先关闭
                if (result != null)
                    result.close();
                if (prestmt!= null) {
                    prestmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
