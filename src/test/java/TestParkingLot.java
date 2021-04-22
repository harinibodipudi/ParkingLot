import org.junit.jupiter.api.Test;
import utility.Car;
import utility.ParkingLot;

public class TestParkingLot {
    @Test
    void testToParkTheCarInParkingLot() {
        Car car1 = new Car();
        ParkingLot parkinglot = new ParkingLot(50);
        parkinglot.park(car1);
    }
}
