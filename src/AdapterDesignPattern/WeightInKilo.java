package AdapterDesignPattern;

public class WeightInKilo implements AdaptaeInterface {
   int weightInKilo;
    WeightInKilo(int weightInKilo ) {
        this.weightInKilo = weightInKilo;
    }

    @Override
    public int weightInKilo() {
        return this.weightInKilo;
    }
}
