package BehaviorPattern.Mediator;

public class Saler implements IColleague {
    String name;
    Mediator mediator;

    public String getName() {
        return name;
    }

    public Saler(String name, Mediator mediator) {
        this.mediator = mediator;
        this.name = name;
        mediator.addSaler(this);
    }

    @Override
    public void send(String msg) {
        mediator.send(this,msg);
    }

    @Override
    public void receive(String msg) {
        System.out.println(getName()+" 收到了消息："+msg);
    }
}
