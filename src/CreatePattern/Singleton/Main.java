package CreatePattern.Singleton;

/**
 * 单例模式主要有两种，懒汉是在使用时才初始化单例，饿汉在类加载时就把单例初始化了。
 * 懒汉是时间换空间，每次要判断，体现了延迟加载和缓存的思想，如果不用synchronized则线程不安全。
 * 饿汉是典型的空间换时间，不用判断，而且线程安全。
 * 静态内部类单例模式是一种改进，静态内部类只有在使用的时候才会被加载，实现了延迟加载，而且因为是静态的域，jvm保证了线程安全，拥有了懒汉饿汉二者的优点。
 * 枚举单例模式，其实枚举是单例的泛型化，已经成为实现单例最好的方法。
 * 本质：控制实例数目
 */
public class Main {
    public static void main(String[] args){
        LazySingleton singleton1 = LazySingleton.getInstance();
        HungrySingleton singleton2 = HungrySingleton.getInstance();
        InnerClassSingleton singleton3 = InnerClassSingleton.getInstance();
        Resource singleton4 = EnumSingleton.uniqueSingleton.getInstance();
        singleton1.run();
        singleton2.run();
        singleton3.run();
        singleton4.run();
    }
}
