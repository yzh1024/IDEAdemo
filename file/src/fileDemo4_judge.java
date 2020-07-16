import java.io.File;

public class fileDemo4_judge {
    public static void main(String[] args) {
        File f = new File("D:\\IdeaProjects\\蓝桥杯练习题\\1入门训练");
        System.out.println(f.exists());//判断构造方法中的路径是否存在
        System.out.println(f.isDirectory());//此File表示的是否为目录
        System.out.println(f.isFile());//此File表示的是否为文件

    }
}
