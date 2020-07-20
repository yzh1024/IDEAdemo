import java.io.File;

/*
练习：遍历指定文件夹里面的所有目录

 */
public class Demo3_bian_li_wen_jian {
    public static void main(String[] args) {
        File file = new File("D:\\IdeaProjects");
        getAllFile(file);

    }

    private static void getAllFile(File dir) {
        System.out.println(dir);//打印被遍历的目录名称
        File[] files = dir.listFiles();
        for (File f : files) {
            //对遍历得到的File对象f进行判断，判断是否是文件夹
            if (f.isDirectory()) {
                //f是一个文件夹，则继续遍历这个文件
                getAllFile(f);
            } else {
                System.out.println(f);
            }
        }
    }


}
