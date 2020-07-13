/*
    创建多线程程序的第一种方式：创建Thread类的子类
 */
public class ThreadDemo1 {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        for (int i = 0; i < 20; i++) {
            System.out.println("main:"+i);
        }
    }


}
