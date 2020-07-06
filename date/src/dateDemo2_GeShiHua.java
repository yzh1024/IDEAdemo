import java.text.SimpleDateFormat;
import java.util.Date;

/*
使用DateFormat类中的方法，把日期格式转化为文本
使用步骤：
1、创建SimpleDateFormat对象，构造方法中传递指定的模式
2、调用SimpleDateFormat对象中的方法format，按照构造方法中的指定模式，把Date日期格式转化为符合
 */
public class dateDemo2_GeShiHua {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日，HH时mm分ss秒");
        Date d1 = new Date();
        String d2 = sdf.format(d1);
        System.out.println(d1);
        System.out.println(d2);
    }
}
