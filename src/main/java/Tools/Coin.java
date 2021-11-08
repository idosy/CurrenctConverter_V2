package Tools;

public abstract class Coin implements ICalculate{
    public abstract double getValue();

   @Override

    public double calculate(double input) {
       return input;
   }
}
