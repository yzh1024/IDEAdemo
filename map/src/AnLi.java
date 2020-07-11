
import java.util.HashMap;
import java.util.Scanner;

/*
计算一个字符串中每个字符出现的次数
要求：使用map集合存储
 */
public class AnLi {
    public static void main(String[] args) {
        //输入字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.nextLine();
        //创建HashMap集合并put
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : str.toCharArray()) {
            if(map.containsKey(c)){
                Integer num = map.get(c);
                map.put(c,++num);
            }else {
                map.put(c,1);
            }
        }
        //遍历集合
        for (Character c : map.keySet()) {
            System.out.println(c+"="+map.get(c));
        }
    }
}
