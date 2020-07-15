package you_can_shuDemo1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Persion[] arr = {
                new Persion("张三", 32),
                new Persion("李四", 18),
                new Persion("王五", 21),
        };
/*常规方法
        Arrays.sort(arr, new Comparator<Persion>() {
            @Override
            public int compare(Persion o1, Persion o2) {
                return o2.getAge() - o1.getAge();
            }
        });
*/

//使用Lambda简化书写
        Arrays.sort(arr,(Persion o1, Persion o2) -> o2.getAge()-o1.getAge());

        for (Persion p : arr) {
            System.out.println(p);
        }
    }
}
