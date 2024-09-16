package Assignment2.Model;

public class Car extends Vehicle {
    private int seat;
    private static int carCount;


    public Car(String model,String ownerName,String ownerPh,int pricePerDay,String licence,int seat){
        Vehicle vehicle = new Vehicle(model,ownerName,ownerPh,pricePerDay,licence);
        super(vehicle);
        this.seat = seat;
        this.carCount++;
    }
    public Car(Vehicle vehicleInfo, int seatNumber) {
        super(vehicleInfo);
        this.seat = seatNumber;
        carCount++;
    }

    public static int getCarCount() {
        return carCount;
    }

    @Override
    public String toString() {
        return ("car: " + super.toString()  + " Car seat Number: " + seat);
    }






}

