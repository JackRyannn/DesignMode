package CreatePattern.Prototype;

/**
 * Prototype原型模式非常简单，就是克隆模式，创建对象的方式从new变成了clone。只要实现cloneable接口即可。
 * 优点：隐藏了具体实现的类型，保留了被克隆对象的一些参数（可用来初始化）
 * 缺点：必须实现Cloneable接口，而且对引用对象的递归复制是一件需要思考的问题。
 * 本质：克隆生成对象。
 */
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        ConcretePrototype prototype1 = new ConcretePrototype("1");
        ConcretePrototype prototype2 = (ConcretePrototype) prototype1.clone();
        prototype1.getId();
        prototype2.getId();
    }
}
