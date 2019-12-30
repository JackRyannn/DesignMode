package BehaviorPattern.ResponsibilityChain;

/**
 * 责任链模式，有多个对象可以处理请求，它们形成一条链，依次处理直到处理完成或者走完链表。
 * 优点：解决了这类逻辑问题，断开请求处理者和请求之间的耦合关系。
 * 举例：工人请假审批流，小于两天组长可以通过。大于两天小于七天，主任可以通过。大于七天经理可以通过。
 * 技术解析：主要用到了回调方法，Chain调用Filter里的doFilter，Filter里的doFilter视情况再回调Chain里的doFilter。这是一种实现方法，并非最简单的。
 */

class ZuZhangFilter implements Filter{

    @Override
    public void doFilter(Request request,ResponsibilityChain chain) {
        if(request.days<=2){
            System.out.println("组长审批通过！");
            return;
        }else{
            System.out.println("大于2天，组长无权审批通过！上交主任。");
            chain.doFilter(request,chain);
        }
    }
}
class ZhuRenFilter implements Filter{

    @Override
    public void doFilter(Request request,ResponsibilityChain chain) {
        if(request.days<=7){
            System.out.println("主任审批通过");
            return;
        }else{
            System.out.println("大于7天，主任无权审批通过！上交经理。");
            chain.doFilter(request,chain);
        }
    }
}
class JingLiFilter implements Filter{

    @Override
    public void doFilter(Request request,ResponsibilityChain chain) {
        System.out.println("经理审批通过！");
    }
}

public class  Main {
    public static void main(String[] args) {
        ResponsibilityChain myChain = new ResponsibilityChain();
        myChain.addFilter(new ZuZhangFilter());
        myChain.addFilter(new ZhuRenFilter());
        myChain.addFilter(new JingLiFilter());
//        设置请假天数
        Request request = new Request(8);
        myChain.doFilter(request,myChain);
    }
}
