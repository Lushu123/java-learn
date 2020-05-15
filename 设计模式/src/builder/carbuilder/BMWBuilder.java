package builder.carbuilder;

import builder.product.BMWModel;
import builder.product.BenzModel;
import builder.product.CarModel;

import java.util.ArrayList;

public class BMWBuilder extends CarBuilder {
    private BMWModel bmwModel = new BMWModel();
    @Override
    public CarModel getCarMolder() {
        return this.bmwModel;
    }

    @Override
    public void setSequence(ArrayList<String> sequence) {
        this.bmwModel.setSequence(sequence);
    }
}
