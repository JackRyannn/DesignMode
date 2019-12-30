package CreatePattern.Builder;

/**
 * Created by jackryannn on 18/4/5.
 */
public class Parent {
    public static void normalDirect(Child child){
        child.eat();
        child.brushTeeth();
    }
    public static void abnormalDirect(Child child){
        child.brushTeeth();
        child.eat();
    }
}
