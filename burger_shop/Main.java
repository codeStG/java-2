package burger_shop;

public class Main {
    public static void main(String[] args) {
        //main execution of the burger shop goes here.  This is the "entry point" of your application

        Burger burger = new Burger("plain", "beef", "white");
        burger.callChooseToppings();
        System.out.println(burger.getPrice());
        System.out.println(burger.plainBurgerPrice());

        HealthBurger healthBurger = new HealthBurger("health", "chicken", "wheat");

        DeluxeBurger deluxeBurger = new DeluxeBurger("deluxe", "steak", "rye");
    }
}
