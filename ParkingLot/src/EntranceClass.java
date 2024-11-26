import java.util.List;

public class EntranceClass {  //8
    ParkingSpotManagerFactory parkingSpotManagerFactory;
    EntranceClass(ParkingSpotManagerFactory parkingSpotManagerFactory) {
        this.parkingSpotManagerFactory = parkingSpotManagerFactory;
    }
    ParkingSpot findParkingSpace(VehicleType vehicleType, List<ParkingSpot> parkingSpots) {
        ParkingSpotManager parkingSpotManager=parkingSpotManagerFactory.getParkingSpotManager(vehicleType,parkingSpots);
        System.out.println(parkingSpotManager);
        return parkingSpotManager.findParkingSpace();
    }
    Ticket generateTicket(VehicleType vehicleType, ParkingSpot parkingSpot) {
        return null;
    }

}
