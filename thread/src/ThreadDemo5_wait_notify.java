/*
用买卖包子的案例来说明等待唤醒
 */
public class ThreadDemo5_wait_notify {
    public static void main(String[] args) {
        //创建锁对象，以保证唯一
        Object obj = new Object();

        //创建一个顾客线程（消费者）
        new Thread(new Runnable() {
            @Override
            public void run() {
                //保证等待和唤醒的线程只有一个执行，需要使用同步技术
                synchronized (obj){
                    System.out.println("顾客：告知老板需要包子的种类和数量");
                    try {
                        //进入无限等待状态
                        obj.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    //唤醒之后执行的代码
                    System.out.println("顾客：谢谢老板，我开始吃包子了");
                }
            }
        }).start();

        //创建一个老板线程（生产者）
        new Thread(new Runnable() {
            @Override
            public void run() {
                //做包子5秒钟
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                //保证等待和唤醒的线程只有一个执行，需要使用同步技术
                synchronized (obj){
                    System.out.println("老板：5秒后做好了包子");
                    //唤醒顾客
                    obj.notify();
                }
            }
        }).start();
    }
}
