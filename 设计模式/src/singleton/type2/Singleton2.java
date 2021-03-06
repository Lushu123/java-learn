package singleton.type2;

//饿汉式（静态代码块）
//可能会造成内存泄漏
public class Singleton2 {

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();
        System.out.println(singleton == singleton1);
    }

}

class Singleton{

    //1构造函数私有化
    private Singleton(){
    }


    private static Singleton instance;
    //2本在静态代码块中创建对象实例
    static {
        instance = new Singleton();
    }

    //3对外提供一个公有的静态方法
    public static Singleton getInstance(){
        return instance;
    }

}


