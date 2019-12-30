package BehaviorPattern.Strategy;

public class AddCalc implements ICalc {
    @Override
    public int calc(int a, int b) {
        return a+b;
    }
}
