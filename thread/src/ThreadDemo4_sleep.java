/*
    用Thread里面的sleep()方法暂停线程
    模拟秒表：
 */
public class ThreadDemo4_sleep {
    public static void main(String[] args) {
        for (int i = 1; i <= 60; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
