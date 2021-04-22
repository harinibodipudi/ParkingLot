package utility;

import java.util.HashSet;

public class ParkingLot {
    public int capacity ;

    public ParkingLot(int capacity) {
        this.capacity = capacity;
    }

    HashSet<Car> parkedVehicles = new HashSet<>();
    public void park(Car car){
        parkedVehicles.add(car);
    }
}
