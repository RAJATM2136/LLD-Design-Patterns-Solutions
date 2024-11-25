package Toppings;

import BasePizzaPackage.BasePizza;

public class Veggies implements ToppingsDecorator{
    BasePizza basePizza;
    public Veggies(BasePizza basePizza) {
        this.basePizza=basePizza;
    }

    @Override
    public int cost() {
        return basePizza.cost()+50;
    }
}
