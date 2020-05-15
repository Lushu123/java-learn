package singleton.type1;

//饿汉式（静态变量）
//可能会造成内存泄漏
public class Singleton1 {

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

    //2本类内部创建对象实例
    private final static Singleton instance = new Singleton();

    //3对外提供一个公有的静态方法
    public static Singleton getInstance(){
        return instance;
    }

}


