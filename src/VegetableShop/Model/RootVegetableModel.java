package VegetableShop.Model;

public class RootVegetableModel extends VegetableModel {
    private String soilType;
    public RootVegetableModel(int vegetableID,String vegetableName, double vegetablePrice, int vegetableQuantity,String soilType) {
        VegetableModel vegetableModel=new VegetableModel(vegetableID,vegetableName,vegetablePrice,vegetableQuantity);
        super(vegetableModel);
        this.soilType = soilType;
    }
    public RootVegetableModel(VegetableModel vegetableModel,String soilType) {
        super(vegetableModel);
        this.soilType=soilType;

    }
}
