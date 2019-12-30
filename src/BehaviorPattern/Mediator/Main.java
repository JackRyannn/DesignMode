package BehaviorPattern.Mediator;

/**
 * 中介者模式
 * 原理：就是用一个中介对象来封装多个对象之间的交互行为，比如租房者给出租者群发消息，相反出租者给租房者群发消息。这和中介很像，故名为中介者模式。
 */
public class Main {
    public static void main(String[] args){
        Mediator mediator = new Mediator();
//        租房者a b
        Renter a = new Renter("Renter_A",mediator);
        Renter b = new Renter("Renter_B",mediator);
//        出租者c d
        Saler c = new Saler("Saler_C",mediator);
        Saler d = new Saler("Saler_D",mediator);

//        租房者a发布消息
        a.send("我是A，我要求租一套单间");
//        出租者d发布消息
        d.send("我是D，我要出租一套别墅");


    }
}
