package VegetableShop.Model;

public class LeafyVegetableModel extends VegetableModel{
   private int shelfLifeInDays;
    public LeafyVegetableModel(int vegetableID,String vegetableName, double vegetablePrice, int vegetableQuantity,int shelfLifeInDays) {
        VegetableModel vegetableModel=new VegetableModel(vegetableID,vegetableName,vegetablePrice,vegetableQuantity);
        super(vegetableModel);
        this.shelfLifeInDays = shelfLifeInDays;
    }
    public LeafyVegetableModel(VegetableModel vegetableModel, int shelfLifeInDays) {
        super(vegetableModel);
        this.shelfLifeInDays = shelfLifeInDays;
    }

}
