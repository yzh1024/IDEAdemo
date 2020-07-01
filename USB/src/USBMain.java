/*
 * 案例：
 * 描述笔记本类，实现笔记本使用USB鼠标、USB键盘
 * USB接口：包含打开设备、关闭设备的功能
 * 笔记本类：包含开机功能、关机功能、使用USB设备的功能
 * 鼠标类：要实现USB接口，并具备点击的方法
 * 键盘类：要实现USB接口，并具备敲击的方法
 * */
public class USBMain {
    public static void main(String[] args) {
        //创建了一个Computer对象
        Computer computer = new Computer();
        computer.powerOn();


        //用向上转型（多态的写法）创建一个USB对象
        USB mouse = new Mouse();
        computer.useDevice(mouse);


        //创建了一个Keyboard对象
        Keyboard keyboard = new Keyboard();
        computer.useDevice(keyboard);//也发生了向上转型
        //也可以使用子类的匿名对象
        //computer.useDevice(new Keyboard());


        computer.powerOff();
    }
}
