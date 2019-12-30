package CreatePattern.Singleton;

/**
 * Created by jackryannn on 18/3/28.
 */
public class HungrySingleton {
    private HungrySingleton() {}
    private static HungrySingleton instance = new HungrySingleton();
    public static HungrySingleton getInstance(){
        return instance;
    }
    public void run(){
        System.out.println("我是饿汉单例模式");
    }
}
