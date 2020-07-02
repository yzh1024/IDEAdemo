package jdbctemplate;

import org.springframework.jdbc.core.JdbcTemplate;
import utils.JDBCUtils;

/*
JdbcTempLate入门
 */
public class JdbcTempLateDemo1 {
    public static void main(String[] args) {
    //1、导入jar包
    //2、创建JDBCTemplate对象
    JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSourse());
    //3、调用方法
        String sql = "update user set password = ? where name = ?";
        int count = template.update(sql,"000000","王五");
        System.out.println(count);

    }
}
