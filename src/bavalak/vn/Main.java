package bavalak.vn;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
	// write your code here
        Car car = new Car();
        System.out.println("Enter the name car");
        String model = scanner.nextLine();
        car.setModel(model);
        System.out.println("Enter the year car");
        String year = scanner.nextLine();
        car.setYear(year);
        System.out.println("Enter the price car");
        double price = checkpriceInput();
        car.setPrice(price);

        System.out.println(car.toString());
    }

    public static double checkpriceInput() {
        double priced = 0;
        while (true) {
            String price = scanner.nextLine();
            try {
                priced = Double.parseDouble(price);
                if (priced < 0) {
                    System.out.println("Price must be > 0");
                } else {
                    return priced;
                }

            } catch (Exception e) {
                System.out.println("Price must be a number > 0");
            }
        }
    }
}
