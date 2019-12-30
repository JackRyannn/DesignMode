package BehaviorPattern.Strategy;

public class DIvCalc implements ICalc {
    @Override
    public int calc(int a, int b) {
        return a/b;
    }
}
