/*
* 案例：
* 群主发普通红包。某群有多名成员，群主给成员发普通红包，普通红包的规则：
*   1、群主的一笔金额，从群主余额中扣除，平均分成N等分，让成员领取
*   2、成员领取红包后，保存到余额中
*   请根据描述，完成案例中所有类的定义以及指定类之间的继承关系，并完成发红包的操作
* */
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list;
        Manager manager = new Manager("老板", 100);
        employee A = new employee("A", 0);
        employee B = new employee("B", 0);
        employee C = new employee("C", 0);
        employee D = new employee("D", 0);
        manager.show();
        A.show();
        B.show();
        C.show();
        D.show();
        //群主发红包，成员收红包
        list = manager.send(23, 4);
        A.recive(list);
        B.recive(list);
        C.recive(list);
        D.recive(list);
        manager.show();
        A.show();
        B.show();
        C.show();
        D.show();
    }
}

