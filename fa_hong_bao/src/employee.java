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
        super.setMoney(super.getMoney()+list.get(r));
    }
}
