import java.io.File;

public class fileDemo2_constructor {
    public static void main(String[] args) {
        //1
        //绝对路径（文件夹路径）
        File f1 = new File("D:\\IdeaProjects\\蓝桥杯练习题");
        System.out.println(f1);
        //绝对路径（文件路径）
        File f2 = new File("D:\\IdeaProjects\\蓝桥杯练习题\\a.txt");
        System.out.println(f2);
        //相对路径（文件路径）
        File f3 = new File("a.txt");
        System.out.println(f3);

        //2
        File f4 = new File("c:\\","a.txt");
        System.out.println(f4);
        File f5 = new File("d:\\","a.txt");
        System.out.println(f5);

        //3
        File parent = new File("c:\\");
        File f6 = new File(parent, "a.txt");
        System.out.println(f6);
    }
}
