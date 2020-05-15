package builder.carbuilder;

import builder.product.CarModel;

import java.util.ArrayList;

public abstract class CarBuilder {
    public abstract CarModel getCarMolder();
    public abstract void setSequence(ArrayList<String> sequence);
}
