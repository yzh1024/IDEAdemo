import java.io.FileNotFoundException;
import java.io.IOException;

public class try_catchDemo {
    //异常处理的第二种方式：try...catch
    public static void main(String[] args) {
        try {
            readFile("c:\\a.tx");
        } catch (IOException e) { //try中抛出什么异常对象，catch就定义什么异常变量，用来接收这个异常对象
//            e.getMessage();
//            e.toString();
            e.printStackTrace();
        }
        System.out.println("后续代码");
    }

    public static void readFile(String filename) throws IOException {

        if (!filename.endsWith(".txt")) {
            throw new IOException("文件的后缀名不正确");
        }
        System.out.println("路径正确");
    }


}


