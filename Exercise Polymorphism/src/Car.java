public class Car implements Vehicle{
//For Car, use a daily rate of $50.
    private static final double rate_car =50;
    private String model; private int days;

    public Car(String model, int days) {
        this.model = model;
        this.days = days;
    }

    @Override
    public double calculateRentalCost() {//حساب تكلفة الإيجار translit
        return days*rate_car;
    }

    @Override
    public void displayDetails() {
        System.out.println(" The model is: "+model);
        System.out.println(" The days is:  "+ days);
        System.out.println("The calculate rental cost is : "+calculateRentalCost());

    }
}
