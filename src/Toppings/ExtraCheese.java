package Toppings;

import BasePizzaPackage.BasePizza;

public class ExtraCheese implements ToppingsDecorator {
            BasePizza basePizza;

    public ExtraCheese(BasePizza basePizza) {
       this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return this.basePizza.cost()+10;
    }
}
