package Assignment2.Service.Register;

import Assignment2.Model.MotorBike;
import Assignment2.Model.Vehicle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MotorBikeRegisterService extends VehicleRegisterService {
public static int motorBikeTotalAmount = 0;
public static int motorBikeRentDay= 0;
    public MotorBikeRegisterService() throws IOException {
        getMotorBikeInfo();
    }

    public  void getMotorBikeInfo() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Vehicle vehicleInfo=getVechicleInfo();
        vehicles[Vehicle.getCount()]=new MotorBike(vehicleInfo);

    }


}
