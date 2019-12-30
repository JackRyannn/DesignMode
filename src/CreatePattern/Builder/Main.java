package CreatePattern.Builder;

/**
 * 个人觉得使用率不高。
 * Builder模式（创建者|生成器模式）使用场景：需要构建复杂的对象，且对象构建步骤多样。
 * 结构分为两部分：建造者和指挥者。这里我们分别孩子和家长来代替。孩子起床后可以吃饭刷牙，父母指挥其流程，这样生成的孩子也是不同的。
 * 和工厂的区别：工厂也能产生对象，但生成的步骤不好控制，就拿抽象工厂里的枪举例。我想生产一把 先把子弹装进弹夹，再把弹夹按到AK47，再给AK47
 *      装上瞄准镜，最后擦亮。这些步骤放到指挥者来控制更方便。
 * 优点：松散耦合，提高复用性，比较容易改变构造过程。
 * 缺点：麻烦啊马飞，专门创建一个类来指挥构建过程，其实是冗余。
 * 本质：分离整体构建算法和部件构造。
 */
public class Main {
    public static void main(String[] args){
        Child child1 = new Child("马骏");
        Child child2 = new Child("瑶姐");
        Parent.abnormalDirect(child1);
        Parent.normalDirect(child2);
    }
}
