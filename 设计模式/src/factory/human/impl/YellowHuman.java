package factory.human.impl;

import factory.human.Human;

public class YellowHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("yellow man");
    }

    @Override
    public void talk() {
        System.out.println("say hello");
    }
}
