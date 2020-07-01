import util.JDBCUtils;

import java.sql.*;
import java.util.Scanner;

/*
 * 案例：
 * 1、通过键盘录入用户名和密码
 * 2、判断用户是否登录成功
 * */
public class jdbcDemo9SignIn {
    public static void main(String[] args) {
        //1、键盘录入，接受用户名和密码
        Scanner sc = new Scanner(System.in);
        String name;
        String password;
        System.out.println("请输入用户名：");
        name = sc.next();
        System.out.println("请输入密码");
        password = sc.next();
        boolean flag = login(name, password);
        if(flag){
            System.out.println("登陆成功");
        }else{
            System.out.println("用户名或密码错误");
        }

       /* Scanner sc = new Scanner(System.in);
        String name;
        String password;
        System.out.println("请输入用户名：");
        name = sc.next();
        System.out.println("请输入密码");
        password = sc.next();
        Statement stmt = null;
        Connection conn = null;
        ResultSet rs = null;

        try {
            JDBCUtils.getConnection();
            String sql = "select name from user where name ='"+name+"'" ;
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            System.out.println(rs.next());

        } catch (SQLException e) {
            e.printStackTrace();
        }*/
    }

    public static boolean login(String username, String password) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        if (username == null || password == null) {
            return false;
        }
        //连接数据库判断是否登录成功
        try {
        //1、获取连接
            conn = JDBCUtils.getConnection();
            //2、定义SQL
            String sql ="select * from user where name = '"+username+"'and password = '"+password+"'";
            //3、获取执行SQL对象
             stmt = conn.createStatement();
            //4、执行查询
            rs = stmt.executeQuery(sql);
            //5、判断
            return rs.next();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.close(rs,stmt,conn);
        }

        return true;
    }
}
