package Prototype;

/**
 * Created by jackryannn on 18/4/8.
 */
public abstract class Prototype implements Cloneable{
    private String id;

    public void getId() {
        System.out.println(id);
    }

    public Prototype(String id) {
        this.id = id;

    }
}
