package Prototype;

/**
 * Created by jackryannn on 18/4/8.
 */
public class ConcretePrototype extends Prototype{

    public ConcretePrototype(String id) {
        super(id);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
