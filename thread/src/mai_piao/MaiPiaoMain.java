package mai_piao;

//通过三个窗口卖一张票的案例来体现线程安全问题
public class MaiPiaoMain {
    public static void main(String[] args) {
        RunnableImpl1 run = new RunnableImpl1();
        Thread t0 = new Thread(run);
        Thread t1 = new Thread(run);
        Thread t2 = new Thread(run);
        t0.start();
        t1.start();
        t2.start();
    }
}
