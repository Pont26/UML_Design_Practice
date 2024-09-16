package Assignment2.Model;

public class MotorBike extends Vehicle {
    private static int BikeCount = 0;

    public MotorBike(Vehicle vehicleInfo) {
        super(vehicleInfo);
        BikeCount++;

    }
    public static int getBikeCount() {
        return BikeCount;
    } //?


    @Override
    public String toString() {
        return ("Motor Bike: "+ super.toString());
    }
}
