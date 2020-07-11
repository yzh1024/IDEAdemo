import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


public class demo {
    public static void main(String[] args) {
//        1、准备牌
        ArrayList<String> colors = new ArrayList<>();
        ArrayList<String> num = new ArrayList<>();
        HashMap<Integer, String> puker = new HashMap<>();
        ArrayList<Integer> index = new ArrayList<>();
        puker.put(53,"大王");
        puker.put(52,"小王");
        index.add(53);
        index.add(52);
        Collections.addAll(colors, "♥", "♠", "♣", "♦");
        Collections.addAll(num, "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2");
        Integer sy = 0;
        for (String n : num) {
            for (String c : colors) {
                puker.put(sy,c+n);
                index.add(sy);
                sy++;
            }
        }
//        2、洗牌
        Collections.shuffle(index);
//        3、发牌
        ArrayList<Integer> obj1 = new ArrayList<>();
        ArrayList<Integer> obj2 = new ArrayList<>();
        ArrayList<Integer> obj3 = new ArrayList<>();
        ArrayList<Integer> dipai = new ArrayList<>();
        for (int i = 0; i < index.size(); i++) {
            if(i>=51){
                dipai.add(index.get(i));
            }else if(i%3==0){
                obj1.add(index.get(i));
            }else if(i%3==1){
                obj2.add(index.get(i));
            }else if(i%3==2){
                obj3.add(index.get(i));
            }
        }
//        4、看牌
        show("妲己",puker,obj1);
        show("亚瑟",puker,obj2);
        show("后裔",puker,obj3);
        show("底牌",puker,dipai);
    }

    public static void show(String name ,HashMap<Integer,String> puker,ArrayList<Integer> index){
        System.out.print(name+":");
        Collections.sort(index);
        for (Integer i : index) {
            System.out.print(puker.get(i)+"  ");
        }
        System.out.println();
    }
}

