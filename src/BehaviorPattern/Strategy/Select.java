package BehaviorPattern.Strategy;

import java.util.StringTokenizer;

public class Select {
    ICalc obj;

    public int calc(String s){
        StringTokenizer st = new StringTokenizer(s,"+-*/",true);
        int a = Integer.valueOf(st.nextToken());
        String op = st.nextToken();
        if("+".equals(op)){
            obj = new AddCalc();
        }else if("-".equals(op)){
            obj = new MinusCalc();
        }else if("*".equals(op)){
            obj = new MulCalc();
        }else if("/".equals(op)){
            obj = new DIvCalc();
        }else{
            return Integer.MIN_VALUE;
        }
        int b = Integer.valueOf(st.nextToken());
        return obj.calc(a,b);
    }
}
