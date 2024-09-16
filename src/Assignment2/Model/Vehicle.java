package Assignment2.Model;

public class Vehicle {

    private String model;
    private String ownerName;
    private String ownerPh;
    private  int pricePerDay;
    private static int count = 0;
    private  String licence;
    private boolean rent;



    public Vehicle(Vehicle vehicleInfo) {
        this.model = vehicleInfo.model;
        this.ownerName = vehicleInfo.ownerName;
        this.ownerPh = vehicleInfo.ownerPh;
        this.pricePerDay = vehicleInfo.pricePerDay;
        this.licence = vehicleInfo.licence;
        this.rent=true;
        count++;


    }

   public Vehicle(String model,  String ownerName, String ownerPh, int pricePerDay, String licence) {
        this.model = model;
        this.ownerName = ownerName;
        this.ownerPh = ownerPh;
        this.pricePerDay = pricePerDay;
        this.licence = licence;
        this.rent= true;

    }
    public static int getCount() {
        return count;
    }

   public  int getPricePerDay() {
        return pricePerDay;
   }
   public String getLicence(){
        return licence;
   }
    public String toString() {
        return ("Model: "+ this.model  + " Owner Name: " + this.ownerName + " Owner Ph number: " + this.ownerPh + " Price per Day:  " + this.pricePerDay+" licence "+this.licence);
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    public boolean isRent() {
        return rent;
    }
  

}
