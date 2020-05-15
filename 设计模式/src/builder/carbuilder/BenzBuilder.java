package builder.carbuilder;

import builder.product.BenzModel;
import builder.product.CarModel;

import java.util.ArrayList;

public class BenzBuilder extends CarBuilder {
    private BenzModel benzModel = new BenzModel();
    @Override
    public CarModel getCarMolder() {
        return this.benzModel;
    }

    @Override
    public void setSequence(ArrayList<String> sequence) {
        this.benzModel.setSequence(sequence);
    }
}
