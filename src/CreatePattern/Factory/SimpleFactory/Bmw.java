package CreatePattern.Factory.SimpleFactory;

/**
 * Created by jackryannn on 18/3/28.
 */
public class Bmw implements CarApi {
    @Override
    public void run() {
        System.out.println("宝马跑起来了！");
    }
}
