import java.util.ArrayList;

public class Manager extends User {
    public Manager() {
    }

    public Manager(String name, int money) {
        super(name, money);
    }


    /**
     * 群主发红包
     * @param count
     * @param totalMoney
     * @return
     */
    public ArrayList<Integer> sendHongBao(int count, int totalMoney) {
        ArrayList<Integer> list = new ArrayList<>();
        if (super.getMoney() < totalMoney) {
            System.out.println("余额不足");
            return list;
        }
        int avg = totalMoney / count;
        int yu = totalMoney % count;
        super.setMoney(super.getMoney() - totalMoney);
        for (int i = 0; i < count - 1; i++) {
            list.add(avg);
        }
        list.add(avg+yu);
        return list;
    }
}
