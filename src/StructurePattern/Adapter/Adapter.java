package StructurePattern.Adapter;

/**
 * Created by jackryannn on 18/3/28.
 */
public class Adapter implements ElectricApi{
    public int electric;
    public Adapter(Adaptee adaptee) {
//        在此进行调整并完成适配
        electric = adaptee.electric * 2;
    }
    public void run(){
        System.out.println("输出"+electric+"V电");
    }
}
