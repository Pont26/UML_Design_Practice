package Assignment2.Model;
import static Assignment2.Service.Register.VehicleRegisterService.vehicles;

public class Rent{
private Vehicle vehicle;
private static int totalRentedCount = 0;
private  int rendDay=0;
private int revenueByindividual;
private static int totalRevenue = 0;
private String rentLicence;

public Rent(Vehicle vehicle,int rentDay,String rentLicence) {
    this.rendDay = rentDay;
    this.rentLicence = rentLicence;
    this.vehicle = vehicle;
    totalRentedCount++;
    this.revenueByindividual = calculateTotalAmount(rentLicence,this.getRendDay());
    totalRevenue += calculateTotalAmount(rentLicence, this.getRendDay());
}
public Rent(Rent rent){
    this.rendDay = rent.rendDay;
    this.rentLicence = rent.rentLicence;
    this.vehicle = rent.vehicle;
    this.revenueByindividual=rent.revenueByindividual;
}


public static int getCount() {
    return totalRentedCount;
}


public  int getRendDay() {
    return  rendDay;
}
public int calculateTotalAmount(String rentLicenceNumber, int rentDay) {
    for (int i = 0; i < Vehicle.getCount(); i++) {
        Vehicle vehicle = vehicles[i];
        if (vehicle.getLicence().equals(rentLicenceNumber)) {
            return vehicle.getPricePerDay() * rentDay;
        }
    }
    return 0;
}

public static int getTotalRevenue() {
    return totalRevenue;
}

public static int getTotalRentedCount(){
    return totalRentedCount;

}
public String getRentLicence() {
    return rentLicence;
}

public void setRentLicence(String rentLicence) {
    this.rentLicence = rentLicence;
}


    @Override
public String toString() {

    return (this.vehicle.getModel()  + " LicenceNumber=" + this.rentLicence + " ,RentDay=" + this.rendDay+" ,total=" + revenueByindividual);

}


}
