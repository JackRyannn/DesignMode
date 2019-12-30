package CreatePattern.Singleton;

/**
 * Created by jackryannn on 18/3/28.
 */
public class LazySingleton {
    public static LazySingleton instance;
//    私有化构造方法，只能通过getInstance来获取单例
    private LazySingleton(){}
    public static LazySingleton getInstance(){
        if(instance == null){
            instance = new LazySingleton();
        }
        return instance;
    }
    public void run(){
        System.out.println("我是懒汉单例模式");
    }
}
