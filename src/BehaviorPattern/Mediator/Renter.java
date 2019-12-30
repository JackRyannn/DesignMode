package BehaviorPattern.Mediator;

public class Renter implements IColleague {
    String name;
    Mediator mediator;

    public String getName() {
        return name;
    }

    public Renter(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
        mediator.addRenter(this);
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
