import java.util.ArrayList;
import java.util.Collections;

public class DouDiZhu1 {
    public static void main(String[] args) {
        //1、准备牌
        ArrayList<String> poker = new ArrayList<>();
        String[] color = {"♥","♠","♣","♦"};
        String[] num = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        poker.add("大王");
        poker.add("小王");
        for (String s1 : color) {
            for (String s2 : num) {
                poker.add(s1+s2);
            }
        }
        //2、洗牌
        Collections.shuffle(poker);
        //3、发牌
        ArrayList<String> user1 = new ArrayList<>();
        ArrayList<String> user2 = new ArrayList<>();
        ArrayList<String> user3 = new ArrayList<>();
        ArrayList<String> diPai = new ArrayList<>();
        for (int i = 0; i < 54; i++) {
            if(i>=51){
                diPai.add(poker.get(i));
            }else if(i%3==0){
                user1.add(poker.get(i));
            }else if(i%3==1){
                user2.add(poker.get(i));
            }else if(i%3==2){
                user3.add(poker.get(i));
            }
        }
        //4、显示牌
        System.out.println("妲己："+user1);
        System.out.println("亚瑟："+user2);
        System.out.println("后裔："+user3);
        System.out.println("底牌："+diPai);
    }
}
