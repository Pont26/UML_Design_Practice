package Assignment2.Service.Register;

import Assignment2.Model.Car;
import Assignment2.Model.Vehicle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VehicleRegisterService {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static Vehicle[] vehicles = new Vehicle[100];

    public static Vehicle getVechicleInfo() throws IOException {
        System.out.print("Model: ");
        String model = br.readLine();
        System.out.print("Owner Name: ");
        String ownerName = br.readLine();
        System.out.print("Owner Ph: ");
        String ownerPh = br.readLine();
        System.out.print("Price per day: ");
        int pricePerDay = Integer.valueOf(br.readLine());
        System.out.print("Licence: ");
        String licence = br.readLine();
        return new Vehicle(model, ownerName, ownerPh, pricePerDay, licence);

    }

    public static void displayVehicles() {
        for (int i = 0; i < Vehicle.getCount(); i++) {
            System.out.println(vehicles[i].toString());
        }

    }



}

















