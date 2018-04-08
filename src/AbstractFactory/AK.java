package AbstractFactory;

/**
 * Created by jackryannn on 18/4/5.
 */
public class AK implements FactoryApi {
    @Override
    public void getGun() {
        System.out.println("得到AK47");
    }

    @Override
    public void getBullet() {
        System.out.println("得到AK47子弹");
    }
}
