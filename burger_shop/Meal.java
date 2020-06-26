package burger_shop;

import java.util.ArrayList;
import java.util.Scanner;

public class Meal {

    Burger burger;
    String bread;
    String meat;
    ArrayList<String> toppings;
    double price;


    public Meal(Burger burger) {
        this.burger = burger;
        this.price = burger.calculateBurgerPrice(2.00);
        this.bread = Bread.chooseBread();
        this.meat = Meat.chooseMeat();
        this.toppings = burger.callChooseToppings();
    }

    public Meal(HealthBurger burger) {
        this.burger = burger;
        this.price = burger.calculateBurgerPrice(2.00);
        this.bread = Bread.chooseBread();
        this.meat = Meat.chooseMeat();
        this.toppings = burger.callChooseToppings();
    }

    public Meal(DeluxeBurger burger) {
        this.burger = burger;
        this.price = burger.calculateBurgerPrice(2.00);
        this.bread = Bread.chooseBread();
        this.meat = Meat.chooseMeat();
        this.toppings = burger.callChooseToppings();
    }

    public String chooseDrink() {
        String drink = null;
        displayDrinkOptions();
        int input;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please select desired beverage:\n");
        input = scanner.nextInt();
        scanner.nextLine();
        switch(input) {
            case 1:
                drink = "Coke";
                System.out.println("Coke has been chosen.\n");
                break;
            case 2:
                drink = "Sprite";
                System.out.println("Sprite has been chosen.\n");
                break;
            case 3:
                drink = "Dr. Pepper";
                System.out.println("Dr. Pepper has been chosen.\n");
                break;
            case 4:
                drink = "Root Beer";
                System.out.println("Root Beer has been chosen.\n");
                break;
            default:
                if(drink == null) {
                    System.out.println("No drink was chosen.");
                }
                break;
        }
        return drink;
    }

    public static void displayDrinkOptions() {
        System.out.println("Select your beverage: Enter 0 when complete\n\n" +
                "1 - Coke\t\t" +
                "2 - Sprite\t\t" +
                "3 - Dr. Pepper\t\t" +
                "4 - Root Beer\n");
    }
}
