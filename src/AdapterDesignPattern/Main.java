package AdapterDesignPattern;

public class Main {
    public static void main(String[] args) {
        AdapterInterface adapterInterface=new WeightInPounds(new WeightInKilo(34));
        System.out.println(adapterInterface.weightInPounds());


    }
}
