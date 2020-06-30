import java.util.ArrayList;

public class Manager extends User {
    public Manager() {
    }

    public Manager(String name, int money) {
        super(name, money);
    }


    /**
     * 群主发红包
     * @param money
     * @param num
     * @return
     */
    public ArrayList<Integer> send(int money, int num) {
        ArrayList<Integer> list = new ArrayList<>();
        //判断余额是否充足
        if (super.getMoney() < money) {
            System.out.println("余额不足");
            return list;
        }
        //扣除群主余额
        super.setMoney(super.getMoney() - money);
        int avg = money / num;
        //注意处理余数的问题
        int yu = money % num;
        for (int i = 0; i < num - 1; i++) {
            list.add(avg);
        }
        //把多余的金额（除不尽的）放在最后一个红包里面
        list.add(avg+yu);
        return list;
    }


}
