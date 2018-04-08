package AbstractFactory;

/**
 * 抽象工厂类和工厂方法类很相似，结构都一样，除了在interface里，工厂方法只有一个抽象方法，而抽象工厂有多个抽象方法
 * 这多个抽象方法的意义就在于把产品之间的关系抽象化了，有些产品是有关系的，比如ak47和ak的子弹，这就是一个产品簇
 * 优点：切换产品簇变得容易，分离了接口和实现
 * 缺点：和优点一样相辅相生，关系制定后，再改变关系则要改所有的实现类。造成了类层次复杂。
 * 本质：选择产品簇的实现。
 */
public class Main {
    public static void main(String[] args){
        FactoryApi A = new AK();
        FactoryApi M = new M4A1();
        A.getGun();
        A.getBullet();
        M.getGun();
        M.getBullet();
    }
}
