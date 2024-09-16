package Assignment2.Model;

public class Bicycle extends Vehicle {

    private String licenceNumber;

    private static int bicycleCount = 0;


    public Bicycle(Vehicle vehicleInfo,String licenceNumber) {
        super(vehicleInfo);
        this.licenceNumber = licenceNumber;
        bicycleCount++;

    }


    public static int getBicycleCount() {
        return bicycleCount;
    }

    @Override
    public String toString() {
        return ("Bicycle "+ super.toString() + " Bicycle Licence " + licenceNumber);
    }
    public static void displayBicycleCount(){
        System.out.println("car count: "+bicycleCount);

    }
}
