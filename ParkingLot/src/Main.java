import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<ParkingSpot> spots = new ArrayList<>();
        for (int i = 1; i <= 100; ++i) {
            if (i <= 50)
                spots.add(new ParkingSpot(i, 10));
            else
                spots.add(new ParkingSpot(i, 20));
        }
        ParkingSpotManagerFactory parkingSpotManagerFactory = new ParkingSpotManagerFactory();
        EntranceClass entranceClass=new EntranceClass(parkingSpotManagerFactory);
        // till here already computer
        Vehicle vehicle=new Vehicle(123,VehicleType.TwoWheeler);
        Ticket ticket=new Ticket(123,entranceClass.findParkingSpace(vehicle.VehicleType,spots),vehicle);
        System.out.println(ticket.entryTime);
        System.out.println(ticket.vehicle);
        System.out.println(ticket.parkingSpot);

        ExitClass exitClass=new ExitClass(parkingSpotManagerFactory);
        exitClass.removeVehicle(ticket);
    }
}