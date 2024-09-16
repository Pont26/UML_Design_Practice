package VegetableShop.Model;

public class FruitVegetableModel extends VegetableModel {
    private String seasonality;
    public FruitVegetableModel(int vegetableID,String vegetableName, int vegetablePrice, int vegetableQuantity,String seasonality) {
        VegetableModel vegetableModel=new VegetableModel(vegetableID,vegetableName,vegetablePrice,vegetableQuantity);
        super(vegetableModel);
        this.seasonality = seasonality;
    }
    public FruitVegetableModel(VegetableModel vegetableModel,String seasonality) {
        super(vegetableModel);
        this.seasonality = seasonality;
    }
}
