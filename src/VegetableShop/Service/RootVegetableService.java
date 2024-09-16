package VegetableShop.Service;

import VegetableShop.Model.RootVegetableModel;
import VegetableShop.Model.VegetableModel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RootVegetableService extends VegetableService {
    public RootVegetableService() throws IOException {
        getRootVegetable();
    }
    public void getRootVegetable() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        VegetableModel vegetableModel= addNewVegetable();
        System.out.print("soilType: ");
        String soilType = br.readLine();
        vegetableArray[VegetableModel.getCount()] = new RootVegetableModel(vegetableModel, soilType);
    }
}
