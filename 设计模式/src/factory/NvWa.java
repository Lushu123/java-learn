package factory;

import factory.human.Human;
import factory.human.impl.WhiteHuman;

public class NvWa {
    public static void main(String[] args) {
        AbstractHumanFactory YinYangLu = new HumanFactory();
        Human whiteHuman = YinYangLu.createHuman(WhiteHuman.class);
        whiteHuman.getColor();
        whiteHuman.talk();
    }
}
