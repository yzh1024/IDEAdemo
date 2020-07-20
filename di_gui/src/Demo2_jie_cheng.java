/*
练习：使用递归求阶乘
    n的阶乘：n! = n*(n-1)*(n-2)*...3*2*1
 */
public class Demo2_jie_cheng {
    public static void main(String[] args) {
        System.out.println(jiecheng(4));
    }

    private static int jiecheng(int n) {
        //递归结束的条件
        if(n==1){
            return 1;
        }
        return n*jiecheng(n-1);
    }

}
