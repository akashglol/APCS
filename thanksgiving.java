import java.util.Scanner;

public class thanksgiving {
    public static void main(String[] args) {
        String[] foodItems = {"turkey", "mushrooms", "potatoes", "gravy", "salad", "yams"};
        int[] stock = {26, 27, 31, 18, 9, 15};
        int[] count = new int[6];

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome! Menu:");
        int i = 0;
        while (i < foodItems.length) {
            System.out.println((i + 1) + ". " + foodItems[i]);
            i++;
        }
        System.out.println("0. Finish Order");

        int choice = -1;
        while (choice != 0) {
            System.out.print("Enter your choice(Item Number): ");
            while (!scanner.hasNextInt()) {
                System.out.println("Please enter a number:");
                scanner.next();
            }
            choice = scanner.nextInt();

            if (choice < 0 || choice > foodItems.length) {
                System.out.println("Please select from the menu.");
            } else if (choice != 0) {
                if (stock[choice - 1] <= 0) {
                    System.out.println("Sorry, " + foodItems[choice - 1] + " is out of stock. Please change your order.");
                } else {
                    count[choice - 1]++;
                    stock[choice - 1]--;
                    System.out.println("You selected: " + foodItems[choice - 1]);
                }
            }
        }

        System.out.println("\nThank you for your order!");

        for (i = 0; i < foodItems.length; i++) {
            System.out.println(foodItems[i] + ": " + count[i]);
        }

        for (i = 0; i < count.length; i++) {
            if (count[i] > 10) {
                System.out.println("You ordered a lot of " + foodItems[i] + "!");
            }
        }

        scanner.close();
    }
}
