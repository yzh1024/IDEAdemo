public class Keyboard implements USB {

    @Override
    public void open() {
        System.out.println("键盘连接成功");
    }

    @Override
    public void close() {
        System.out.println("键盘关闭成功");
    }

    public void type(){
        System.out.println("敲击了了键盘");
    }
}
