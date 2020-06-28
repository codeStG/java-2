package burger_shop;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Meat {

    public static String chooseMeat() {
        String meat = null;
        displayMeatOptions();
        int input;
        Scanner scanner = new Scanner(System.in);


        while(meat == null) {
            System.out.println("Please select meat type: (5 to display options)");

            try {
                input = scanner.nextInt();
                scanner.nextLine();
            } catch(InputMismatchException e) {
                System.out.println("Invalid type entered. Must enter a number.");
                break;
            }

            switch (input) {
                case 1:
                    meat = "Beef";
                    System.out.println("Beef has been chosen.\n");
                    break;
                case 2:
                    meat = "Fried Chicken";
                    System.out.println("Fried Chicken has been chosen.\n");
                    break;
                case 3:
                    meat = "Grilled Chicken";
                    System.out.println("Grilled Chicken has been chosen.\n");
                    break;
                case 4:
                    meat = "Turkey";
                    System.out.println("Turkey has been chosen.\n");
                    break;
                case 5:
                    displayMeatOptions();
                    break;
                default:
                    System.out.println("Invalid meat option.");
                    break;
            }
        }
        return meat;
    }


    public static void displayMeatOptions() {
        System.out.println("Select your meat: Enter 0 when complete\n\n" +
                "1 - Beef\t\t" +
                "2 - Fried Chicken\t\t" +
                "3 - Grilled Chicken\t\t" +
                "4 - Turkey\n");
    }

}
