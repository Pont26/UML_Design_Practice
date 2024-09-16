package Assignment2.Service.Register;

import Assignment2.Model.Bicycle;
import Assignment2.Model.Vehicle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BicycleRegisterService extends VehicleRegisterService {

    public BicycleRegisterService() throws IOException {
        getBicycleInfo();

    }
    public  void getBicycleInfo() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Vehicle vehicleInfo=getVechicleInfo();
        System.out.print("licence Number: ");
        String licenceNumber = br.readLine();

        vehicles[Vehicle.getCount()]=new Bicycle(vehicleInfo, licenceNumber);

    }




    }

