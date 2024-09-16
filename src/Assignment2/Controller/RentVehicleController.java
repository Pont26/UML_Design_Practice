        package Assignment2.Controller;

        import Assignment2.Model.Rent;
        import Assignment2.Model.rentCar;
        import Assignment2.Model.rentMotorBike;
        import Assignment2.Service.Rent.RentCarService;
        import Assignment2.Service.Rent.RentMotorBikeService;
        import Assignment2.Service.Rent.RentService;

        import java.io.IOException;
        import java.io.BufferedReader;
        import java.io.InputStreamReader;



        public class RentVehicleController {
            public RentService rentRegisterService;

            public void diplayRentInfo() throws IOException {
                String addMore="";
                int vehcileNumberToRent =0 ;
                int ChoseNumber = MainController.getChoseNumber();
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                if(ChoseNumber ==4 ) {
                    System.out.println("Enter vehicle number To Rent");
                    System.out.println("1. Car");
                    System.out.println("2. motorbike");
                    System.out.println("3. Bicycle");
                    vehcileNumberToRent = Integer.parseInt(br.readLine());
                    do {
                        if (vehcileNumberToRent == 1) {
                            System.out.println("rent CAR");
                            rentRegisterService = new RentCarService();
                            System.out.println("Do you want to rent more: yes or no");
                            addMore = br.readLine();


                        }
                    } while (addMore.equals("yes"));
                    do {
                        if (vehcileNumberToRent == 2) {
                            System.out.println("To rent MOTORBIKE");
                            rentRegisterService = new RentMotorBikeService();
                            System.out.println("Do you want to add more: yes or no");
                            addMore = br.readLine();

                        }
                    } while (addMore.equals("yes"));
                    do {
                        if (vehcileNumberToRent == 3) {
                            System.out.println("To Rent BICYCLE");
                            System.out.println("Do you want to rent more: yes or no");
                            addMore = br.readLine();
                        }
                    } while (addMore.equals("yes"));
                }else  if (ChoseNumber == 5) {
                    RentService.displayRentedVehicles();
                    System.out.println("Car" + rentCar.getCarCount()+" Over all Total Cost: "+ rentCar.getTotalCarRevenue());
                    System.out.println("Motor Bike "+ rentMotorBike.getMotorBikeCount() + "Over all Total Cost: "+ rentMotorBike.getTotalMotorBikeRevenue());
                    System.out.println("Total Rented Vehicle"+ Rent.getTotalRentedCount() +" Total Cost: "+ Rent.getTotalRevenue());

                }


            }
        }
