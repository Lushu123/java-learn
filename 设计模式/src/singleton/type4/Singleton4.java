package singleton.type4;

/*
* 懒汉式（线程安全）
    在实际开发是不推荐使用
    效率太低

* */


public class Singleton4 {

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
       Singleton singleton1 = Singleton.getInstance();
        System.out.println(singleton == singleton1);
    }

}

class Singleton{

    private static Singleton singleton;
    //构造函数私有化
    private Singleton(){
    }

    //提供一个公有的静态方法，当使用该方法时才创建实例，为满足线程安全，加入一下代码：synchronized。
    public static synchronized   Singleton getInstance(){
        if(singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }



}


