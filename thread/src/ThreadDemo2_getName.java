/*
    获取线程的名称
 */
public class ThreadDemo2_getName {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        //1、直接使用Thread里面的的getName()获取线程名称
        System.out.println("mt线程的名称是："+mt.getName());
        //2、先获取当前正在执行的线程，然后通过getName()获取线程名称
        System.out.println("main线程的名称是："+Thread.currentThread().getName());
    }

}
