package Bridge;

/**
 * 桥接模式
 * 含义：将抽象部分和实现部分分离，可以各自独立变化
 * 举例：邮寄的物品有两种，信件和包裹，二者都有不同的邮寄方式，比如一日达和两日达，邮寄方式可以作为一个抽象的接口，
 *      信件和包裹对象本可以在类中实现该接口，但为了去耦合，可以将接口实现成一个具体的对象作为参数传进去，这样就实现了抽象部分和实现部分的分离。
 */
public class Main {
    public static void main(String[] args) {
        TwoDayPost post = new TwoDayPost();
        Parcel parcel = new Parcel(post);
        parcel.post();
    }
}
