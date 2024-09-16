package Assignment2.Service.Rent;

import Assignment2.Model.Rent;
import Assignment2.Model.rentCar;

import java.io.IOException;


public class RentCarService extends RentService {

    public RentCarService() throws IOException {
        getRentedCar();
    }
    public void getRentedCar() throws IOException {
        Rent rent= getRentInfo();
        if (rent != null) {
            rents[Rent.getCount()] = new rentCar(rent);
        }
    }


   }



