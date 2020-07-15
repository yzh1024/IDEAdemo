package mai_bao_zi;

public class Main {
    public static void main(String[] args) {
        BaoZi bz = new BaoZi();
        new BaoZiPu(bz).start();
        new GuKe(bz).start();

    }
}
