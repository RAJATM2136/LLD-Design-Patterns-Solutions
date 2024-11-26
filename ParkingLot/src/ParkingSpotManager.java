import java.util.List;

public abstract class ParkingSpotManager {  //4  //we made it asbstract bcz its object is not created , its child class pbject is created
    List<ParkingSpot> parkingSpots;  //list we get from 2/4 wheeler obj
    public ParkingSpotManager(List<ParkingSpot> parkingSpots) {
        this.parkingSpots = parkingSpots;
    }
    public ParkingSpot findParkingSpace(){
        return null;
    }

    void parkVehicle(Vehicle vehicle){  //spot already exists now we just have to add vehicle in this !
        ParkingSpot parkingSpot = findParkingSpace();
        parkingSpot.parkVehicle(vehicle);
    }

    void removeVehicle(Vehicle vehicle){
        for(ParkingSpot parkingSpot : parkingSpots){
            if(parkingSpot.vehicle == vehicle) {
                parkingSpot.removeVehicle();
                break;
            }
        }
    }
}
