import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
增强for循环
 */
public class iteratorDemo2_qiangFor {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        for (Integer i : list) {
            System.out.println(i);
        }
    }
}
