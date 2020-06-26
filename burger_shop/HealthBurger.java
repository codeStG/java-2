package burger_shop;

import java.util.ArrayList;
import java.util.Scanner;

public class HealthBurger extends Burger {

    @Override
    public ArrayList<String> callChooseToppings() {
        return chooseToppings(4);
    }

    public static ArrayList<String> chooseToppings(int maxToppings) {

        ArrayList<String> toppings = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);
        int input;


        HealthBurger.displayToppingsOptions();
        do {

            if(toppings.size() != 0) {
                System.out.println("Toppings chosen so far: " + toppings);
                System.out.println("Please enter next topping choice: (0 to finish)\n");
            } else if(toppings.size() == 0) {
                System.out.println("Please enter a topping choice for: (0 to finish)\n");
            }

            input = scanner.nextInt();
            scanner.nextLine();
            switch(input) {
                case 1:
                    //no additional charge for Lettuce
                    toppings.add("Lettuce");
                    System.out.println("Lettuce has been added as a topping.\n");
                    break;
                case 2:
                    //no additional charge for Tomato
                    toppings.add("Tomato");
                    System.out.println("Tomato has been added as a topping.\n");
                    break;
                case 3:
                    //no additional charge for Onion
                    toppings.add("Onion");
                    System.out.println("Onion has been added as a topping.\n");
                    break;
                case 4:
                    //no additional charge for Pickle
                    toppings.add("Pickle");
                    System.out.println("Pickle has been added as a topping.\n");
                    break;
                default:
                    if(toppings.size() > 0) {
                        System.out.println("You chose the following toppings: " + toppings);
                    } else if(toppings.size() == 0) {
                        System.out.println("No toppings were selected.");
                    }
                    break;
            }
        } while (input != 0 && toppings.size() < maxToppings);
        if(toppings.size() == maxToppings) {
            System.out.println("Maximum number of toppings reached.");
        }
        System.out.println("Topping choosing process finished.");
        return toppings;
    }

    public static void displayToppingsOptions() {
        System.out.println("Select your toppings: Enter 0 when complete\n\n" +
                "1 - Lettuce\t\t" +
                "2 - Tomato\t\t" +
                "3 - Onion\t\t" +
                "4 - Pickle\n");
    }
}
