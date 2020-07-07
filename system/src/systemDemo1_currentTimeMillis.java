/*
验证for循环打印数字1-99999所需要的时间（毫秒）
 */
public class systemDemo1_currentTimeMillis {
    public static void main(String[] args) {
        long s = System.currentTimeMillis();
        for (int i = 0; i < 99999; i++) {
            System.out.println(i);
        }
        long e = System.currentTimeMillis();
        System.out.println("程序共耗时:"+(e-s)+"毫秒");
    }
}
