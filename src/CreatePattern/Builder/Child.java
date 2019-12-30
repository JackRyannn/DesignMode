package CreatePattern.Builder;

/**
 * Created by jackryannn on 18/4/5.
 */
public class Child implements ChildApi {
    String name;

    public Child(String name) {
        this.name = name;
    }

    @Override
    public void brushTeeth() {
        System.out.println(name+"刷牙了");
    }

    @Override
    public void eat() {
        System.out.println(name+"吃饭了");
    }
}
