import c3p0util.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/*
转账案例：
事务操作
 */
public class jdbcDemo11MoveMoney {
    public static void main(String[] args) {
        Connection conn= null;
        PreparedStatement pstmt1 = null;
        PreparedStatement pstmt2 = null;
        try {
            //获取连接
            conn = JDBCUtils.getConnection();
            //开启事务
            conn.setAutoCommit(false);
            //定义SQL
            String sql1 = "update move_money set money = money - ?  where id = ?";
            String sql2 = "update move_money set money = money + ?  where id = ?";
            //获取执行SQL的对象
             pstmt1 = conn.prepareStatement(sql1);
             pstmt2 = conn.prepareStatement(sql2);
             //设置参数
             pstmt1.setDouble(1,500);
             pstmt1.setDouble(2,1);
             pstmt2.setDouble(1,500);
             pstmt2.setDouble(2,2);
            pstmt1.executeUpdate();
            pstmt2.executeUpdate();
            conn.commit();
        } catch (Exception e) {
            e.printStackTrace();
            try {
                conn.rollback();
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
        }finally {
            JDBCUtils.close(pstmt1,conn);
            JDBCUtils.close(pstmt2,null);
        }
    }
}
