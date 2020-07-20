/*
练习：使用递归求解1-n的和（1+2+3+...+n）
 */
public class Demo1_qiu_he {
    public static void main(String[] args) {
        System.out.println(sum(100));
    }

    private static int sum(int n) {
        //递归结束的条件
        if(n==1){
            return 1;
        }
        return n + sum(n-1);
    }

}
