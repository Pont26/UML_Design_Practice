package VegetableShop.Model;

public class VegetableModel {
    private int vegetableID;
    private String vegetableName;
    private double vegetablePrice;
    private int vegetableQuantity;
    private static int count=0;

    public VegetableModel(VegetableModel vegetableModel) {
        this.vegetableID = vegetableModel.vegetableID;
        this.vegetableName = vegetableModel.vegetableName;
        this.vegetablePrice = vegetableModel.vegetablePrice;
        this.vegetableQuantity = vegetableModel.vegetableQuantity;
        count++;

    }
    public VegetableModel(int vegetableID,String vegetableName, double vegetablePrice, int vegetableQuantity) {
        this.vegetableID = vegetableID;
        this.vegetableName = vegetableName;
        this.vegetablePrice = vegetablePrice;
        this.vegetableQuantity = vegetableQuantity;
    }
    public String getVegetableName() {
        return vegetableName;
    }
    public static int getCount(){
        return count;
    }

}
