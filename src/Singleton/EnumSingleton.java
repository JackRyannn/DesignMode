package Singleton;

/**
 * Created by jackryannn on 18/3/28.
 */
class Resource{
    public void run(){
        System.out.println("我是枚举单例模式");
    }
}
public enum  EnumSingleton {
//   uniqueSingleton就是枚举的单例
    uniqueSingleton;
    private Resource instance;
    EnumSingleton(){
        instance = new Resource();
    }
    public Resource getInstance(){
        return instance;
    }
}
