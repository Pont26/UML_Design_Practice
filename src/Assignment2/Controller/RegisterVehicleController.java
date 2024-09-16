    package Assignment2.Controller;

    import Assignment2.Model.Bicycle;
    import Assignment2.Model.Car;
    import Assignment2.Model.MotorBike;
    import Assignment2.Model.Vehicle;
    import Assignment2.Service.Register.BicycleRegisterService;
    import Assignment2.Service.Register.CarRegisterService;
    import Assignment2.Service.Register.MotorBikeRegisterService;
    import Assignment2.Service.Register.VehicleRegisterService;

    import java.io.IOException;

    import java.io.BufferedReader;
    import java.io.InputStreamReader;

    public class RegisterVehicleController {
        private static int VechiclNumber;
        public VehicleRegisterService vehicleRegisterService;

        public void diplaRegisteryInfo() throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int ChoseNumber = MainController.getChoseNumber();
            String addMore="";

            if (ChoseNumber == 1) {
                System.out.println("Enter vehicle number");
                System.out.println("1. Car");
                System.out.println("2. motorbike");
                System.out.println("3. Bicycle");
                VechiclNumber = Integer.parseInt(br.readLine());
                do {
                    if (VechiclNumber == 1) {
                        System.out.println("ADD CAR");
                        vehicleRegisterService = new CarRegisterService();
                        System.out.println("Do you want to add more: yes or no");
                        addMore = br.readLine();

                    }
                } while (addMore.equals("yes"));
                do {
                    if (VechiclNumber == 2) {
                        System.out.println("ADD MOTORBIKE");
                        vehicleRegisterService = new MotorBikeRegisterService();
                        System.out.println("Do you want to add more: yes or no");
                        addMore = br.readLine();

                    }
                } while (addMore.equals("yes"));
                do {
                    if (VechiclNumber == 3) {
                        System.out.println("ADD BICYCLE");
                        vehicleRegisterService = new BicycleRegisterService();
                        System.out.println("Do you want to add more: yes or no");
                        addMore = br.readLine();
                    }
                } while (addMore.equals("yes"));

            }else if (ChoseNumber == 2) {
                System.out.println("Registered vehicles: ");
                VehicleRegisterService.displayVehicles();


            }else if (ChoseNumber == 3) {
                System.out.println("registered Vechicles Count: ");
                System.out.println("car count: "+ Car.getCarCount());
                System.out.println("Motor Bike count: "+ MotorBike.getBikeCount());
                System.out.println("Bicycle count: "+ Bicycle.getBicycleCount());
                System.out.println("Total count: "+ Vehicle.getCount());
            }
        }
    }
