package VegetableShop.Service;

import VegetableShop.Model.FruitVegetableModel;
import VegetableShop.Model.VegetableModel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FruitVegetableService extends VegetableService {
    public void getFruitVegetable() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        VegetableModel vegetableModel = addNewVegetable();
        System.out.print("seasonality: ");
        String season = br.readLine();
        vegetableArray[VegetableModel.getCount()] = new FruitVegetableModel(vegetableModel,season);
    }

}
