
public class Demo1 {
    public static void main(String[] args) {
        a();
    }

    private static void a() {
        System.out.println("a方法");
        a();
    }
}
