package FactoryPattern;

import BasePizzaPackage.BasePizza;
import BasePizzaPackage.FarmHouse;
import BasePizzaPackage.Margarita;

public class CostOfPizzaFactory {
    int getCostOfPizza(String name) {
        switch (name) {
            case "Margarita":
                return (new Margarita()).cost();
                case "FarmHose":
                    return (new FarmHouse()).cost();
        }
        return 0;
    }
}
