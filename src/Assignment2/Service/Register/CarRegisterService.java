package Assignment2.Service.Register;

import Assignment2.Model.Car;
import Assignment2.Model.Vehicle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CarRegisterService extends VehicleRegisterService {


    public CarRegisterService() throws IOException {
         getCarInfo();
    }//Constructor
    public void getCarInfo() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Vehicle vehicleInfo = getVechicleInfo();
        System.out.print("Car seat: ");
        int seatNumber = Integer.parseInt(br.readLine());
        vehicles[Vehicle.getCount()] = new Car(vehicleInfo, seatNumber);

    }



}

