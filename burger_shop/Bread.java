package burger_shop;
import java.util.*;

public class Bread {

    public static String chooseBread() {
        String bread = null;
        displayBreadOptions();
        int input;
        Scanner scanner = new Scanner(System.in);

        while(bread == null) {
            System.out.println("Please select bread type: (5 to display options)");

            try {
                input = scanner.nextInt();
                scanner.nextLine();
            } catch(InputMismatchException e) {
                System.out.println("Invalid type entered. Must enter a number.");
                break;
            }

            switch (input) {
                case 1:
                    bread = "White";
                    System.out.println("White bread has been chosen.\n");
                    break;
                case 2:
                    bread = "Wheat";
                    System.out.println("Wheat bread has been chosen.\n");
                    break;
                case 3:
                    bread = "Rye";
                    System.out.println("Rye bread has been chosen.\n");
                    break;
                case 4:
                    bread = "Lettuce Wrap";
                    System.out.println("Lettuce Wrap has been chosen.\n");
                    break;
                case 5:
                    displayBreadOptions();
                    break;
                default:
                    if (bread == null) {
                        System.out.println("Invalid bread option.");
                    }
                    break;
            }
        }
        return bread;
    }


    public static void displayBreadOptions() {
        System.out.println("Select your bread: Enter 0 when complete\n\n" +
                "1 - White\t\t" +
                "2 - Wheat\t\t" +
                "3 - Rye\t\t" +
                "4 - Lettuce-Wrap\n");
    }


}
