package VegetableShop.Service;

import Assignment2.Model.Vehicle;
import VegetableShop.Model.FruitVegetableModel;
import VegetableShop.Model.LeafyVegetableModel;
import VegetableShop.Model.RootVegetableModel;
import VegetableShop.Model.VegetableModel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class VegetableService {
    public static VegetableModel[] vegetableArray = new VegetableModel[100];
    static{
        vegetableArray[VegetableModel.getCount()]=new LeafyVegetableModel(1,"Lettuce",40,50,3);
        vegetableArray[VegetableModel.getCount()]=new LeafyVegetableModel(2, "Spinach", 35, 60, 4);
        vegetableArray[VegetableModel.getCount()]=new LeafyVegetableModel(3, "Kale", 50, 40, 7);

        vegetableArray[VegetableModel.getCount()]=new RootVegetableModel(4, "Carrot", 25, 100, "10 days");
        vegetableArray[VegetableModel.getCount()]=new RootVegetableModel(5, "Potato", 30, 150, "15 days");
        vegetableArray[VegetableModel.getCount()]=new RootVegetableModel(6, "Beetroot", 40, 80, "12 days");

        vegetableArray[VegetableModel.getCount()] = new FruitVegetableModel(7, "Watermelon", 70, 10, "14 days");
        vegetableArray[VegetableModel.getCount()] = new FruitVegetableModel(8, "Apple", 50, 100, "30 days");
        vegetableArray[VegetableModel.getCount()] = new FruitVegetableModel(9, "Orange", 40, 150, "20 days");


    }



    public static VegetableModel addNewVegetable() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Vegetable ID: ");
            int vegetableID = Integer.parseInt(br.readLine());
            System.out.print("Vegetable Name: ");
            String vegetableName = br.readLine();
            System.out.print("Vegetable Price: ");
            double vegetablePrice = Double.parseDouble(br.readLine());
            System.out.print("Vegetable Quanity in Stock: ");
            int vegetableQty = Integer.parseInt(br.readLine());
            return new VegetableModel(vegetableID, vegetableName, vegetablePrice, vegetableQty);
        }



    public String searchVegetable() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Vegetable Name: ");
        String vegetableName = br.readLine();
        VegetableModel vegetableModel = isVegetableExist(vegetableName);
        if (vegetableModel != null) {
            System.out.println("Vegetable found: " );
        } else {
            System.out.println("Vegetable not found.");
        }
        return null;
    }

    private VegetableModel isVegetableExist(String vegetableName) {
        for (int i = 0; i < VegetableModel.getCount(); i++) {
            VegetableModel vegetableModel = vegetableArray[i];
            if (vegetableModel.getVegetableName().equals(vegetableName)) {
                return vegetableModel;
            }
        }
        return null;
    }





}
