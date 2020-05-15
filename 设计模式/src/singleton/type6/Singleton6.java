package singleton.type6;

/*
* 静态内部类
*   推荐使用
* */


public class Singleton6 {

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
       Singleton singleton1 = Singleton.getInstance();
        System.out.println(singleton == singleton1);
    }

}

class Singleton{

    private static volatile Singleton singleton;
    //构造函数私有化
    private Singleton(){
    }

    //静态内部类,该类中有一个静态属性；类加载时，内部静态类不会被加载，科有效实现懒加载
    private static class SingletonInstance{
        private static final Singleton INSTANCE = new Singleton();
    }

    public static  Singleton getInstance(){
        return SingletonInstance.INSTANCE;
    }



}


