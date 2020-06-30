import java.util.ArrayList;

public class FaHongBaoMain {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Manager manager = new Manager("老板", 100);
        Employee employee1 = new Employee("张三", 0);
        Employee employee2 = new Employee("李四", 0);
        Employee employee3 = new Employee("王五", 0);
        showMoney(manager);
        showMoney(employee1);
        showMoney(employee2);
        showMoney(employee3);
        System.out.println("老板发20元红包后：");
        list = manager.sendHongBao(3, 20);
        employee1.receveHongBao(list);
        employee2.receveHongBao(list);
        employee3.receveHongBao(list);
        showMoney(manager);
        showMoney(employee1);
        showMoney(employee2);
        showMoney(employee3);


    }


    public static void showMoney(Manager manager) {
        manager.show();
    }

    public static void showMoney(Employee employee) {
        employee.show();
    }
}
