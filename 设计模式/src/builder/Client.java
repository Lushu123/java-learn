package builder;

import builder.carbuilder.BenzBuilder;
import builder.product.BenzModel;

import java.util.ArrayList;

public class Client {
    public static void main(String[] args) {
        // 第一阶段
        BenzModel benzModel = new BenzModel();
        ArrayList<String> sequence = new ArrayList<>();
        sequence.add("engineBoom");
        sequence.add("start");
        sequence.add("stop");
//        benzModel.setSequence(sequence);
//        benzModel.run();

        //第二阶段
        BenzBuilder benzBuilder = new BenzBuilder();
        benzBuilder.setSequence(sequence);
        BenzModel benzModel1 = (BenzModel) benzBuilder.getCarMolder();
//        benzModel1.run();

        //第三阶段
        Director director = new Director();
        BenzModel benzModel2 = director.getABenzModel();
        benzModel2.run();


    }
}
