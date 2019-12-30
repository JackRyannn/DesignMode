package CreatePattern.Factory.FactoryMethod;

/**
 * Created by jackryannn on 18/3/28.
 */
public class BlackBread implements FactoryApi{
    @Override
    public void getBread() {
        System.out.println("获得了黑面包");
    }
}
