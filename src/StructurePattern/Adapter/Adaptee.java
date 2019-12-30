package StructurePattern.Adapter;

/**
 * Created by jackryannn on 18/3/28.
 */
public class Adaptee implements ElectricApi {
//    电源，提供110V电压的电
    public int electric = 110;
    public void run(){
        System.out.println("输出"+electric+"V电");
    }
}
