package CreatePattern.Singleton;

/**
 * Created by jackryannn on 18/3/28.
 */
public class InnerClassSingleton {
    private static class SingletonHolder{
        static InnerClassSingleton instance = new InnerClassSingleton();
    }
    public static InnerClassSingleton getInstance(){
        return SingletonHolder.instance;
    }
    public void run(){
        System.out.println("我是静态内部类单例模式");
    }
}
