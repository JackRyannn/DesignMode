package StructurePattern.Adapter;

/**
 * 适配器模式，目的是将被适配的Adaptee传入适配器Adapter里，经过处理得到满足ElectricApi规范的，可以被用户使用的接口。
 * 适配器是为了实现更多的复用，原来的功能已经实现但是现在因为不兼容而不能使用，利用适配器模式可以解决。
 * 举例：产生110V电其实是非常复杂的功能，我们不方便重写，但我们需要产生220V，因此可以复用该方法，但最后执行的方法是适配器的run方法。
 * 缺点：使用太多会造成系统非常混乱。
 * 本质：转换匹配，复用功能。
 */
public class Main {
    public static void main(String[] args){
        Adaptee adaptee = new Adaptee();
        ElectricApi adapter = new Adapter(adaptee);
        adapter.run();
    }
}
