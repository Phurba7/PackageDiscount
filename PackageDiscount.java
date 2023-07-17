import java.util.Scanner;

public class PackageDiscount {
    public static void main(String[] args) {
        final double PACKAGE_PRICE = 99.0;
        final int DISCOUNT_THRESHOLD_1 = 10;
        final int DISCOUNT_THRESHOLD_2 = 20;
        final int DISCOUNT_THRESHOLD_3 = 50;
        final int DISCOUNT_THRESHOLD_4 = 100;
        final double DISCOUNT_RATE_1 = 0.2;
        final double DISCOUNT_RATE_2 = 0.3;
        final double DISCOUNT_RATE_3 = 0.4;
        final double DISCOUNT_RATE_4 = 0.5;

        System.out.println("Programmer: Phurba Lama");
        System.out.println("Lab 16.3: 6/21/2023 @ 9:30");

        Scanner scanner = new Scanner(System.in);

        System.out.print("\nEnter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter the units sold: ");
        int quantity = scanner.nextInt();

        System.out.print(name + ", here are the results: ");

        double cost = quantity * PACKAGE_PRICE;

        double discount = 0;
        if (quantity >= DISCOUNT_THRESHOLD_4) {
            discount = cost * DISCOUNT_RATE_4;
        } else if (quantity >= DISCOUNT_THRESHOLD_3) {
            discount = cost * DISCOUNT_RATE_3;
        } else if (quantity >= DISCOUNT_THRESHOLD_2) {
            discount = cost * DISCOUNT_RATE_2;
        } else if (quantity >= DISCOUNT_THRESHOLD_1) {
            discount = cost * DISCOUNT_RATE_1;
        }

        double Total_Cost = cost - discount;


        System.out.println("\nUnits Sold:\t " + quantity);
        System.out.printf("Cost:\t\t $%.2f%n", cost );
        System.out.printf("Discount:\t $%.2f%n", discount);
        System.out.printf("Total Cost:\t $%.2f%n", Total_Cost);

        scanner.close();
    }
}