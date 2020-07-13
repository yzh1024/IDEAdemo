import java.util.Objects;

public class requireNonNullDemo {
    public static void main(String[] args) {
        int[] a = null ;
        method1(a);
    }


    public static void method1(int[] a) {
//        Objects.requireNonNull(a);
        Objects.requireNonNull(a,"参数是空的");
    }


}
