import java.util.ArrayList;

public class Manager extends User {
    public Manager() {
    }

    public Manager(String name, int money) {
        super(name, money);
    }

    public ArrayList<Integer> send(int money, int num) {
        ArrayList<Integer> list = new ArrayList<>();
        if (super.getMoney() < money) {
            System.out.println("余额不足");
            return list;
        }
        super.setMoney(super.getMoney() - money);
        int avg = money / num;
        int yu = money % num;
        for (int i = 0; i < num - 1; i++) {
            list.add(avg);
        }
        list.add(avg+yu);
        return list;
    }


}
