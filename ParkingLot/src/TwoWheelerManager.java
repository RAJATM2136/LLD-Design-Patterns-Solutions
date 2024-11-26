import java.util.List;

public class TwoWheelerManager extends ParkingSpotManager{  //5
    public TwoWheelerManager(List<ParkingSpot> parkingSpots) {
        super(parkingSpots);  // this is two wheeler list
    }

    @Override
    public ParkingSpot findParkingSpace() {
        return null;
    }

}
