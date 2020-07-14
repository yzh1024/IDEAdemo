package mai_piao;
/*
使用同步代码块来解决线程安全问题
 */
public class RunnableImpl1 implements Runnable {
    //定义一个多线程共享的票源
    private int ticket = 10;
    //创建一个锁对象
    Object obj = new Object();

    @Override
    public void run() {
        while (true) {
            //创建一个同步代码块
            synchronized (obj){
                if (ticket > 0) {
                    //票存在，卖票
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "--->正在卖第" + ticket + "张票");
                    ticket--;
                }
            }
        }
    }
}
