package VegetableShop.Controller;

import VegetableShop.Service.FruitVegetableService;
import VegetableShop.Service.LeafyVegetableService;
import VegetableShop.Service.RootVegetableService;
import VegetableShop.Service.VegetableService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainController {
    private static int choseNumber ;
    private static int registerNumber = 0;
    public VegetableService vegetableService;
    public static String addMore;
    public void displayVegetableShopInfo() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        do {
            System.out.println("Welcome from Vegetable shop ");
            System.out.println("Choose Number: ");
            System.out.println("1. Add new vegetable");
            System.out.println("2. Update Vegetable Stock");
            System.out.println("3. Register New Customer");
            System.out.println("4. Place Orders");
            System.out.println("5. View Orders");
            System.out.println("6. Search Vegetable");
            System.out.println("7. Generate Sales report");
            System.out.println("8. Exit");
            choseNumber = Integer.parseInt(br.readLine());

                if (choseNumber == 1) {
                    do {   System.out.println(" Choose the type of Vegetable type to register ");
                    System.out.println("1. Leafy Vegetable");
                    System.out.println("2. Root Vegetable");
                    System.out.println("3. Fruit Vegetable");
                    System.out.println("4. Exist");
                    registerNumber = Integer.parseInt(br.readLine());

                    do {
                        if (registerNumber == 1) {
                            vegetableService = new LeafyVegetableService();
                            System.out.println(" Do you want to add More: yes or no ");
                            addMore = br.readLine();
                        }
                    } while (addMore.equals("yes"));

                    do {
                        if (registerNumber == 2) {
                            vegetableService = new RootVegetableService();
                            System.out.println(" Do you want to add More: yes or no ");
                            addMore = br.readLine();
                        }
                    } while (addMore.equals("yes"));

                    do {
                        if (registerNumber == 3) {
                            vegetableService = new FruitVegetableService();
                            System.out.println(" Do you want to add More: yes or no ");
                            addMore = br.readLine();

                        }
                    } while (addMore.equals("yes"));
                }while (registerNumber != 4);
            }

          if(choseNumber == 6){
              vegetableService.searchVegetable();

          }

        }while(choseNumber != 8);
    }




    }
