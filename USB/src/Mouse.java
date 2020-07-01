public class Mouse implements USB {

    @Override
    public void open() {
        System.out.println("鼠标连接成功");
    }

    @Override
    public void close() {
        System.out.println("鼠标关闭成功");
    }

    public void click(){
        System.out.println("点击了鼠标");
    }
}
