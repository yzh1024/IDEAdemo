import java.io.File;
import java.io.IOException;

public class fileDemo6_bian_li {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\IDEA2018\\help");
        String arr1[] = file.list();
        File[] arr2 = file.listFiles();
        for (String s : arr1) {
            System.out.println(s);
        }
        System.out.println("======================");
        for (File f : arr2) {
            System.out.println(f);
        }
    }
}
