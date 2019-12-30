package BehaviorPattern.Strategy;

public class MinusCalc implements ICalc {
    @Override
    public int calc(int a, int b) {
        return a-b;
    }
}
