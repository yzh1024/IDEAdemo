import java.io.File;
import java.io.IOException;

public class fileDemo5_new_and_delete {
    public static void main(String[] args) throws IOException {
        //创建文件
        File f1 = new File("D:\\360\\1.txt");
        boolean b1 = f1.createNewFile();
        System.out.println(b1);
        //创建单级文件夹
        File f2 = new File("D:\\360\\aaa");
        boolean b2 = f2.mkdir();
        System.out.println(b2);
        //创建多级文件夹
        File f3 = new File("D:\\360\\111\\222\\333");
        boolean b3 = f3.mkdirs();
        System.out.println(b3);
        //删除文件或文件夹
        File f4 = new File("D:\\360\\1.txt");
        boolean b4 = f4.delete();
        System.out.println(b4);
    }
}
