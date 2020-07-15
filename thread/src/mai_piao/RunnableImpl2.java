package mai_piao;

/*
方法二：使用同步方法来解决线程安全问题
 */
public class RunnableImpl2 implements Runnable {
    //定义一个多线程共享的票源
    private int ticket = 10;

    @Override
    public void run() {
        while (true) {
            payTickrt();
        }
    }

    public synchronized void payTickrt(){
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
