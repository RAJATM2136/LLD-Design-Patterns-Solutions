import java.util.List;

public class FourWheelerManager extends ParkingSpotManager  { //5
    public FourWheelerManager(List<ParkingSpot> parkingSpots) {
        super(parkingSpots);  //this is 4 wheeler list
    }

    @Override
    public ParkingSpot findParkingSpace() {
        return null;
    }
}
