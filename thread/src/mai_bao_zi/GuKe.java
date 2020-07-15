package mai_bao_zi;

public class GuKe extends Thread {
    private BaoZi bz;

    public GuKe(BaoZi bz) {
        this.bz = bz;
    }

    @Override
    public void run() {
        while (true){
            synchronized (bz){
                if(bz.flag==false){
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                //被唤醒之后执行吃包子
                System.out.println("吃货正在吃:"+bz.pi+bz.xian+"包子");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                bz.flag=false;
                bz.notify();
                System.out.println(bz.pi+bz.xian+"的包子已经吃完了，再来一个");
                System.out.println("---------------------------------");
            }
        }
    }
}
