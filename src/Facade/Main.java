package Facade;

/**
 * Facade也叫外观模式，就是把多个模块的功能组合在一起，这样用户在使用时只需要执行一个run()即可。
 * 它非常简单，实现了松散用户和模块之间的耦合
 * 本质：封装交互，简化调用N
 */
public class Main {
    public static void main(String[] args){
        Facade.run();
    }
}
