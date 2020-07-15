package mai_piao;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
方法三：使用Lock锁来解决线程安全问题
 */
public class RunnableImpl3 implements Runnable {
    //定义一个多线程共享的票源
    private int ticket = 10;
    //创建一个ReentrantLock对象
    Lock l = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            l.lock();
            if (ticket > 0) {
                //票存在，卖票
                try {
                    Thread.sleep(10);
                    System.out.println(Thread.currentThread().getName() + "--->正在卖第" + ticket + "张票");
                    ticket--;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    l.unlock();//无论程序是否异常，锁对象都会被释放掉
                }
            }
        }
    }


}
