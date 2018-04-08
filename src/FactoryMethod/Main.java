package FactoryMethod;

/**
 * 工厂方法模式，它是简单工厂的升级版，它把工厂抽象成接口，每个产品都成为符合工厂接口的小工厂，然后直接用小工厂的方法返回产品。
 * 优点：相对于简单工厂，添加一个新产品只需要添加一个类，而不需要添加逻辑判断。
 * 缺点：产品对象和工厂是耦合的，我这里并没有产品类，我就用了println输出了一个假的产品，实际上这个产品和工厂是耦合的。
 * 本质：延迟到子类来实现选择。
 * 依赖倒置/控制反转思想：获得面包本来是依赖于 有哪些面包。然而在工厂方法模式中，具体的面包由具体的工厂制作，具体的工厂由工厂接口规范，这就是依赖的倒置，松耦合。
 */
public class Main {
    public static void main(String[] args){
        FactoryApi blackBread = new BlackBread();
        FactoryApi whiteBread = new WhiteBread();
        blackBread.getBread();
        whiteBread.getBread();
    }
}
