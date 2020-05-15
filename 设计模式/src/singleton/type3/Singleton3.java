package singleton.type3;

/*
* 懒汉式（线程不安全）
    在实际开发是不要使用
    在多线程模式下，一个线程通过了 if(singleton == null)还没来的急往下执行，另外一个线程可能也通过了这个判断，就不能满足单例模式了。
* */


public class Singleton3 {

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

    //提供一个公有的静态方法，当使用该方法时才创建实例
    public static Singleton getInstance(){
        if(singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }



}


