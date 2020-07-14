public class demo {
    public static void main(String[] args) {
        MyThread a = new MyThread();
        System.out.println(a.getName());
        System.out.println(Thread.currentThread().getName());

/*  a.setName("a线程");
        a.start();
        MyThread b = new MyThread("b线程");
        b.start();*/
    }
}