package builder.product;

public class BMWModel extends CarModel {
    @Override
    protected void start() {
        System.out.println("宝马车跑起来是这样的。。。");
    }

    @Override
    protected void stop() {
        System.out.println("宝马车是这样停车的。。。");
    }

    @Override
    protected void alarm() {
        System.out.println("宝马车的喇叭声是这样的。。。");
    }

    @Override
    protected void engineBoom() {
        System.out.println("宝马车的引擎是这个声音。。。");
    }
}
