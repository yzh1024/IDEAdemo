import java.io.File;

public class fileDemo1_fen_ge_fu {
    public static void main(String[] args) {
        System.out.println(File.pathSeparator);//路径分隔符，Windows：";"      Linux：":"
        System.out.println(File.pathSeparatorChar);//路径分隔符，Windows：";"      Linux：":"
        System.out.println(File.separator);//文件名称分隔符，Windows："\"        Linux："/"
        System.out.println(File.separatorChar);//文件名称分隔符，Windows："\"        Linux："/"
    }
}
