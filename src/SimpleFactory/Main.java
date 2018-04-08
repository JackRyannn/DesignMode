package SimpleFactory;

/**
 * 简单工厂模式优点在于实现了客户端和具体实现类的解耦，缺点是增加了代码复杂度。
 * 原理非常简单，把类的实现都放在一个CarFactory里，只暴露getCarByName()方法
 * 简单工厂不属于GOF里23种设计模式，而且因为包含了逻辑判断，每次扩展添加新的类都需要修改工厂代码，违背了开闭原则。但被广泛的使用。
 * 实质：选择实现
 */
public class Main {
    public static void main(String[] args){
        CarApi car = CarFactory.getCarByName("奔驰");
        car.run();
    }
}
