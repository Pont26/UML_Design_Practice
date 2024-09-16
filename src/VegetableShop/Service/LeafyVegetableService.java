package VegetableShop.Service;

import VegetableShop.Model.LeafyVegetableModel;
import VegetableShop.Model.VegetableModel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class LeafyVegetableService extends VegetableService {

    public LeafyVegetableService() throws IOException {
        getLeafyVegetable();
    }
    public void getLeafyVegetable() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        VegetableModel vegetableModel = addNewVegetable();
        System.out.print("shelf Life In Days: ");
        int shelfLife = Integer.parseInt(br.readLine());
        vegetableArray[VegetableModel.getCount()]=new LeafyVegetableModel(vegetableModel,shelfLife);
    }

}
