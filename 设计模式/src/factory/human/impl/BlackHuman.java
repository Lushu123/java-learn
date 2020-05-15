package factory.human.impl;

import factory.human.Human;

public class BlackHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("black man");
    }

    @Override
    public void talk() {
        System.out.println("say hello");
    }
}
