package VegetableShop;

import VegetableShop.Controller.MainController;

import java.io.IOException;

public class VegetableShopSystem {
    public static void main(String[] args) throws IOException {
        MainController mainController = new MainController();
        mainController.displayVegetableShopInfo();

    }
}
