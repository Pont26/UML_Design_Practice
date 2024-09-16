    package Assignment2.Controller;



    import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;
    public class MainController {
    private static int ChoseNumber = 0;


    RentVehicleController rentInfo = new RentVehicleController();
    RegisterVehicleController registerInfo = new RegisterVehicleController();

    public void dispayRegisterInfo() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     do{
         System.out.println("Welcome to Register System");
        System.out.println("1. Add vehicle");
        System.out.println("2. Display all the registered vehicles");
        System.out.println("3. Display count");
         System.out.println("4. Rent Vehicle");
         System.out.println("5. sale report");
        System.out.println("6. Exit");
        ChoseNumber = Integer.parseInt(br.readLine());
        registerInfo.diplaRegisteryInfo();
        rentInfo.diplayRentInfo();

        if(ChoseNumber == 6){
                System.out.println("End");
            }
        } while (ChoseNumber != 6);
    }
    public static int getChoseNumber(){
        return ChoseNumber;
        }
    }