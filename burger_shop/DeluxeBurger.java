package burger_shop;

import java.util.List;

public class DeluxeBurger extends Burger{
    int maxToppings;

    @Override
    public List<String> callChooseToppings() {
        return chooseToppings(6);
    }

}
