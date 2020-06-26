package burger_shop;

import java.util.ArrayList;

public class DeluxeBurger extends Burger{
    int maxToppings;

    @Override
    public ArrayList<String> callChooseToppings() {
        return chooseToppings(6);
    }

}
