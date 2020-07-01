import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/*
 * 定义一个方法，查询text表的数据，将其封装为对象，然后装载集合，返回
 * */
public class jdbcDemo7 {
    public static void main(String[] args) {
        List<jdbcDemo7Text> list  = new jdbcDemo7().findAll();
        System.out.println(list);
    }

    public List<jdbcDemo7Text> findAll() {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        List<jdbcDemo7Text> list = null;
        try {
            //1、注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            //2、获取连接
            conn = DriverManager.getConnection("jdbc:mysql:///sqltext", "root", "root");
            //3、定义SQL
            String sql = "select * from text";
            //4、获取执行SQL对象
            stmt = conn.createStatement();
            //5、执行SQL
            rs = stmt.executeQuery(sql);
            //6、遍历结果集，封装对象，装载集合
            jdbcDemo7Text text = null;
            list = new ArrayList<jdbcDemo7Text>();
            while (rs.next()) {
                int id = rs.getInt(1);
                String name = rs.getString("name");
                int age = rs.getInt("age");
                String sex = rs.getString("sex");
                String address = rs.getString("address");
                int math = rs.getInt("math");
                int english = rs.getInt("english");
                //创建jdbcDemo7Text对象,并赋值
                text = new jdbcDemo7Text();
                text.setId(id);
                text.setName(name);
                text.setAge(age);
                text.setSex(sex);
                text.setAddress(address);
                text.setMath(math);
                text.setEnglish(english);
                //装载集合
                list.add(text);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                try {
                    rs.close();
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
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return list;
    }
}
