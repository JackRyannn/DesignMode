package AbstractFactory;

/**
 * Created by jackryannn on 18/4/5.
 */
public class M4A1 implements FactoryApi {
    @Override
    public void getGun() {
        System.out.println("得到M4A1");
    }

    @Override
    public void getBullet() {
        System.out.println("得到M4A1的子弹");
    }
}
