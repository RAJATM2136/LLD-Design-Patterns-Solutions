package MainClass;

import WithStratergicDesignPattern.Stratergy.DriveStratergy;

public class Vehicle {
    private DriveStratergy driveStratergy;

    Vehicle(DriveStratergy driveStratergy) {
        this.driveStratergy = driveStratergy;
    }

    public void drive(){
        driveStratergy.drive();
    }

}
