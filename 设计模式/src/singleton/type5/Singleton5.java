package singleton.type5;

/*
* 双重检查
    推荐使用
* */


public class Singleton5 {

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

    //提供一个公有的静态方法，加入双重检查代码，解决线程安全问题，同时解决懒加载问题。推荐使用
    public static  Singleton getInstance(){
        if(singleton == null){
            synchronized (Singleton.class){
                if(singleton == null){
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }



}


