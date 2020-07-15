package you_can_shuDemo2;

public class Main {
    public static void main(String[] args) {
        //使用匿名内部类
        invokeCalc(12, 20, new Calculator() {
            @Override
            public int calc(int a, int b) {
                return a + b;
            }
        });

        //使用Lambda表达式
        invokeCalc(12,20,(int a,int b)->{
            return a+b;
        });
    }

    public static void invokeCalc(int a, int b, Calculator c) {
        int sum = c.calc(a, b);
        System.out.println(sum);
    }
}
