package MainClass;

import WithStratergicDesignPattern.Stratergy.SportsDriveStratergy;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle=new OffRoadVehicle();
        vehicle.drive();
    }
}
