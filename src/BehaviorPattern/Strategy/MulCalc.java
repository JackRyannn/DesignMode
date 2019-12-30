package BehaviorPattern.Strategy;

public class MulCalc implements ICalc {
    @Override
    public int calc(int a, int b) {
        return a*b;
    }
}
