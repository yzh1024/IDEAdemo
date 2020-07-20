import java.io.File;

/*
练习：搜索给出的目录中.java文件
 */
public class Demo3_wen_jian_sou_suo {
    public static void main(String[] args) {
        File file = new File("D:\\IdeaProjects");
        getAllFile(file);
    }

    private static void getAllFile(File dir) {
        File[] files = dir.listFiles();
        for (File f : files) {
            //对遍历得到的File对象f进行判断，判断是否是文件夹
            if (f.isDirectory()) {
                //f是一个文件夹，则继续遍历这个文件
                getAllFile(f);
            } else {
                //把File对象f转换为字符串,并且统一转换为小写，这样的话大小写都能搜索出来
                String s = f.toString().toLowerCase();
                //判断是否是以Java结尾
                if(s.endsWith(".java")){
                System.out.println(f);
                }
            }
        }
    }
}