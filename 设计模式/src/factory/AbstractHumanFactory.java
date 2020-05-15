package factory;

import factory.human.Human;

public abstract class AbstractHumanFactory {
    //通过泛型对createHuman函数的参数做了两层限制：1、必须是Class类型；2、必须是Human的实现类
    public abstract <T extends Human> T createHuman(Class<T> c);
}
