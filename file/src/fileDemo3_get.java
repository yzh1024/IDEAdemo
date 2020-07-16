import java.io.File;

public class fileDemo3_get {
    public static void main(String[] args) {
        File f = new File("D:\\IdeaProjects\\蓝桥杯练习题\\a.txt");
        System.out.println(f.getAbsolutePath());//返回绝对路径
        System.out.println(f.getPath());//将Fire转换为路径名字字符串
        System.out.println(f.getName());//返回此File表示的文件夹名或文件名
        System.out.println(f.length());//返回此File表示的大小（单位：字节）
    }
}
