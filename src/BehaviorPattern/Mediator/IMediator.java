package BehaviorPattern.Mediator;

public interface IMediator {
    void addRenter(Renter renter);

    void addSaler(Saler saler);

    void send(Renter renter, String msg);

    void send(Saler saler, String msg);
}
