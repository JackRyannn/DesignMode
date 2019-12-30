package BehaviorPattern.Strategy;

/**
 * 策略模式
 * 原理：我们把不同的算法也当成一种可作为参数的对象（策略）。
 * 举例：我们传入一个加减乘除运算表达式，根据 + - * / 来找到对应的算法进行计算。
 * Select是选择器，可以作为算法的管理中心，根据表达式自动选择算法。
 */
public class Main {
    public static void main(String[] args) {
        Select s = new Select();
        int r = s.calc("9*3");
        System.out.println(r);
    }
}
