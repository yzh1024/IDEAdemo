import java.util.ArrayList;
import java.util.Random;

public class employee extends User {
    public employee() {
    }

    public employee(String name, int money) {
        super(name, money);
    }

    public void recive(ArrayList<Integer> list){
        int r = new Random().nextInt(list.size());
        int money = list.remove(r);
        super.setMoney(super.getMoney()+money);
    }
}
