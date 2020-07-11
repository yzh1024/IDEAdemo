import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


public class demo {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        //put()添加
        map.put("亚瑟",23);
        map.put("妲己",18);
        map.put("后裔",33);
        map.put("鬼谷子",25);
        System.out.println(map);
        //remove()删除
        System.out.println(map.remove("后裔"));
        System.out.println(map);
        //get()获取
        System.out.println(map.get("妲己"));
        //containsKey()判断有没有
        System.out.println(map.containsKey("后裔"));

        //“键找值”遍历
        Set<String> key = map.keySet();
        for (String s : key) {
            System.out.println(s+map.get(s));
        }

        //键值对遍历
        Set<Map.Entry<String, Integer>> entry = map.entrySet();
        for (Map.Entry<String, Integer> stringIntegerEntry : entry) {
            System.out.println(stringIntegerEntry.getKey()+stringIntegerEntry.getValue());
        }


    }


}

