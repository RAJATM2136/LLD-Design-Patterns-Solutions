package Toppings;

import BasePizzaPackage.BasePizza;
import BasePizzaPackage.FarmHouse;
import BasePizzaPackage.Margarita;

public class Main {
    public static void main(String[] args) {
        BasePizza basePizza=new Veggies(new Veggies(new Margarita()));
        System.out.println(basePizza.cost());

    }
}
