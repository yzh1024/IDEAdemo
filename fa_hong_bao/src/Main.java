import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
    ArrayList<Integer> list ;
    Manage manage = new Manage("老板",100);
    employee A = new employee("A",0);
    employee B = new employee("B",0);
    employee C = new employee("C",0);
    employee D = new employee("D",0);
    manage.show();
    A.show();
    B.show();
    C.show();
    D.show();
    list = manage.send(23,4);
    A.recive(list);
    B.recive(list);
    C.recive(list);
    D.recive(list);
        manage.show();
        A.show();
        B.show();
        C.show();
        D.show();
    }
}
