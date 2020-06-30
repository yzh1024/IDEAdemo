import java.util.ArrayList;
import java.util.Random;

public class Employee extends User {
    public Employee() {
    }

    public Employee(String name, int money) {
        super(name, money);
    }


    /**
     * 群成员随机收红包
     *
     * @param list
     */
    public void receveHongBao(ArrayList<Integer> list) {
        int num = new Random().nextInt(list.size());
        int money = list.remove(num);
        super.setMoney(super.getMoney() + money);
    }
}
