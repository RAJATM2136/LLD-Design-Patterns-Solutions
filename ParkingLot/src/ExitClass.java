import java.util.ArrayList;

public class ExitClass {  //9
    ParkingSpotManagerFactory parkingSpotManagerFactory;
    ExitClass(ParkingSpotManagerFactory parkingSpotManagerFactory) {
        this.parkingSpotManagerFactory = parkingSpotManagerFactory;
    }
    public void removeVehicle(Ticket ticket) {
       ParkingSpotManager manager=parkingSpotManagerFactory.getParkingSpotManager(ticket.vehicle.VehicleType,new ArrayList<>());
       manager.removeVehicle(ticket.vehicle);
    }
}
