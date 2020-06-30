import java.util.ArrayList;
import java.util.Random;

public class employee extends User {
    public employee() {
    }

    public employee(String name, int money) {
        super(name, money);
    }

    /**
     * 成员收红包
     * @param list
     */
    public void recive(ArrayList<Integer> list){
        //匿名对象获取随机数
        int r = new Random().nextInt(list.size());
        int money = list.remove(r);
        super.setMoney(super.getMoney()+money);
    }
}
