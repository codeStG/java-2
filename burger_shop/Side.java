package burger_shop;

import java.util.Scanner;

public class Side {


    public static String chooseSide() {
        String side = null;
        displaySideOptions();
        Scanner scanner = new Scanner(System.in);
        int input;

        System.out.println("Please select desired side:\n");
        input = scanner.nextInt();
        scanner.nextLine();
        switch(input) {
            case 1:
                side = "French Fries";
                System.out.println("You have chosen French Fries as your side.\n");
                break;
            case 2:
                side = "Onion Rings";
                System.out.println("You have chosen Onion Rings as your side.\n");
                break;
            case 3:
                side = "Fried Pickles";
                System.out.println("You have chosen Fried Pickles as your side.\n");
                break;
            case 4:
                side = "Chips";
                System.out.println("You have chosen Chips as your side.\n");
                break;
            default:
                if(side == null) {
                    side = "French Fries";
                    System.out.println("French Fries were added as a side by default.");
                }
                break;
        }
        return side;
    }

    public static void displaySideOptions() {
        System.out.println("Side options: Enter 0 when complete\n\n" +
                "1 - French Fries\t\t" +
                "2 - Onion Rings\t\t" +
                "3 - Fried Pickles\t\t" +
                "4 - Chips\n");
    }

}
