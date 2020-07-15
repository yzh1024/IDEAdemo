package mai_bao_zi;

public class BaoZiPu extends Thread {
    private BaoZi bz;

    public BaoZiPu(BaoZi bz) {
        this.bz = bz;
    }

    //生产包子
    @Override
    public void run() {
        int count = 0;

        while (true) {
            synchronized (bz) {
                if (bz.flag == true) {//有包子
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                //被唤醒之后被执行：生产包子（两种包子）
                if (count % 2 == 0) {
                    //生产薄皮三鲜馅包子
                    bz.pi = "薄皮";
                    bz.xian = "三鲜馅";
                } else {
                    //生产冰皮牛肉大葱馅包子
                    bz.pi = "冰皮";
                    bz.xian = "牛肉大葱馅";
                }
                count++;
                System.out.println("包子铺正在生产：" + bz.pi + bz.xian + "包子");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //包子生产好了之后，包子状态改为有
                bz.flag = true;
                //唤醒吃货线程，让吃货线程吃包子
                bz.notify();
                System.out.println("包子铺已经生产好了：" + bz.pi + bz.xian + "包子，可以吃啦");
            }
        }

    }
}
