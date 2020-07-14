/*
    使用匿名内部类的方式实现线程的创建
 */
public class ThreadDemo1_new3 {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                    System.out.println(Thread.currentThread().getName());
            }
        }).start();
    }


}
