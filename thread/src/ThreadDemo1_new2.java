/*
    创建多线程程序的第二种方式：实现Runnable接口
 */
public class ThreadDemo1_new2 {
    public static void main(String[] args) {
        RunnableImpl run = new RunnableImpl();
        Thread t = new Thread(run);
        t.start();

        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName()+"--->"+i);
        }
    }


}
