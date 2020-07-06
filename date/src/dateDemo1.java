import java.util.Date;

/*
Data类中常用的两种构造方法和一直成员方法
 */
public class dateDemo1 {
    public static void main(String[] args) {
        Date d1 = new Date();
        Date d2 = new Date(0);
        Date d3 = new Date(5000);
        System.out.println("当期时间："+d1);
        System.out.println("时间原点："+d2);
        System.out.println("从1970年1月1日 早上8点0分0秒 开始经历了5秒的时间"+d3);
        System.out.println("当前日期的毫秒数:"+System.currentTimeMillis());
        System.out.println("当前日期的毫秒数:"+new Date().getTime());
    }
}
