import java.io.FileNotFoundException;
import java.io.IOException;

public class throwsDemo {
    //异常处理的第一种方式：throw
    public static void main(String[] args) throws IOException {
        readFile("c:\\a.tx");
    }

    /**
     * 对文件的路径进行一个合法性判断
     * @param filename
     * @throws FileNotFoundException
     */
    public static void readFile(String filename) throws IOException {
//        如果路径不是"c:\\a.txt"，我们就抛出文件找不到异常对象，就告知方法的调用者
//        if(!filename.equals("c:\\a.txt")){
//            throw new FileNotFoundException("传递文件的路径不是c:\\a.txt");
//        }
//        判断文件的后缀名
        if (!filename.endsWith(".txt")) {
            throw new IOException("文件的后缀名不正确");
        }
        System.out.println("路径正确");
    }


}


