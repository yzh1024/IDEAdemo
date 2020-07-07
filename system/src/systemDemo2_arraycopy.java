import java.util.Arrays;

/*
将src数组中前三个元素，复制到dest数组的前三个元素的位置上
复制元素前：
src数组元素[1,2,3,4,5]
dest数组元素[6,7,8,9,10]
复制元素后：
src数组元素[1,2,3,4,5]
dest数组元素[1,2,3,9,10]
 */
public class systemDemo2_arraycopy {
    public static void main(String[] args) {
       int[] src = {1,2,3,4,5};
       int[] dest = {6,7,8,9,10};
       System.arraycopy(src,0,dest,0,3);
        System.out.println(Arrays.toString(src));
        System.out.println(Arrays.toString(dest));
    }
}
