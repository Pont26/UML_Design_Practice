package Assignment2.Service.Rent;



import Assignment2.Model.Rent;
import Assignment2.Model.rentMotorBike;

import java.io.IOException;



public class RentMotorBikeService extends RentService {
    public static int totalAmount;


    public RentMotorBikeService() throws IOException {
        getRentedCar();

    }

    public void getRentedCar() throws IOException {
        Rent rentedMotorBike = getRentInfo();
        if (rentedMotorBike != null) {
            rents[Rent.getCount()] = new rentMotorBike(rentedMotorBike);
        }

    }
}
