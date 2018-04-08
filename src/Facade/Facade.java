package Facade;

/**
 * Created by jackryannn on 18/3/28.
 */
public class Facade {

    public static void run(){
        AModule A = new AModule();
        BModule B = new BModule();
        CModule C = new CModule();
        A.run();
        B.run();
        C.run();
    }
}
