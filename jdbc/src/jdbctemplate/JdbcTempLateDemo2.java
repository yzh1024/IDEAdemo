package jdbctemplate;

import druidutils.JDBCUtils;
import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;

public class JdbcTempLateDemo2 {

   //Junit单元测试，可以让方法独立执行

    /**
     * 1、修改1号数据的密码为123456
     */
    @Test
    public void text1(){
        //1、获取JDBCTample对象
        JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSourse());
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
    public void text2(){
        //1、获取JDBCTample对象
        JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSourse());
        //2、定义SQL
        String sql = "update user set password = ? where id = ?";
        //3、执行SQL
        int count = template.update(sql, "123456", 1);
        System.out.println(count);
    }


    /**
     * 3、删除刚才添加的记录
     */
    @Test
    public void text3(){
        //1、获取JDBCTample对象
        JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSourse());
        //2、定义SQL
        String sql = "update user set password = ? where id = ?";
        //3、执行SQL
        int count = template.update(sql, "123456", 1);
        System.out.println(count);
    }


    /**
     * 4、查询id为1的记录，将其封装为Map对象
     */
    @Test
    public void text4(){
        //1、获取JDBCTample对象
        JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSourse());
        //2、定义SQL
        String sql = "update user set password = ? where id = ?";
        //3、执行SQL
        int count = template.update(sql, "123456", 1);
        System.out.println(count);
    }




    /**
     * 5、查询所有记录，将其封装为List
     */
    @Test
    public void text5(){
        //1、获取JDBCTample对象
        JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSourse());
        //2、定义SQL
        String sql = "update user set password = ? where id = ?";
        //3、执行SQL
        int count = template.update(sql, "123456", 1);
        System.out.println(count);
    }


    /**
     * 6、查询所有记录，将其封装为Emp对象的List集合
     */
    @Test
    public void text6(){
        //1、获取JDBCTample对象
        JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSourse());
        //2、定义SQL
        String sql = "update user set password = ? where id = ?";
        //3、执行SQL
        int count = template.update(sql, "123456", 1);
        System.out.println(count);
    }


    /**
     * 7、查询总记录数
     */
    @Test
    public void text7(){
        //1、获取JDBCTample对象
        JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSourse());
        //2、定义SQL
        String sql = "update user set password = ? where id = ?";
        //3、执行SQL
        int count = template.update(sql, "123456", 1);
        System.out.println(count);
    }


}
