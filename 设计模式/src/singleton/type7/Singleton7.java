package singleton.type7;

/*
* 枚举
*   推荐使用
* */


public class Singleton7 {

    public static void main(String[] args) {
        Singleton singleton = Singleton.INSTANCE;
        Singleton singleton1 = Singleton.INSTANCE;
    }

}

enum  Singleton{
    INSTANCE;
    public void sayOK(){
        System.out.println("ok~");
    }
}


