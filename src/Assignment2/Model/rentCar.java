    package Assignment2.Model;


    public class rentCar extends Rent{
        private static int rentedCarCount = 0;
        private static int totalCarRevenue = 0;

        public rentCar(Rent rent) {
            super(rent);
            rentedCarCount++;
            totalCarRevenue += calculateTotalAmount(this.getRentLicence(), this.getRendDay());
        }

        public static int getCarCount() {
            return rentedCarCount;
        }
        public static int getTotalCarRevenue() {
            return totalCarRevenue;
        }

        @Override
        public String toString() {

            return ("Car "  + super.toString());
        }

    }
