import java.sql.*;
/*
* 插入记录
* */
public class jdbcDemo2Insert {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        try {
            //1、注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            //2、定义SQL
            String sql = "insert into text values(null,'妲己',22,'女','深圳',88,88)";
            //3、获取Connection对象
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sqltext?characterEncoding=utf8","root","root");
            //4、获取执行SQL的对象statement
            stmt = conn.createStatement();
            //5、执行SQL
            int count = stmt.executeUpdate(sql);//影响的行数
            //6、处理结果
            System.out.println(count);
            if(count>0){
                System.out.println("添加成功");
            }else {
                System.out.println("添加失败");
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            //7、释放资源
            //stmt.close();
            //避免空指针异常，先判断stmt是否为空
            if(stmt !=null){
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(conn !=null){
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

        }

    }
}
