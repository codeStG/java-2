package burger_shop;

public class DeluxeBurger extends Burger{
    int maxToppings;

    public DeluxeBurger(String name, String meat, String breadType) {
        super(name, meat, breadType);
    }

    @Override
    public void callChooseToppings() {
        chooseToppings(6);
    }

}
