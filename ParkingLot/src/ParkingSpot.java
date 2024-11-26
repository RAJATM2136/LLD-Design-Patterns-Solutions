public class ParkingSpot {                //3
    public int id;
    public boolean isEmpty;
    Vehicle vehicle;
    int price;
    public ParkingSpot(int id, int price) {  //whenever this will get initialise there wont be other values
        this.id = id;
        this.price = price;
        this.isEmpty = true;
    }
    public void parkVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
        isEmpty = false;
    }
    public void removeVehicle() {
        this.vehicle = null;
        isEmpty = true;
    }
}
