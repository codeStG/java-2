package burger_shop;

import java.util.ArrayList;
import java.util.Scanner;

public class Order {

    Scanner scanner = new Scanner(System.in);
    ArrayList<String> toppings = new ArrayList<>();
    ArrayList<String> sides = new ArrayList<>();
    ArrayList<Burger> burgers = new ArrayList<>();
    double price;

    //vars for Meal orders
    Burger burger;
    Meal meal;
    String side;
    String drink;


    //vars for Burger orders
    String bread;
    String meat;


    public Order(Burger burger) {
        this.burger = burger;
        this.price = burger.getPrice();
        this.bread = Bread.chooseBread();
        this.meat = Meat.chooseMeat();
        this.toppings = burger.callChooseToppings();
        System.out.println("Burger successfully added!");
    }

    public Order(HealthBurger burger) {
        this.burger = burger;
        this.price = burger.getPrice();
        this.bread = Bread.chooseBread();
        this.meat = Meat.chooseMeat();
        this.toppings = burger.callChooseToppings();
        System.out.println("Burger successfully added!");
    }

    public Order(DeluxeBurger burger) {
        this.burger = burger;
        this.price = burger.getPrice();
        this.bread = Bread.chooseBread();
        this.meat = Meat.chooseMeat();
        this.toppings = burger.callChooseToppings();
        System.out.println("Burger successfully added!");
    }

    public Order(Meal meal) {
        this.meal = meal;
        this.price = meal.burger.getPrice();
        this.drink = meal.chooseDrink();
        this.side = Side.chooseSide();
        this.toppings = meal.toppings;
        System.out.println("Selected meal is: " + this.meal.bread + " bread with " + this.meal.meat + " as your meat choice, topped with " + this.toppings);
        System.out.println("This meal includes a " + this.drink + " for the drink and a side of " + this.side);
    }

    public ArrayList<String> addToppings(int numOfToppings) {
        System.out.println("You currently have a burger topped with " + this.toppings);
        System.out.println("Choose what toppings you would like to add to your burger: 0 to finish");

        Burger.displayToppingsOptions();
        toppings.addAll(Burger.chooseToppings(numOfToppings));

        return toppings;
    }

    public ArrayList<String> addSides(int numOfSides) {
        int count = 0;

        do{
            sides.add(side);
            System.out.println("Choose an additional side for $1.00 each: ");
            sides.add(Side.chooseSide());
            price += 1.00;
            System.out.println("New Total: " + price + "\n");
            count++;
        } while(count != numOfSides);

        return sides;
    }

    public ArrayList<Burger> addBurger(int numOfBurgers, String typeOfBurger) {
        burgers.add(burger);
        int count = 0;
        typeOfBurger = typeOfBurger.toLowerCase();

        do {
            switch (typeOfBurger) {
                case "plain":
                    Order plainBurger = new Order(new Burger());
                    price += plainBurger.price;
                    burgers.add(plainBurger.burger);
                    count++;
                    break;
                case "healthy":
                    Order healthyBurger = new Order(new HealthBurger());
                    price += healthyBurger.price;
                    burgers.add(healthyBurger.burger);
                    count++;
                    break;
                case "deluxe":
                    Order deluxeBurger = new Order(new DeluxeBurger());
                    price += deluxeBurger.price;
                    burgers.add(deluxeBurger.burger);
                    count++;
                    break;
                default:
                    System.out.println("Invalid burger choice.");
                    break;
            }
        } while(numOfBurgers > count);
        return burgers;
    }

    public ArrayList<Burger> addBurger(int numOfBurgers) {
        burgers.add(burger);
        int count = 0;

        do {
            Order healthyBurger = new Order(new Burger());
            price += healthyBurger.price;
            burgers.add(healthyBurger.burger);
            count++;
        } while(numOfBurgers > count);

        return burgers;

    }


    public boolean purchaseOrder() {
        String formatted = String.format("%.2f", price);
        System.out.printf("Would you like to confirm your order of $" + formatted + "?\n");
        System.out.println("Enter 1 to confirm, 0 to decline.");
        int input = scanner.nextInt();
        scanner.nextLine();
        if(input == 1) {
            System.out.println("Order processed successfully!");
            return true;
        } else if(input == 0) {
            System.out.println("Order has been declined.");
            return false;
        } else {
            System.out.println("Unrecognized entry.");
            return false;
        }
    }


}
