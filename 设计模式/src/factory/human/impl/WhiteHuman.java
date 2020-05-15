package factory.human.impl;

import factory.human.Human;

public class WhiteHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("white man");
    }

    @Override
    public void talk() {
        System.out.println("say hello");
    }
}
