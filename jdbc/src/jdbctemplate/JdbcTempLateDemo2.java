package jdbctemplate;

import domain.User;
import druidutils.JDBCUtils;
import org.junit.Test;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public class JdbcTempLateDemo2 {

    private JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSourse());

    //Junit单元测试，可以让方法独立执行

    /**
     * 1、修改1号数据的密码为123456
     */
    @Test
    public void text1() {
        //1、获取JDBCTample对象(已经定义为成员变量了)
        //2、定义SQL
        String sql = "update user set password = ? where id = ?";
        //3、执行SQL
        int count = template.update(sql, "123456", 1);
        System.out.println(count);
    }


    /**
     * 2、添加一条记录
     */
    @Test
    public void text2() {
        //1、获取JDBCTample对象
        //2、定义SQL
        String sql = "insert into user(姓名,账号) values(?,?)";
        //3、执行SQL
        int count = template.update(sql, "亚瑟","000" );
        System.out.println(count);
    }


    /**
     * 3、删除刚才添加的记录
     */
    @Test
    public void text3() {
        //1、获取JDBCTample对象
        //2、定义SQL
        String sql = "delete from  user where id = ?";
        //3、执行SQL
        int count = template.update(sql, 6);
        System.out.println(count);
    }


    /**
     * 4、查询id为1的记录，将
     * 其封装为Map对象
     * 注意：这个方法查询的结果集长度只能为一，也就是说只能封装一条记录，所以SQL语句只能查询一条记录
     */
    @Test
    public void text4() {
        //1、获取JDBCTample对象
        //2、定义SQL
        String sql = "select * from user where id = ?";
        //3、执行SQL
        Map<String, Object> map = template.queryForMap(sql,1);
        System.out.println(map);
    }


    /**
     * 5、查询所有记录，将其封装为List
     * 将每一条记录封装为一个Map集合，再将Map集合装载到List集合中
     */
    @Test
    public void text5() {
        //1、获取JDBCTample对象
        //2、定义SQL
        String sql = "select * from user ";
        //3、执行SQL
        List<Map<String, Object>> list = template.queryForList(sql);
        //生成循环的快捷键：iter
        for (Map<String, Object> stringObjectMap : list) {
            System.out.println(stringObjectMap);
        }
    }


    /**
     * 6、查询所有记录，将其封装为User对象的List集合（常用）
     * 下面有两个方法，推荐用第二个text6_2
     */
    @Test
    public void text6_1() {
        //1、获取JDBCTample对象
        //2、定义SQL
        String sql = "select * from user ";
        //3、执行SQL
        List<User> list = template.query(sql, new RowMapper<User>() {
            @Override
            public User mapRow(ResultSet resultSet, int i) throws SQLException {
                User user = new User();
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String password = resultSet.getString("password");

                user.setId(id);
                user.setName(name);
                user.setPassword(password);
                return user;
            }
        });
        for (User user : list) {
            System.out.println(user);
        }
    }
    @Test
    public void text6_2() {
        String sql = "select * from user ";
        List<User> list = template.query(sql, new BeanPropertyRowMapper<User>(User.class));
        for (User user : list) {
            System.out.println(user);
        }
        //注意：执行可能会报错，因为基本数据类型不能赋值为null。需要将其改为对应的封装类
        //如：int-->Integer、double-->Double
    }


    /**
     * 7、查询总记录数
     */
    @Test
    public void text7() {
        String sql = "select count(id) from user";
        Long total = template.queryForObject(sql, Long.class);
        //template中的queryForObject方法一般用于聚合函数的查询
        System.out.println(total);
    }


}
