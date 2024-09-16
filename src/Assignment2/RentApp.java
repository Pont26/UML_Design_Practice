package Assignment2;

import Assignment2.Controller.MainController;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class RentApp {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        MainController mainMenu = new MainController();
        mainMenu.dispayRegisterInfo(); //Welcome messages and get user input

    }

}
