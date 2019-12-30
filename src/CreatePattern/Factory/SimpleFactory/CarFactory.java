package CreatePattern.Factory.SimpleFactory;

/**
 * Created by jackryannn on 18/3/28.
 */
public class CarFactory {
    public static CarApi getCarByName(String s){
        CarApi car = null;
        if("奔驰".equals(s)){
            car = new Benz();
        }else if("宝马".equals(s)){
            car = new Bmw();
        }else{
            System.out.println("输入有误");
        }
        return car;
    }
}
