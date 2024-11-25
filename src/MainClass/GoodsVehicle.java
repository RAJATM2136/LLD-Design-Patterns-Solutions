package MainClass;

import WithStratergicDesignPattern.Stratergy.NormalDriveStratergy;

public class GoodsVehicle extends Vehicle {
     public GoodsVehicle() {
        super(new NormalDriveStratergy());
    }
}
