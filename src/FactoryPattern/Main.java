package FactoryPattern;

public class Main {
    public static void main(String[] args) {
        CostOfPizzaFactory costOfPizzaFactory = new CostOfPizzaFactory();
        System.out.println(costOfPizzaFactory.getCostOfPizza("Margarita"));
        System.out.println(costOfPizzaFactory.getCostOfPizza("FarmHouse"));

    }
}
