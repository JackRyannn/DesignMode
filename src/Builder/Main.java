package Builder;

/**
 * Builder模式（创建者|生成器模式）使用场景：需要构建复杂的对象，且对象构建步骤多样。
 * 结构分为两部分：建造者和指挥者。这里我们分别孩子和家长来代替。孩子起床后可以吃饭刷牙，父母指挥其流程。
 * 优点：松散耦合，提高复用性，比较容易改变构造过程。
 * 缺点：麻烦啊马飞，专门创建一个类来指挥构建过程，其实是冗余。
 * 本质：分离整体构建算法和部件构造。
 */
public class Main {
    public static void main(String[] args){
        Child child1 = new Child("马骏");
        Child child2 = new Child("胖吹");
        Parent.abnormalDirect(child1);
        Parent.normalDirect(child2);
    }
}
