import org.omg.CORBA.INTERNAL;

import java.beans.IntrospectionException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
计算一个字符串中每个字符出现的次数
要求：使用map集合存储
 */
public class AnLi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str = sc.nextLine();
        //创建HashMap集合
        Map<Character, Integer> map = new HashMap<>();
        for (char c : str.toCharArray()) {
            if (map.containsKey(c)) {
                Integer num = map.get(c);
                map.put(c, ++num);
            } else {
                map.put(c, 1);
            }
        }
        //遍历输出
        for (Character c : map.keySet()) {
            System.out.println(c + "=" + map.get(c));
        }
    }
}
