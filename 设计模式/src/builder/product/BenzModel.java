package builder.product;

public class BenzModel extends CarModel {
    @Override
    protected void start() {
        System.out.println("奔驰车跑起来是这样的。。。");
    }

    @Override
    protected void stop() {
        System.out.println("奔驰车是这样停车的。。。");
    }

    @Override
    protected void alarm() {
        System.out.println("奔驰车的喇叭声是这样的。。。");
    }

    @Override
    protected void engineBoom() {
        System.out.println("奔驰车的引擎是这个声音。。。");
    }
}
