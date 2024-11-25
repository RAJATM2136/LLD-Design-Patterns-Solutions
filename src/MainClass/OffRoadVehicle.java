package MainClass;

import WithStratergicDesignPattern.Stratergy.DriveStratergy;
import WithStratergicDesignPattern.Stratergy.SportsDriveStratergy;

public class OffRoadVehicle extends Vehicle {

    public OffRoadVehicle() {
        super(new SportsDriveStratergy());
    }
}
