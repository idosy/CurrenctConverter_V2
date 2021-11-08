package Tools;

public class Ils extends Coin{

    private final double value = 0.28;

    @Override
    public double getValue(){
        return value;
    }
    @Override
    public double calculate(double input) {
        return input * getValue();
    }
}