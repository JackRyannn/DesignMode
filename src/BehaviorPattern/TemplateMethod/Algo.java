package BehaviorPattern.TemplateMethod;

/**
 * 泛型类,定义了算法的骨架
 * @param <T>
 */
public class Algo<T> {
    T getExtremum(T[] t,ICompare<T> cmp){
        T extremum = t[0];
        for (int i = 1; i < t.length; i++) {
            if(!cmp.compare(extremum,t[i])){
                extremum = t[i];
            }
        }
        return extremum;
    }
}
