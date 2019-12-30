package CreatePattern.Factory.SimpleFactory;

/**
 * Created by jackryannn on 18/3/28.
 */
public class Benz implements CarApi {
    @Override
    public void run() {
        System.out.println("奔驰车跑起来了！");
    }
}
