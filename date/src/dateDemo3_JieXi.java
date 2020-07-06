import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
使用DateFormat类中的方法parse，把文本解析为日期
使用步骤：
1、创建SimpleDateFormat对象，构造方法中传递指定的模式
2、调用SimpleDateFormat对象中的方法parse，把符合构造方法中模式的字符串，解析为Date日期
注意：
public Date parse（String source）throws ParseException
parse方法声明了一个异常叫ParseException
如果字符串和构造方法的模式不一样，那么程序就会抛出此异常
调用一个抛出异常的方法，就必须处理这个异常，要么throws继续抛出这个异常，要么try catch自己处理
 */
public class dateDemo3_JieXi {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日，HH时mm分ss秒");
        Date d1 = sdf.parse("2020年07月06日，14时47分33秒");
        System.out.println(d1);
    }
}
