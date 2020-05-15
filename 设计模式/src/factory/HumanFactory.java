package factory;

import factory.human.Human;

public class HumanFactory extends AbstractHumanFactory {
    @Override
    public <T extends Human> T createHuman(Class<T> c) {
        Human human = null;
        try{
            human = (T)Class.forName(c.getName()).newInstance();
        }catch (Exception e){
            System.out.println("系统错误！");
        }
        return (T)human;
    }
}
