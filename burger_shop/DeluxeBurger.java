package burger_shop;

public class DeluxeBurger extends Burger{
    int maxToppings;

    public DeluxeBurger(String name) {
        super(name);
    }

    @Override
    public void callChooseToppings() {
        chooseToppings(6);
    }

}
