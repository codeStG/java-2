package burger_shop;

import java.util.*;

public class Burger {

    String name;
    String bread;
    String meat;
    private double price;
    public Scanner scanner = new Scanner(System.in);


    public Burger(String name) {
        this.name = name;
        this.price = plainBurgerPrice();
        this.bread = Bread.chooseBread();
        this.meat = Meat.chooseMeat();
        callChooseToppings();
    }

    //This function allows user to select the toppings, which are returned as an Array List.
    public ArrayList<String> chooseToppings(int maxToppings) {
        int input;
        ArrayList<String> toppings = new ArrayList<String>();
        displayToppingsOptions();
        do {
            if(toppings.size() != 0) {
                System.out.println("Toppings chosen so far: " + toppings);
                System.out.println("Please enter next topping choice for " + this.name + ": (0 to finish)\n");
            } else if(toppings.size() == 0) {
                System.out.println("Please enter a topping choice for " + this.name + ": (0 to finish)\n");
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
                    totalBurgerPrice(1.00);
                    System.out.println("One slice of cheese added, new total: " + getPrice() + "\n");
                    break;
                case 6:
                    toppings.add("Bacon");
                    totalBurgerPrice(1.50);
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
        System.out.println("Topping choosing process finished with following toppings: " + toppings + " on " + this.bread);
        return toppings;
    }

    public double plainBurgerPrice() {
        return 5.99;
    }

    private double totalBurgerPrice(double toppingPrice) {
        this.price += toppingPrice;
        return this.price;
    }

    public double getPrice() {
        return price;
    }

    public void displayToppingsOptions() {
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

    public void callChooseToppings() {
        chooseToppings(2);
    }

}
