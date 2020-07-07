import java.util.ArrayList;

public class demo {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(12);
        list1.add(24);

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("AS");
        list2.add("KM");

        printArray(list1);
        printArray(list2);
    }

    public static void printArray(ArrayList<?> list){
        for (Object o : list) {
            System.out.println(o);
        }
    }
}

