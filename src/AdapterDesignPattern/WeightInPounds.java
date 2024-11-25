package AdapterDesignPattern;

public class WeightInPounds implements AdapterInterface{
    AdaptaeInterface adaptee;
    WeightInPounds(AdaptaeInterface adaptee){
        this.adaptee=adaptee;
    }
    @Override
    public int weightInPounds() {
        return (int) (adaptee.weightInKilo()*0.45);
    }
}
