package burger_shop;

import java.util.*;

//This is my plain hamburger class
public class Burger {

    static double price = plainBurgerPrice();



    //This function allows user to select the toppings, which are returned as an Array List.
    public static ArrayList<String> chooseToppings(int maxToppings) {

        ArrayList<String> toppings = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);
        int input;

        displayToppingsOptions();
        do {

            if(toppings.size() != 0) {
                System.out.println("Toppings chosen so far: " + toppings);
                System.out.println("Please enter next topping choice: (0 to finish)\n");
            } else if(toppings.size() == 0) {
                System.out.println("Please enter a topping choice: (0 to finish)\n");
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
                case 5:
                    toppings.add("Cheese");
                    calculateBurgerPrice(1.00);
                    System.out.println("One slice of cheese added, new total: " + getPrice() + "\n");
                    break;
                case 6:
                    toppings.add("Bacon");
                    calculateBurgerPrice(1.50);
                    System.out.println("One slice of bacon added, new total: " + getPrice() + "\n");
                    break;
                case 7:
                    //no additional charge for Ketchup
                    toppings.add("Ketchup");
                    System.out.println("Ketchup has been added as a topping.\n");
                    break;
                case 8:
                    //no additional charge for Mayo
                    toppings.add("Mayo");
                    System.out.println("Mayo has been added as a topping.\n");
                    break;
                case 9:
                    //no additional charge for Mustard
                    toppings.add("Mustard");
                    System.out.println("Mustard has been added as a topping.\n");
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

    static double plainBurgerPrice() {
        return 5.99;
    }

    static double calculateBurgerPrice(double additionalCost) {
        price += additionalCost;
        return price;
    }

    static double getPrice() {
        return price;
    }

    public static void displayToppingsOptions() {
        System.out.println("Select your toppings: Enter 0 when complete\n\n" +
                "1 - Lettuce\t\t\t" +
                "2 - Tomato\t\t\t" +
                "3 - Onion\n" +
                "4 - Pickle\t\t\t" +
                "5 - Cheese\t\t\t" +
                "6 - Bacon\n" +
                "7 - Ketchup\t\t\t" +
                "8 - Mayo\t\t\t" +
                "9 - Mustard\n");
    }

    public ArrayList<String> callChooseToppings() {
       return chooseToppings(2);
    }

}
