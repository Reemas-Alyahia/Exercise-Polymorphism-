import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<Vehicle> rentedVehicles = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int choise;



        while (true) {
            System.out.println("--Vehicle Rental System--");
            System.out.println(" 1. Rent a Car");
            System.out.println(" 2. Rent a Bike");
            System.out.println(" 3. Rent a Truck");
            System.out.println(" 4. View Rented Vehicles");
            System.out.println(" 5.  Exit");
            choise = input.nextInt();
try {



        switch (choise) {
            case 1:
                System.out.println("Give me the name of what model you want: ");
                String modelname = input.next();
                System.out.println("Give me all days that you want to: ");
                int days = input.nextInt();
                Vehicle c1 = new Car("modelname", days);
                rentedVehicles.add(c1);
                c1.displayDetails();
                break;
            case 2:
                System.out.println("Give me the name of what brand you want: ");
                String brandbike = input.next();
                System.out.println("Give me all hours that you want to: ");
                int hourbik = input.nextInt();
                Vehicle b1 = new Bike(brandbike, hourbik);
                rentedVehicles.add(b1);
                b1.displayDetails();
                break;
            case 3:
                System.out.println("Give me the name of what type you want: ");
                String typeT = input.next();
                System.out.println("Give me how many weak that you want : ");
                int weaT = input.nextInt();
                Vehicle t1 = new Truck(typeT, weaT);
                rentedVehicles.add(t1);
                t1.displayDetails();
                break;

            case 4:
                if (rentedVehicles.isEmpty()) {
                    System.out.println("There is nothing to show up");
                } else {
                    for (Vehicle v : rentedVehicles)
                        v.displayDetails();
                }

            case 5:
                System.out.println("-------------");
                System.out.println("Thank you for using the Vehicle Rental System! .....");
                System.out.println("-------------");
                input.close();
                return;
            default:
                System.out.println("Only number pleas...");

        }
}catch(InputMismatchException e){
    System.out.println("put the correct");
}

        }


    }
}

