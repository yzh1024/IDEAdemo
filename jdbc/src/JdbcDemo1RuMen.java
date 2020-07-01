import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*
* JDBC快速入门
* */
public class JdbcDemo1RuMen {
    public static void main(String[] args) throws Exception {
        //1、导入驱动jar包
        //2、注册驱动
        Class.forName("com.mysql.jdbc.Driver");
        //3、获取数据库的连接对象
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sqltext","root","root");
        //4、定义SQL语句
        String sql = "update text set english = 99 where id = 1";
        //5、获取执行SQL的对象
        Statement stmt = conn.createStatement();

        //6、执行SQL语句
        int count = stmt.executeUpdate(sql);
        //7、处理结果
        System.out.println(count);
        //8、释放资源
        stmt.close();
        conn.close();
    }
}
