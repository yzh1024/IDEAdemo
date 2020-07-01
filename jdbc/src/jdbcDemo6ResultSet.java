import java.sql.*;

/*
 * 使用结果集对象ResultSet，调用其中的方法next()和getXxx()打印出查询结果
 * */
public class jdbcDemo6ResultSet {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            //1、注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            //2、定义SQL
            String sql = "select * from text";
            //3、获取Connection对象
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sqltext?characterEncoding=utf8", "root", "root");
            //4、获取执行SQL的对象statement
            stmt = conn.createStatement();
            //5、执行SQL
            rs = stmt.executeQuery(sql);
            //6、处理结果
            //循环判断游标是否是最后一行
            while (rs.next()) {
                //获取数据
                int id = rs.getInt(1);
                String name = rs.getString("name");
                int age = rs.getInt("age");
                String sex = rs.getString("sex");
                String address = rs.getString("address");
                int math = rs.getInt("math");
                int english = rs.getInt("english");
//                打印数据
                System.out.println(id + "\t" + name + "\t" + age + "\t" + sex + "\t" + address + "\t" + math + "\t" + english);
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            //7、释放资源
            //stmt.close();
            //避免空指针异常，先判断stmt是否为空
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

        }

    }
}
