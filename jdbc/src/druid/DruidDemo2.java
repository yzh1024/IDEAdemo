package druid;

import druidutils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/*
使用Druid工具类完成一个添加的操作，给数据库sqltext中的
 */
public class DruidDemo2 {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        try {
            //1、获取连接
            conn = JDBCUtils.getConnection();
            //2、定义sql
            String sql = "insert into user values(null,?,?)";
            //3、获取pstmt对象
             pstmt = conn.prepareStatement(sql);
            //4、给问号赋值
            pstmt.setString(1,"王五");
            pstmt.setString(2,"888888");
            //5、执行SQL
            int count = pstmt.executeUpdate();
            System.out.println(count);

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            //6、释放资源
            JDBCUtils.close(pstmt,conn);
        }
    }
}
