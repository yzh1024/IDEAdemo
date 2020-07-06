import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
/*
练习：
    使用日期时间相关的API，计算一个人已经出生了多少天
分析：
    1、使用Scanner类中的方法next，获取出生日期
    2、使用DateFormat类中的方法parse，把字符串中的出生日期，解析为Date格式的出生日期
    3、把Date格式的出生日期转换为毫秒值
    4、获取当前的日期，转换为毫秒值
    5、当前日期的毫秒值减去出生日期的毫秒值
    6、把毫秒的差值值转换为天
 */
public class deteDemo4_AnLi {
    public static void main(String[] args) throws ParseException {
//        1、使用Scanner类中的方法next，获取出生日期
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的出生日期，格式（yyyy-MM-dd）");
        String birthdayDateString = sc.next();
//        2、使用DateFormat类中的方法parse，把字符串中的出生日期，解析为Date格式的出生日期
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date birthdayDate = sdf.parse(birthdayDateString);
//        3、把Date格式的出生日期转换为毫秒值
        long birthdayDateTime = birthdayDate.getTime();
//        4、获取当前的日期，转换为毫秒值
        long todatTime = new Date().getTime();
//        5、当前日期的毫秒值减去出生日期的毫秒值
        long time = todatTime-birthdayDateTime;
//        6、把毫秒的差值转换为天
        System.out.println(time/1000/60/60/24);
    }
}
