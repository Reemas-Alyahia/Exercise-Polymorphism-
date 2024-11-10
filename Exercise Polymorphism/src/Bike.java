public class Bike implements Vehicle{
// For Bike, use an hourly rate of $10.
    private static final double bikeRate=10.0;
    //: brand, hour.
    private String brand;
    private int hour;

    public Bike(String brand, int hour) {
        this.brand = brand;
        this.hour = hour;
    }



    @Override
    public double calculateRentalCost() {
        return hour*bikeRate;
    }


    @Override
    public void displayDetails() {
        System.out.println("The brand name is:  "+brand);
        System.out.println("The all hours is: "+ hour);
        System.out.println("The calculate rental cost is : "+calculateRentalCost());
    }
}
