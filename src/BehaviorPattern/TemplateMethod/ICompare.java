package BehaviorPattern.TemplateMethod;
//定义比较方法，最大值or最小值
public interface ICompare<T> {
    boolean compare(T a,T b);
}
