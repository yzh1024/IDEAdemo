/*
    设置线程的名称
 */
public class ThreadDemo3_setName {
    public static void main(String[] args) {
        //1、在线程创建之后设置线程的名称
        MyThread a = new MyThread();
        a.setName("a");
        //2、在线程创建时，通过构造放方法设置线程的名称
        MyThread b = new MyThread("b");

        System.out.println("a线程的名称是："+a.getName());
        System.out.println("b线程的名称是："+b.getName());
    }


}
