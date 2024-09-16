    package Assignment2.Model;


    public class rentMotorBike extends Rent{
        private static int rentedMotorBikeCount=0;
        private static int totalMotorBikeRevenue = 0;


        public rentMotorBike(Rent rentMotorBike) {
            super(rentMotorBike);
            rentedMotorBikeCount++;
            totalMotorBikeRevenue += calculateTotalAmount(this.getRentLicence(), this.getRendDay());
        }

        public static int getMotorBikeCount() {
            return rentedMotorBikeCount;
        }
        public static int getTotalMotorBikeRevenue() {
            return totalMotorBikeRevenue;
        }


        @Override
        public String toString() {
            return ("Motor Bike "+ super.toString() );
        }
    }
