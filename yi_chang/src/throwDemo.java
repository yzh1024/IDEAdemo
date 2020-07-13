public class throwDemo {
    //throw异常的演示
    public static void main(String[] args) {
        int[] a = {1,2};
        int e = getElement(a, 2);
        System.out.println(e);
    }

    public static int  getElement(int[] arr,int index) {
        if(arr ==null){
            throw new NullPointerException("传进来的数组是空的！");
        }
        if(index<0||index>arr.length-1){
            throw new ArrayIndexOutOfBoundsException("数组索引超出了范围");
        }
        return arr[index];
    }
}


