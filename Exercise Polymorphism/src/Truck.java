public class Truck implements Vehicle{
//weekly rate of $500.
    private static final double weekRate=500;
    //type , week.
    private String type;   private int week;

    public Truck(String type, int week) {
        this.type = type;
        this.week = week;
    }

    @Override
    public double calculateRentalCost() {
        return this.week*weekRate;
    }

    @Override
    public void displayDetails() {
        System.out.println("The type is:  "+type);
        System.out.println("The all weeks is: "+ week);
        System.out.println("The calculate rental cost is : "+calculateRentalCost());
    }
}
