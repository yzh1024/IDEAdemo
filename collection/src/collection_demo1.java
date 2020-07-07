import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

/*
Collection中常用的共性方法：
add()添加元素
remove()删除元素
contains()查询是否有某个元素
isEmpty()判断是否为空
size()返回集合长度
toArray()把集合元素存到数组中
clear()清空集合

 */
public class collection_demo1 {
   public static void main(String[] args) {
      Collection<String> coll = new ArrayList<>();
      System.out.println("新建了一个集合");
      System.out.println(coll);

      System.out.println("1、add()添加元素:");
      coll.add("张三");
      coll.add("李四");
      coll.add("王五");
      coll.add("赵六");
      coll.add("田七");
      System.out.println(coll);


      System.out.println("2、remove()删除元素“张三”：");
      coll.remove("张三");
      System.out.println(coll);

      System.out.println("3、判断是否包含元素“田七”：");
      System.out.println(coll.contains("田七"));

      System.out.println("4、判断当前集合是否为空：");
      System.out.println(coll.isEmpty());

      System.out.println("5、返回集合中的元素个数");
      System.out.println(coll.size());

      System.out.println("6、把集合中的元素存到数组中");
      Object[] arr = coll.toArray();
      for (int i = 0; i < arr.length; i++) {
         System.out.println(arr[i]);
      }

      System.out.println("7、清空集合中所有的元素");
      coll.clear();
      System.out.println(coll);
   }
}
