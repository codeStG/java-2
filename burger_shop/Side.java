package burger_shop;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Side {


    public static List<String> chooseSide(int numOfSides) {
        List<String> sides = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);
        int input;
        int count = 0;

        while(count < numOfSides) {
            displaySideOptions();
            System.out.println("Please select desired side: (Up to 3 can be chosen in a meal)\n");

            try {
                input = scanner.nextInt();
                scanner.nextLine();
            } catch(InputMismatchException e) {
                System.out.println("Invalid type entered. Must enter a number.");
                break;
            }

            switch (input) {
                case 1:
                    sides.add("French Fries");
                    System.out.println("You have chosen French Fries as your side.\n");
                    count++;
                    break;
                case 2:
                    sides.add("Onion Rings");
                    System.out.println("You have chosen Onion Rings as your side.\n");
                    count++;
                    break;
                case 3:
                    sides.add("Fried Pickles");
                    System.out.println("You have chosen Fried Pickles as your side.\n");
                    count++;
                    break;
                case 4:
                    sides.add("Chips");
                    System.out.println("You have chosen Chips as your side.\n");
                    count++;
                    break;
                case 5:
                    System.out.println("Quitting side choosing process...");
                    count = numOfSides;
                    break;
                default:
                    if (sides.size() == 0) {
                        sides.add("French Fries");
                        System.out.println("French Fries were added as a side by default.");
                        System.out.println("Side choosing process quits when default is selected.");
                        count = numOfSides;
                    }
                    break;
            }
        }
        return sides;
    }

    public static void displaySideOptions() {
        System.out.println("Side options: Enter 0 when complete\n\n" +
                "1 - French Fries\t\t" +
                "2 - Onion Rings\t\t" +
                "3 - Fried Pickles\t\t" +
                "4 - Chips\n " +
                "5 - QUIT");
    }

}
