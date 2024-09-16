package Assignment2.Service.Rent;
import Assignment2.Model.Car;
import Assignment2.Model.Rent;
import Assignment2.Model.Vehicle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static Assignment2.Service.Register.VehicleRegisterService.vehicles;

public class RentService {

    static{
        System.out.println("Database is starting to ready!!!");
        vehicles[Vehicle.getCount()]=new Car("BMW","Min Pyae","0957190998",400,"1234",4);
        vehicles[Vehicle.getCount()]=new Car("HYUNDI","Min Min","0957190998",700,"1235",4);
        vehicles[Vehicle.getCount()]=new Car("TOYOTA","Suzi","0957190998",300,"1236",4);
        vehicles[Vehicle.getCount()]=new Car("FORD","Ni Ni","0957190998",600,"1237",4);
        vehicles[Vehicle.getCount()]=new Car("AUDI","Gone Gone","0957190998",800,"1238",4);
        System.out.println("Car Count=="+Vehicle.getCount());
    }
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static Rent[] rents = new Rent[100];

    public Rent getRentInfo() throws IOException {

        System.out.print("Rent day: ");
        int rentDay = Integer.parseInt(br.readLine());
        System.out.print("Licence Number: ");
        String rentLicenceNumber = br.readLine();
        Vehicle vehicle=isLicenceNumberExist(rentLicenceNumber);

        if (vehicle == null) {
            System.out.println("Licence number does not exist");
            return null;

        }
        if (vehicle.isRent()) {
            System.out.println("Already rented vehicle");
            return null;
        }
        System.out.println("Vehicle rented successfully");

        return new Rent(vehicle, rentDay, rentLicenceNumber);
    }

    private  Vehicle isLicenceNumberExist(String rentLicenceNumber) {
        for (int i = 0; i < Vehicle.getCount(); i++) {
            Vehicle vehicle = vehicles[i];
            if (vehicle.getLicence().equals(rentLicenceNumber)) {
                return vehicle;
            }
        }
        return  null;
    }


    public static void displayRentedVehicles() {
        for (int i = 0; i <= Rent.getCount(); i++) {
            if (rents[i] != null) {
                System.out.println(rents[i].toString());
            }
        }
    }




}









