package burger_shop;

public class Main {
    public static void main(String[] args) {
        //main execution of the burger shop goes here.  This is the "entry point" of your application

        Burger burger = new Burger();
        Meal meal = new Meal(burger);
        Order order = new Order(meal);
        order.addBurger(1, "healthy");
        order.addSides(2);
        order.purchaseOrder();
//
//        //The addSides method takes the number of sides needed
//        order.addSides(3);

//        DeluxeBurger deluxeBurger = new DeluxeBurger();

//        DeluxeBurger deluxeBurger = new DeluxeBurger();
//        Order burgerOrder = new Order(deluxeBurger);
//        burgerOrder.addBurger(1, "healthy");
//        burgerOrder.addSides(2);
//        burgerOrder.purchaseOrder();
    }
}
