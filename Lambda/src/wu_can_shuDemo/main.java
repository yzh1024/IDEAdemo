package wu_can_shuDemo;

public class main {
    public static void main(String[] args) {
        //使用匿名内部类常规做法
        invokeCook(new Cook() {
            @Override
            public void makeFood() {
                System.out.println("吃饭了");
            }
        });
        //使用Lambda表达式，简化匿名内部类
        invokeCook(() -> {
            System.out.println("吃饭了");
        });
    }

    public static void invokeCook(Cook cook) {
        cook.makeFood();
    }
}
